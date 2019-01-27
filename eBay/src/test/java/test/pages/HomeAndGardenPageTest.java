package test.pages;


import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomeAndGardenPage;
import pages.HomePage;

public class HomeAndGardenPageTest extends HomeAndGardenPage {

    HomeAndGardenPage hngpage;
    HomePage homepage;

    @BeforeMethod
    public void initialize() throws InterruptedException {
        this.homepage = new HomePage();
        hngpage = homepage.HomeAndGardenClick();
    }

    @Test
    public void categoryCheckTest() {
        hngpage.checkDropdown();
        ;
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
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}

