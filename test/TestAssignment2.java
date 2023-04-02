import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.api.BeforeAll;

import java.util.List;

public class TestAssignment2 {
    static final String baseDir = "/workspaces/assignment2/csv/";
    static final String anagramTests = baseDir + "anagramTests.csv";

    @BeforeAll
    public static void prepareFiles() {
        String anagramTests = "https://docs.google.com/spreadsheets/d/e/2PACX-1vRmL8b78ABiAtM5sgbHrgMWvLl1LvhX-kwN54mjB2TC-goKYedPlHDm-oF9NQi8IvHM0_Iix7sn7bwy/pub?gid=0&single=true&output=csv";
        FileDownloader.downloadFile(anagramTests, baseDir+"anagramTests.csv");

    }

    @ParameterizedTest
    @CsvFileSource(files = anagramTests, numLinesToSkip = 1)
    public void testAnagrams(String word1, String word2, boolean anagram) {
        assert Assignment2.isAnagram(word1, word2) == anagram;
    }

}
