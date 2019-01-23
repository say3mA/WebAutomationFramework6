package test.pages;


import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomeAndGardenPage;
import pages.HomePage;

public class HomeAndGardenPageTest extends HomeAndGardenPage {

    HomeAndGardenPage hngpage;
    HomePage homepage;

    @BeforeMethod
    public void initialize() {
        PageFactory.initElements(driver, this);
        hngpage = homepage.HomeAndGardenClick();
    }


    @Test
    public void categoryCheckTest() {
        hngpage.checkDropdown();;
    }
    @Test
    public void properUrl () {
        Assert.assertEquals("https://www.ebay.com/b/Home-Garden/11700/bn_1853126", driver.getCurrentUrl());
    }
    @Test
    public void checkTitle () {
        Assert.assertEquals("Home & Garden | eBay", driver.getTitle());
    }

    }

