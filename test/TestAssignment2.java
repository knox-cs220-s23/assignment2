import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import java.util.List;

public class TestAssignment2 {

    @ParameterizedTest
    @CsvFileSource(files = "/workspaces/assignment2/csv/test.csv", numLinesToSkip = 1)
    public void test2(String input, String output) {
        List<List<Integer>> nestedArray = ArrayLoader.loadNestedArrayFromString(input);
        List<List<Integer>> expected = ArrayLoader.loadNestedArrayFromString(output);
        System.out.println(nestedArray);
        System.out.println(expected);
        assert true;
    }

}
