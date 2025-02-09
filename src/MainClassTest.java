import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetLocalNumber() {

        int test_number = this.getLocalNumber();
        Assert.assertTrue("test_number != 14", test_number == 14);
    }
}
