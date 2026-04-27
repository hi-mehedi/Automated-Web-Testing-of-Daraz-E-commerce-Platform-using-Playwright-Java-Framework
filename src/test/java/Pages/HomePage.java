package Pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;


public class HomePage {

    private Page page;
    private Locator logInLink;
    private Locator verifyName;
    private Locator searchIn;
    private Locator searchBtn;


    public HomePage(Page page){
        this.page = page;
        this.logInLink = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Login"));
        this.verifyName = page.locator("#myAccountTrigger");
        this.searchIn = page.getByRole(AriaRole.SEARCHBOX, new Page.GetByRoleOptions().setName("Search in Daraz"));
        this.searchBtn = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("SEARCH"));
    }

    public void clickLoginLink(){
        logInLink.click();
    }

    public Locator getVerifyName(){
        return verifyName;
    }

    public void enterSearchIn(String inputSearch){
        searchIn.fill(inputSearch);
    }

    public void clickSearchBtn(){
        searchBtn.click();
    }
}
