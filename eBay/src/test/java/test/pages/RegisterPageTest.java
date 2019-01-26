package test.pages;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;
import utility.MyDataReader;

public class RegisterPageTest extends RegisterPage {

    HomePage homepage;
    RegisterPage registerpage;
    MyDataReader dataReader;

    @BeforeMethod
    public void initialize(){
        this.homepage = new HomePage();
        registerpage = homepage.registerPageClick();
    }
    /**@DataProvider
    public Object[][] getExcelTestData(){
        Object data[][] = dataReader.getTestData("info");
        return data;
    }
    @Test(dataProvider = "getExcelTestData")
    public void registerTest(String fn, String ln, String email, String pw){
        registerpage.registerUser(fn, ln, email, pw);
    }**/
    @Test
    public void properUrl(){
        Assert.assertEquals(driver.getCurrentUrl(), "https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
    }
    @Test
    public void checkTitle(){
        Assert.assertEquals(driver.getTitle(), "Sign in or Register | eBay");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
