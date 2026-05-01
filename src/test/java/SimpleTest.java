import org.testng.annotations.Test;

public class SimpleTest {

    @Test
    public void myFirstTest() {
        System.out.println("Hello Jenkins! This test passed.");
    }

    @Test
    public void mySecondTest() {
        System.out.println("Another test that also passes.");
    }
}