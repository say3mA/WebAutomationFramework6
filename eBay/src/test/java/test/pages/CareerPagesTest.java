package test.pages;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CareersPage;
import pages.HomePage;
import pages.SellPage;

public class CareerPagesTest extends CareersPage {

    CareersPage careerspage;
    HomePage homepage;
    @BeforeMethod
    public void initialize(){
        homepage = new HomePage();
        this.careerspage = homepage.careersClick();
    }
    @Test
    public void properUrl(){
        Assert.assertEquals(driver.getCurrentUrl(), "https://careers.ebayinc.com/join-our-team/start-your-search/");
    }
    @Test
    public void checkTitle(){
        Assert.assertEquals(driver.getTitle(), "Start Your Search - eBay Inc. Careers");
    }
    @Test
    public void engineersLink(){

    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
