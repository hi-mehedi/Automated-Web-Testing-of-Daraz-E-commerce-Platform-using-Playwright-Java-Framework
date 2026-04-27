package Tests;

import Base.BaseTest;
import Pages.CatalogPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProductPage;
import Utils.ExcelUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProductPageTest extends BaseTest {

    String searchP = "I phone 17 pro max";

    @DataProvider(name = "DarazLoginData")
    public Object[][] getLoginData() {

        String excelPath = "src/TestData.xlsx";
        String sheetName = "Sheet1";

        return ExcelUtils.getSheetData(excelPath, sheetName);
    }

    @Test(dataProvider = "DarazLoginData")
    public void TestProduct(String emailIn, String pass){
        HomePage homePage = new HomePage(page);
        CatalogPage catalogPage = new CatalogPage(page);
        ProductPage productPage = new ProductPage(page);
        LoginPage loginPage = new LoginPage(page);
        test.info("Click Login Link");
        homePage.clickLoginLink();
        test.info("Enter email");
        loginPage.enterEmail(emailIn);
        test.info("Enter pass");
        loginPage.enterPassword(pass);
        test.info("Click Login Btn");
        loginPage.clickLoginBtn();
        test.info("Search Product");
        homePage.enterSearchIn(searchP);
        test.info("Click Search Btn");
        homePage.clickSearchBtn();
        test.info("Click Product");
        catalogPage.clickProduct();
        test.info("Click Buy Now Btn");
        productPage.clickBuyNowBtn();
    }
}
