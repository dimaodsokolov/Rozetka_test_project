import org.testng.Assert;
import org.testng.annotations.Test;
import rozetka.Pages.GoodsPage;
import rozetka.Pages.MainPage;
import rozetka.Pages.SearchPage;

public class SearchPageTest extends BaseTest {
    private MainPage mainPage;
    private SearchPage searchPage;
    private GoodsPage headPhonesPage;

    @Test(description = "fill and find goods")
    public void testSearch() {
        mainPage = new MainPage(chrome);

        mainPage.fillSearchField();
        searchPage = mainPage.openSearchPage();
        headPhonesPage = searchPage.clickHeadPhonesCart();

        Assert.assertTrue(headPhonesPage.isBuyButtonDisplayed(),"Should contain buy button");
    }
}
