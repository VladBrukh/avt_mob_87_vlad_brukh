import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetClassString() {

        String test_string = this.getClassString();

        Assert.assertTrue("None of the substrings \"Hello\" or \"hello\" were found in the string \"Hello, world\"",
                test_string.contains("Hello")
                  || test_string.contains("hello"));
    }
}
