package test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;
import utility.MyDataReader;

import static java.lang.Thread.sleep;
import static org.openqa.selenium.By.*;

public class SearchPageTest extends SearchPage{

    HomePage homepage;
    SearchPage searchpage;
    MyDataReader dataReader;
   

    @BeforeMethod
    public void initialization(){
        this.homepage = new HomePage();
        searchpage = homepage.searchClick();
    }
    @Test
    public void properUrl(){
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/v/allcategories");
    }
    @Test
    public void checkTitle(){
        Assert.assertEquals(driver.getTitle(), "All Categories - Browse and Discover more | eBay");
    }
    @Test
    public void TableTennisLinkTest(){
        searchpage.pingPongLinkClick();
    }




    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
