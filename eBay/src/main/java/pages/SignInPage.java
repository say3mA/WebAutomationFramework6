package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class SignInPage extends CommonAPI {

    public SignInPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#userid")
    WebElement userName;
    @FindBy(css = "#pass")
    WebElement passWord;
    @FindBy(id = "#sgnBtn")
    WebElement signInBtn;


    public void signIn(String x, String y){
        userName.sendKeys(x);
        passWord.sendKeys(y);
        clickOnElement("#sgnBt");
    }
    public void signIn(){
        userName.sendKeys("bob");
        passWord.sendKeys("cat");
        clickOnElement("#sgnBt");
    }

    public void signInWithGoogle(){
        clickOnCss("#signin_ggl_btn");
    }
    public void signInWithFacebook(){
        clickOnCss("#signin_fb_btn");
    }
    public void createAccountLink() {
        clickOnCss("#InLineCreateAnAccount");
    }

    public void learnMoreClick() {
        clickOnCss("#signinanch1")
    }
}
