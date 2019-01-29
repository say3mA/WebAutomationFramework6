package test.pages;

import com.relevantcodes.extentreports.ExtentReports;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SellPage;
import reporting.ExtentManager;

public class SellPageTest extends SellPage {

    SellPage sellpage;
    HomePage homepage;
    ExtentReports report;
    @BeforeMethod
    public void initialize(){
        homepage = new HomePage();
        this.sellpage = homepage.sellPageClick();
        report = ExtentManager.getInstance();

    }
//    @Test
//    public void verifyTitle(){
//        sellpage.checkUrl();
//    }
//    @Test
//    public void properUrl(){
//        sellpage.checkTitle();
//    }
//    @Test
//    public void checkSearchBoxTest(){
//        sellpage.checkSearchBox();
//    }
//    @Test
//    public void checkBusinessLink(){
//        sellpage.businessLink();
//    }
    @Test
    public void checkAppStore(){
        sellpage.appStoreButtonClick();
    }
    @Test
    public void checkPlayStore(){
        sellpage.playStoreButtonClick();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
