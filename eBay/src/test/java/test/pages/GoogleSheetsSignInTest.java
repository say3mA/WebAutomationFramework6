package test.pages;

import com.relevantcodes.extentreports.ExtentReports;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.GoogleSheetsSignIn;
import pages.HomePage;
import pages.SignInPage;
import reporting.ExtentManager;
import utility.GoogleSheetReader;

import java.io.IOException;

public class GoogleSheetsSignInTest extends GoogleSheetsSignIn {
    HomePage homepage;
    SignInPage signinpage;
    ExtentReports report;

    @BeforeMethod
    public void initialize() throws Exception {
        this.homepage = new HomePage();
        signinpage = homepage.signInPageClick();
        report = ExtentManager.getInstance();
    }
    @Test
    public void eBaySignIn() throws IOException {
        String[][] data = GoogleSheetReader.getSpreadSheetRecordsToSupplyDataProvider("1YdzdBrkAbXm8lvlvTJB9ImpriTICmj5wEgh7NdE4gn4", "A2:C");
        signinpage.signIn(data[0][0], data[0][1]);
    }
}
