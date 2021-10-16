import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;

public class ProductPage extends BaseTest{
        private String productDetailXpath = "//div[@class='product-detail']";
        private String addCartBtnXpath = "//button[@class='add-to-basket button small']";
        private String sellersTabId = "merchantTabTrigger";
        public boolean selectOneRandomProduct() {
            try {
                Random rand = new Random();
                List<WebElement> productDetails = findElements(By.xpath(productDetailXpath));
                int randomProductIndex = rand.nextInt(productDetails.size());
                clickElement(productDetails.get(randomProductIndex));
            } catch (NotFoundException e) {
                System.out.println(e.getMessage());
                return false;
            }
            return true;
        }
        public boolean selectRandomDifferentSeller() {
            try {
                WebElement sellersTab = findElement(By.id(sellersTabId));
                clickElement(sellersTab);
                List<WebElement> addButtons = findElements(By.xpath(addCartBtnXpath));
                Random rand = new Random();
                int randomAddBtnIndex = rand.nextInt(addButtons.size());
                clickElement(addButtons.get(randomAddBtnIndex));
            } catch (NotFoundException e) {
                System.out.println(e.getMessage());
                return false;
            }
            return true;
        }
        public boolean addProductToCart() {
            try {
                Random rand = new Random();
                List<WebElement> productDetails = findElements(By.xpath(productDetailXpath));
                int randomProductIndex = rand.nextInt(productDetails.size());
                hoverElement(productDetails.get(randomProductIndex));
                WebElement addCart = findElement(By.xpath(addCartBtnXpath));
                clickElement(addCart);
            } catch (NotFoundException e) {
                System.out.println(e.getMessage());
                return false;
            }
            return true;
        }
}
