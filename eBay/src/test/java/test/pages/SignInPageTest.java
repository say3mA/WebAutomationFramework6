package test.pages;

import com.relevantcodes.extentreports.ExtentReports;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignInPage;
import reporting.ExtentManager;
import utility.DataReader;
import utility.MyDataReader;

public class SignInPageTest extends SignInPage {

    HomePage homepage;
    SignInPage signinpage;
    MyDataReader dataReader;
    ExtentReports report;
    public static String Path = "/Users/MacUser/IdeaProjects/comseleniumfrmwrk/eBay/src/test/java/test/pages/TestFiles/TestData.xlsx";


    @BeforeMethod
    public void initialize() throws Exception {
        this.homepage = new HomePage();
        signinpage = homepage.signInPageClick();
        report = ExtentManager.getInstance();
        this.dataReader = new MyDataReader();
        dataReader.setExcelFile(Path);
    }
    /**@Test
    public void signInDummyTest(){
        signinpage.signIn();
    }
    @Test
    public void signInGoogleTest(){
        signinpage.signInWithGoogle();
    }
    @Test
    public void signInFacebookTest(){
        signinpage.signInWithFacebook();
    }
    @DataProvider
    public Object[][] getExcelTestData(){
        Object data[][] = dataReader.getTestData(0);
        return data;
    }
    @Test(dataProvider = "getExcelTestData")
    public void signInTest(String user, String pw){
        signinpage.signIn(user, pw);
        System.out.println(user + "    " + pw);
    }**/
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
