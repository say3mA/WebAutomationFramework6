package test.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SellPage;

public class SellPageTest extends SellPage {

    SellPage sellpage;
    HomePage homepage;
    @BeforeMethod
    public void initialize(){
        homepage = new HomePage();
        this.sellpage = homepage.sellPageClick();
    }
    @Test
    public void verifyTitle(){
        String title = driver.getTitle();
        Assert.assertEquals(title, "Selling on eBay | Electronics, Fashion, Home &amp; Garden | eBay");
    }
    public void properUrl(){
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/sl/sell");
    }

}
