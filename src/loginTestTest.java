import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginTestTest {

    @BeforeMethod
    public void setUp() throws Exception {
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://www.google.co.in");

    }

    @Test
    public  void sampleTest() throws Exception
    {
        System.out.println("Hello World");
    }

    @AfterMethod
    public void tearDown() throws Exception {

    }
}