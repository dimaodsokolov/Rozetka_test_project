import org.testng.annotations.Test;
import rozetka.Pages.MainPage;

public class SearchPageTest extends BaseTest {
    private MainPage mainPage;
    private SearchPageTest searchPageTest;
    @Test(description = "fill and find goods")
    public void testSearch(){
        mainPage = new MainPage(chrome);

        mainPage.fillSearchField();
        mainPage.openSearchPage();
    }
}
