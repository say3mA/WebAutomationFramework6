package test.pages;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;
import pages.TableTennisEquipmentPage;

public class TableTennisEquipmentPageTest extends TableTennisEquipmentPage {

    HomePage homepage;
    SearchPage searchpage;
    TableTennisEquipmentPage ttepage;

    @BeforeMethod
    public void initialization(){
        this.homepage = new HomePage();
        searchpage = homepage.searchPageClick();
        ttepage = searchpage.pingPongLinkClick();
    }

    @Test
    public void properUrl(){

    }
    @Test
    public void checkTitle(){
        Assert.assertEquals(driver.getTitle(), "All Categories - Browse and Discover more | eBay");
    }


}
