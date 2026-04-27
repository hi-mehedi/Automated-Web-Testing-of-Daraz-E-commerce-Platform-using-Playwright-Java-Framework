package Tests;

import Base.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import Utils.ExcelUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class LoginPageTest extends BaseTest {

    @DataProvider(name = "DarazLoginData")
    public Object[][] getLoginData() {

        String excelPath = "src/TestData.xlsx";
        String sheetName = "Sheet1";

        return ExcelUtils.getSheetData(excelPath, sheetName);
    }

    @Test(dataProvider = "DarazLoginData")
    public void TestLoginPage(String emailIn, String pass){
        HomePage homePage = new HomePage(page);
        LoginPage loginPage = new LoginPage(page);
        test.info("Click Login Link");
        homePage.clickLoginLink();
        test.info("Enter Email");
        loginPage.enterEmail(emailIn);
        test.info("Enter Pass");
        loginPage.enterPassword(pass);
        test.info("Click Login Btn");
        loginPage.clickLoginBtn();
        test.info("Verify user");
        assertThat(homePage.getVerifyName()).containsText("mehedihasan");
    }

}
