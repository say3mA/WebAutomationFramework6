package test.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
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
        sellpage.checkUrl();
    }
    @Test
    public void properUrl(){
        sellpage.checkTitle();
    }
    @Test
    public void checkSearchBoxTest(){
        sellpage.checkSearchBox();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
