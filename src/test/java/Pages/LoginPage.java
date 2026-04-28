package Pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class LoginPage {

    private Page page;
    private final Locator email;
    private final Locator password;
    private final Locator logInBtn;

    public LoginPage(Page page){
        this.page = page;
        this.email = page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Please enter your Phone or"));
        this.password = page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Please enter your password"));
        this.logInBtn = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("LOGIN"));
    }

    public void enterEmail(String emailIn){
        email.fill(emailIn);
    }

    public void enterPassword(String pass){
        password.fill(pass);
    }

    public void clickLoginBtn(){
        logInBtn.click();
    }
}
