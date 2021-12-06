package rozetka.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SearchPage {
    private  WebDriver driver;

    private  final static String LinkText = "//a[@title='Наушники Sennheiser HD 458 BT Black (508968) (F00241407) ']";
    @FindBy (xpath = "//a[@title='Наушники Sennheiser HD 458 BT Black (508968) (F00241407) ']")
    private WebElement headPhonesCart;



    public SearchPage(WebDriver driver){
        this.driver = driver;
    }

    public GoodsPage clickHeadPhonesCart(){
        new WebDriverWait(driver,10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LinkText)))
                .click();
        return new GoodsPage(this.driver);
    }


}
