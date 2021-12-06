package rozetka.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoodsPage {
    public WebDriver driver;
    private  final static String buyButton = ".buy-button.button_color_green"; /*почему сработало через static вместо селектора */
   /* @FindBy(css = ".buy-button.button_color_green")
    private WebElement buyButton;
*/
    public GoodsPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isBuyButtonDisplayed() {
        return
                new WebDriverWait(driver,30)
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector(buyButton)))
                .isDisplayed();
    }
}
