package test.pages;


import com.relevantcodes.extentreports.ExtentReports;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomeAndGardenPage;
import pages.HomePage;
import reporting.ExtentManager;

public class HomeAndGardenPageTest extends HomeAndGardenPage {

    HomeAndGardenPage hngpage;
    HomePage homepage;
    ExtentReports report;

    @BeforeMethod
    public void initialize() throws InterruptedException {
        this.homepage = new HomePage();
        hngpage = homepage.HomeAndGardenClick();
        report = ExtentManager.getInstance();

    }

    @Test
    public void categoryCheckTest() {
        hngpage.checkDropdown();

    }
    @Test
    public void properUrlTest() {
        hngpage.checkUrl();
    }
    @Test
    public void checkTitleTest() {
        hngpage.checkTitle();
    }
    @Test
    public void checkEbayLogoTest() {
        hngpage.checkEbayLogo();
    }
    @Test
    public void checkSearchTest(){
        hngpage.checkSearch();
    }
    @Test
    public void advancedLinkTest(){
        hngpage.advancedLinkClick();
    }
    @Test
    public void amountOfShopCategoriesTest(){
        hngpage.amountOfCategories();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}

