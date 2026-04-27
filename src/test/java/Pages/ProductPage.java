package Pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class ProductPage {

    private Page page;
    private Locator buyNowBtn;

    public ProductPage(Page page){
        this.page = page;
        this.buyNowBtn = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Buy Now"));
    }

    public void clickBuyNowBtn(){
        buyNowBtn.click();
    }
}
