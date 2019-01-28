package test.pages;

import com.relevantcodes.extentreports.ExtentReports;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CareersPage;
import pages.HomePage;
import pages.SellPage;
import reporting.ExtentManager;

public class CareerPagesTest extends CareersPage {

    CareersPage careerspage;
    HomePage homepage;
    ExtentReports report;

    @BeforeMethod
    public void initialize(){
        homepage = new HomePage();
        this.careerspage = homepage.careersPageClick();
        report = ExtentManager.getInstance();

    }
    @Test
    public void properUrl()throws InterruptedException{
        careerspage.checkUrl();
    }
    @Test
    public void properTitle() throws InterruptedException{
        careerspage.checkTitle();
    }
    @Test
    public void engineersLink(){
        careerspage.engineeringClick();
    }
    @Test
    public void careersSearchTest(){
        careerspage.searchCareer("Automation Engineer");
    }
    @Test
    public void ebayLogoValidation(){
        careerspage.eBayLogoIsThere();
    }
    @Test
    public void companyLinkTest(){
        careerspage.ourCompanyClick();
    }
    @Test
    public void discoverJobsTest(){
        careerspage.discoverJobsLink();
    }
    @Test
    public void findRightFitTest(){
        careerspage.findRightFitClick();
    }
    @Test
    public void buildOpportunityLinkTest(){
        careerspage.buildOpportunityLink();
    }
    @Test
    public void viewOpenPositionsTest(){
        careerspage.viewOpenPositions();
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
