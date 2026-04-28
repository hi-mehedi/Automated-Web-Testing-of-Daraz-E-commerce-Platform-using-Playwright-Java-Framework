package Tests;

import Base.BaseTest;
import Pages.HomePage;

public class HomePageTest extends BaseTest {

    public void TestHomePage(){
        HomePage homePage = new HomePage(getPage());
        homePage.clickLoginLink();
    }
}
