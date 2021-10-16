import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BaseTest{

    private String loginBtnId = "login";
    private String searchBarXpath = "//input[@class='desktopOldAutosuggestTheme-input']";
    private String searchBtnXpath = "//div[@class='SearchBoxOld-buttonContainer']";
    private String loginPartXpath = "//span[@title='Giriş Yap']";
    private String categoryKFMHXpath = "//li[@class='sf-MenuItems-1-U3X']//span//span[contains(text(),'Kitap, Müzik, Film, Hobi')]";
    private String tabUZAraclarXpath = "//a[contains(@class,'sf-ChildMenuItems-3R6bj')]//span[contains(text(),'Uzaktan Kumandalı Araçlar')]";
    private String droneYDPXpath = "//div[@class='content-label'][contains(text(),'Drone Yedek Parçaları')]";
    protected boolean clickUserLogin () {
        try {
            WebElement loginPart = findElement(By.xpath(loginPartXpath));
            hoverElement(loginPart);
            WebElement loginButton = findElement(By.id(loginBtnId));
            clickElement(loginButton);
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
    protected boolean searchProduct (String product) {
        try {
            WebElement searchBar = findElement(By.xpath(searchBarXpath));
            searchBar.sendKeys(product);
            clickElement(findElement(By.xpath(searchBtnXpath)));

        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
    protected boolean getCategoryPopup(String category) {
        try {
            if (category.equals("Hobi")) {
                WebElement categoryChosen = findElement(By.xpath(categoryKFMHXpath));
                hoverElement(categoryChosen);
            }
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
    protected boolean clickTab(String tab) {
        try {
            if (tab.equals("Uzaktan Kumandalı Araçlar")) {
                WebElement tabChosen = findElement(By.xpath(tabUZAraclarXpath));
                clickElement(tabChosen);
            }
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    protected boolean chooseCategory(String category) {
        try {
            if (category.equals("Drone Yedek Parçaları")) {
                WebElement cateChosen = findElement(By.xpath(droneYDPXpath));
                clickElement(cateChosen);
            }
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

}
