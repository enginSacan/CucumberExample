import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginPage extends BaseTest {
    private String usernameId = "txtUserName";
    private String passwordId = "txtPassword";
    private String loginBtnId = "btnLogin";
    private String user = "abc@abc.com";
    private String pass = "";
    private String searchBarId = "SearchBoxOld";

    protected boolean userLogin () {
        try {
            WebElement userName = findElement(By.id(usernameId));
            userName.sendKeys(user);
            WebElement passWord = findElement(By.id(passwordId));
            passWord.sendKeys(pass);
            WebElement loginBtn = findElement(By.id(loginBtnId));
            clickElement(loginBtn);
            WebElement searchBar = findElement(By.id(searchBarId));

        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
}
