package test.pages;

import com.relevantcodes.extentreports.ExtentReports;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CareersPage;
import pages.HomePage;
import reporting.ExtentManager;
import utility.MyDataReader;

public class HomePageTest extends HomePage {

    HomePage homepage=null;
    ExtentReports report;
    MyDataReader reader;
    String path = "/Users/MacUser/IdeaProjects/comseleniumfrmwrk/eBay/src/test/java/test/pages/TestFiles/TestData.xlsx";

    @BeforeMethod
    public void initialization() throws Exception {
        this.homepage = new HomePage();
        report = ExtentManager.getInstance();
        this.reader = new MyDataReader();
        reader.setExcelFile(path);

    }
/*
    @Test
    public CareersPage careersLinkTest(){
        homepage.careersClick();
        return new CareersPage();
    }*/

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
