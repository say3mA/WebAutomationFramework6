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
//    @Test
//    public void properUrl()throws InterruptedException{
//        careerspage.checkUrl();
//    }
//    @Test
//    public void properTitle() throws InterruptedException{
//        careerspage.checkTitle();
//    }
//    @Test
//    public void engineersLink(){
//        careerspage.engineeringClick();
//    }
//    @Test
//    public void careersSearchTest(){
//        careerspage.searchCareer("Automation Engineer");
//    }
//    @Test
//    public void ebayLogoValidation(){
//        careerspage.eBayLogoIsThere();
//    }
//    @Test
//    public void companyLinkTest(){
//        careerspage.ourCompanyClick();
//    }
//    @Test
//    public void discoverJobsTest(){
//        careerspage.discoverJobsLink();
//    }
//    @Test
//    public void findRightFitTest(){
//        careerspage.findRightFitClick();
//    }
//    @Test
//    public void buildOpportunityLinkTest(){
//        careerspage.buildOpportunityLink();
//    }
//    @Test
//    public void viewOpenPositionsTest(){
//        careerspage.viewOpenPositions();
//    }
//    @Test
//    public void learnWhoWeAreTest(){
//        careerspage.learnWhoWeAreClick();
//    }
//    @Test
//    public void ourBenefitsLinkTest(){
//        careerspage.ourBenefitsClick();
//    }
//    @Test
//    public void getStartedLinkTest(){
//        careerspage.getStartedNowLink();
//    }
//    @Test
//    public void mainSearchButtonTest(){
//        careerspage.mainSearchButton();
//    }
//    @Test
//    public void studentsImageIsThereTest(){
//        careerspage.studentsImage();
//    }
//    @Test
//    public void impactLinkTest(){
//        careerspage.impactLink();
//    }
//    @Test
//    public void twitterLinkTest(){
//        careerspage.twitterLink();
//    }
    @Test
    public void facebookLinkTest(){
        careerspage.facebookLink();
    }
    @Test
    public void instagramLinkTest(){
        careerspage.instagramLink();
    }
    @Test
    public void linkedInTest(){
        careerspage.linkedInLink();
    }
    @Test
    public void glassdoorTest(){
        careerspage.glassdoorLink();
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
