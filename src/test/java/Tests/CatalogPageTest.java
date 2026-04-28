package Tests;

import Base.BaseTest;
import Pages.CatalogPage;
import Pages.HomePage;
import org.testng.annotations.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class CatalogPageTest extends BaseTest {
    String searchP = "I phone 17 pro max";

    @Test
    public void testCatalog(){
        HomePage homePage = new HomePage(getPage());
        CatalogPage catalogPage = new CatalogPage(getPage());
        test.info("Search Product");
        homePage.enterSearchIn(searchP);
        test.info("Click Search");
        homePage.clickSearchBtn();
        test.info("Hover Category Product");
        catalogPage.clickCategory();
        test.info("Hover eDevice Product");
        catalogPage.clickEDevice();
        test.info("Hover SmartPhone");
        catalogPage.clickSmartPhone();
        test.info("Click Apple");
        catalogPage.clickApple();
        test.info("Verify product");
        assertThat(catalogPage.verifyGetName()).hasText("Apple Phones");
    }
}
