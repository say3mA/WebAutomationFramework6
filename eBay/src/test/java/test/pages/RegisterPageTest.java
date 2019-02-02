package test.pages;

import com.relevantcodes.extentreports.ExtentReports;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;
import reporting.ExtentManager;
import utility.MyDataReader;

public class RegisterPageTest extends RegisterPage {

    HomePage homepage;
    RegisterPage registerpage;
    MyDataReader dataReader;
    ExtentReports report;

    @BeforeMethod
    public void initialize(){
        this.homepage = new HomePage();
        registerpage = homepage.registerPageClick();
        report = ExtentManager.getInstance();

    }
    @DataProvider
    public Object[][] getExcelTestData(){
        Object data[][] = dataReader.getTestData("info");
        return data;
    }
    @Test(dataProvider = "getExcelTestData")
    public void registerTest(String fn, String ln, String email, String pw){
        registerpage.registerUser(fn, ln, email, pw);
    }
    @Test
    public void checkUrl(){
        registerpage.properUrl();
    }
    @Test
    public void checkTitle(){
        registerpage.properTitle();
    }
    @Test
    public void eBayLogoIsThere(){
        registerpage.eBayLogo();
    }
    @Test
    public void userAgreementLinkTest(){
        registerpage.userAgreementLink();
    }
    @Test
    public void userPrivacyNoticeLinkTest(){
        registerpage.userPrivacyNotice();
    }
    @Test
    public void nortonLogoIsThereTest(){
        registerpage.nortonLogo();
    }
    @Test
    public void showPasswordBoxTest(){
        registerpage.showPasswordBox();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
