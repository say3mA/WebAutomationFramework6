package test.pages;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends HomePage {

    HomePage homepage=null;

    @BeforeMethod
    public void initialization() {
        homepage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void search(){
        homepage.search();
    }


}
