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
    @FindBy(xpath = "//img[@src='https://anywhere.ebay.com/resources/images/storeBadges/new/ios-en.png']")
    WebElement appStoreButton;
    @FindBy(xpath ="//img[@src='https://anywhere.ebay.com/resources/images/storeBadges/new/android-en.png']")
    WebElement playStoreButton;


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
    public void businessLink(){
        clickByXpath("//a[@_sp='p.2380787.s.8591']");
    }
    public void appStoreButtonClick(){
        appStoreButton.click();
    }
    public void playStoreButtonClick(){
        playStoreButton.click();

    }



}
