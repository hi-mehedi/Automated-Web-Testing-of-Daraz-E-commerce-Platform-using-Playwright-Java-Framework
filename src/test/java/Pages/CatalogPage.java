package Pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class CatalogPage {

    private Page page;
    private final Locator product;
    private final Locator category;
    private final Locator eDevice;
    private final Locator smartPhone;
    private final Locator apple;
    private final Locator getName;

    public CatalogPage(Page page){
        this.page = page;
        this.product = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("iPhone 17 Pro max 256GB |")).first();
        this.category = page.getByText("Categories");
        this.eDevice = page.getByText("Electronics Device");
        this.smartPhone = page.getByText("Smartphones");
        this.apple = page.getByText("Apple Phones");
        this.getName = page.locator(".JrAyI");
    }

    public void clickProduct(){
        product.waitFor();
        product.click();
    }

    public void clickCategory(){
        page.waitForLoadState();
        category.hover();
    }

    public void clickEDevice(){
        page.waitForLoadState();
        eDevice.hover();
    }

    public void clickSmartPhone(){
        page.waitForLoadState();
        smartPhone.hover();
    }

    public void clickApple(){
        apple.waitFor();
        apple.click();
    }

    public Locator verifyGetName(){
        return getName;
    }
}
