
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import base.CommonAPI;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomePage extends CommonAPI {


    HomePage homePage;
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
    @FindBy (css = "gh-logo")
    WebElement ebayLogo;
    @FindBy(linkText = "careers")
    WebElement careersLink;
    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/ul[1]/li[7]/a[1]")
    WebElement hngLink;

    public boolean eBayLogoCheck(){
        return ebayLogo.isDisplayed();
    }
    public void categoryDropDownSelect(){
        Select categoryDropDown = new Select(driver.findElement(By.xpath("//select[@id='gh-cat']")));
        categoryDropDown.selectByVisibleText("Antiques");
        categoryDropDown.selectByIndex(7);
        homePage.searchClick();
    }
    public int categoryDropDownNumberOfItems(){
        Select categoryDropDown = new Select(driver.findElement(By.xpath("//select[@id='gh-cat']")));
        List<WebElement> list = categoryDropDown.getOptions();
        int count = list.size();
        return count;
    }
    public void eBayKazakhstanSelect(){
        WebElement eBaySites = driver.findElement(By.cssSelector("#gf-fbtn"));
        eBaySites.click();
        clickOnElement("//p[contains(text(),'Kazakhstan')]");
    }
    public SearchPage searchClick(){
        clickOnCss("#gh-btn");
        return new SearchPage();
    }
    public HomeAndGardenPage HomeAndGardenClick() throws InterruptedException {
        clickOnElement("/html[1]/body[1]/div[5]/div[1]/ul[1]/li[7]/a[1]");
        //hngLink.click();
        return new HomeAndGardenPage();
    }
    public CareersPage careersPageClick(){
        clickOnElement("//a[contains(text(),'Careers')]");
        return new CareersPage();
    }
    public SellPage sellPageClick(){
        clickOnElement("//a[@class='gh-p'][contains(text(),'Sell')]");;
        return new SellPage();
    }
    public SignInPage signInPageClick(){
        clickOnElement("//a[contains(text(),'Sign in')]");
        return new SignInPage();
    }
    public RegisterPage registerPageClick(){
        clickOnElement("//a[contains(text(),'register')]");
        return new RegisterPage();
    }
}


