import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/features/CartAdding.feature"
        ,glue={""}
)
public class TestRunner extends BaseTest{
    @BeforeClass
    public static void before() {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void after() {
        driver.quit();
    }
}