package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

//Selling on eBay | Electronics, Fashion, Home &amp; Garden | eBay
public class SellPage extends CommonAPI {

    public SellPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#smac_complete")
    WebElement searchBox;

    public void checkUrl(){
        String title = driver.getTitle();
        Assert.assertEquals(title, "Selling on eBay | Electronics, Fashion, Home & Garden | eBay");
    }
    public void checkTitle(){
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/sl/sell");
    }
    public void checkSearchBox(){
        searchBox.sendKeys("macbook pro");
        clickByXpath("//button[@id='hero-keyword_searchBox-2[0]']");
    }


}
