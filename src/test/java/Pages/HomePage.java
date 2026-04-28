package Pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;


public class HomePage {

    private Page page;
    private final Locator logInLink;
    private final Locator verifyName;
    private final Locator searchIn;
    private final Locator searchBtn;


    public HomePage(Page page){
        this.page = page;
        this.logInLink = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Login"));
        this.verifyName = page.locator("#myAccountTrigger");
        this.searchIn = page.locator("#q");
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
