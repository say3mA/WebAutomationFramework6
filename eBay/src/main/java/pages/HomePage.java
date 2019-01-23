
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.CommonAPI;
import org.testng.annotations.BeforeMethod;

public class HomePage extends CommonAPI {

    @FindBy (xpath = "//a[contains(text(),'Sign in')]")
    WebElement signIn;
    @FindBy (name = "userid")
    WebElement userName;
    @FindBy (name = "pass")
    WebElement passWord;
    @FindBy (id = "sgnBt")
    WebElement signInBtn;
    @FindBy (id = "signin_fb_btn")
    WebElement signInWithFb;
    @FindBy (css = "[_sp='m570\\.l2621']")
    WebElement register;
    @FindBy (css = "#firstname")
    WebElement firstName;
    @FindBy (css = "#lastname")
    WebElement lastName;
    @FindBy (id ="ppaFormSbtBtn" )
    WebElement clickRegister;
    @FindBy (id = "gh-logo")
    WebElement ebayLogo;
    @FindBy(linkText = "careers")
    WebElement careersLink;


    public void clicksign(){
        signIn.click();
    }
    public void registerClick(){
        clickRegister.click();
    }
    public void setUserName(String Value){
        userName.sendKeys(Value);
    }
    public void setPassword(String value) {
        typeOnElement("#password", value);
    }
    public void clicksubmit() {
        signInBtn.click();
    }
    public void clickFacebook(){
        signInWithFb.click();
    }
    public void  clickreg(){
        register.click();
    }
    public void setTypeName(String Value){
        firstName.sendKeys(Value);
    }



    public CareersPage careersClick(){
        careersLink.click();
        return new CareersPage();
    }
    public HomeAndGardenPage HomeAndGardenClick(){
        driver.findElement(By.linkText("Home & Garden")).click();
        return new HomeAndGardenPage();
    }

    public SearchPage searchPageClick(){
        driver.findElement(By.cssSelector("#gh-btn"));
        return new SearchPage();
    }
    public SellPage sellPageClick(){
        driver.findElement(By.xpath("//a[@class='gh-p'][contains(text(),'Sell')]"));
        return new SellPage();
    }
    public SignInPage signInPageClick(){
        driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
        return new SignInPage();
    }



}


