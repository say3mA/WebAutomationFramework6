package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.openqa.selenium.support.How.CSS;
import static utility.GoogleSheetReader.getSpreadSheetRecords;

public class GoogleSheetsSignIn extends CommonAPI {
    public GoogleSheetsSignIn(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = ("//*[@id=\"gh-ug\"]/a"))
    public static WebElement ViewSignInUser;
    @FindBy(how = CSS, using = "#userid")
    public static WebElement user;
    @FindBy(how = CSS, using = "#pass")
    public static WebElement password;
    @FindBy(css = "#sgnBt")
    public static WebElement logInButton;
    @FindBy(css = "#errf")
    public static WebElement logInErrorMesage;

    public List<String> signInByInvalidIdPass(String spreadsheetId, String range) throws IOException, InterruptedException {
        List<List<Object>> col2Value = getSpreadSheetRecords(spreadsheetId, range);
        List<String> actual = new ArrayList<>();
        for (List row : col2Value) {
            sleepFor(1);
            inputValueInTextBoxByWebElement(user, row.get(0).toString());
            inputValueInTextBoxByWebElement(password, row.get(1).toString());
            sleepFor(1);
            //actual.add(getCurrentPageTitle());
            actual.add(getTextByWebElement(logInErrorMesage));
            System.out.println(getTextByWebElement(logInErrorMesage));
            clearInputBox(user);
            clearInputBox(password);
            sleepFor(1);
        }
        return actual;
    }
}
