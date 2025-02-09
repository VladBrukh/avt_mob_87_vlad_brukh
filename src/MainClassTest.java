import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetClassNumber() {

        int test_number = this.getClassNumber();
        Assert.assertTrue("test_number cannot be > 45", test_number > 45);
    }
}
