package Pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class CatalogPage {

    private Page page;
    private Locator product;
    private Locator category;
    private Locator eDevice;
    private Locator smartPhone;
    private Locator apple;
    private Locator getName;

    public CatalogPage(Page page){
        this.page = page;
        this.product = page.getByText("iPhone 17 Pro max 256GB | 512GB | 1TB (Physical Sim + e-Sim)");
        this.category = page.getByText("Categories");
        this.eDevice = page.getByText("Electronics Device");
        this.smartPhone = page.getByText("Smartphones");
        this.apple = page.getByText("Apple Phones");
        this.getName = page.locator(".JrAyI");
    }

    public void clickProduct(){
        product.click();
    }

    public void clickCategory(){
        category.hover();
    }

    public void clickEDevice(){
        eDevice.hover();
    }

    public void clickSmartPhone(){
        smartPhone.hover();
    }

    public void clickApple(){
        apple.click();
    }

    public Locator verifyGetName(){
        return getName;
    }
}
