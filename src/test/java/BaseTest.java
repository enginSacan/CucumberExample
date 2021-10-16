import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    private int timeoutInSeconds = 10;
    protected static  WebDriver driver;

    protected WebElement findElement(By by)  throws NotFoundException {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return driver.findElement(by);
    }
    protected List<WebElement> findElements(By by)  throws NotFoundException {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return driver.findElements(by);
    }

    protected void clickElement(WebElement element) throws NotFoundException {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
    protected void hoverElement (WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }
    protected void goToPage(String website) throws NotFoundException {

        driver.navigate().to("https://" + website);
    }



}
