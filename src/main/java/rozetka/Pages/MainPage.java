package rozetka.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    private  WebDriver driver;

    private  String goodsName = "наушники";

    @FindBy(name = "search")
    private WebElement searchField;

    @FindBy (xpath = "//button[contains(@class, 'search-form__submit')]")
    private WebElement searchButton;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void fillSearchField(){
        searchField.clear();
        searchField.sendKeys(goodsName);
    }
    public MainPage openSearchPage(){
        searchButton.click();
        return this;
    }
}
