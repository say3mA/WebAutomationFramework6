package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class CareersPage extends CommonAPI {

    public CareersPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@title='eBay Inc. Home Page']")
    WebElement ebayLogo;
    @FindBy(css = "#search-keyword-banner")
    WebElement searchCareer;
    @FindBy(xpath = "//img[@src='https://static.ebayinc.com/static/assets/Uploads/Content/browse-jobs-by-location.png']")
    WebElement ebayBuildingImage;
    @FindBy(linkText = "Our Company")
    WebElement ourCompanyLink;

    public void engineeringClick(){
        clickByXpath("//div[@class='sub-navigation']//div[@class='inner']//ul[1]//li[1]");
    }
    public void checkTitle() throws InterruptedException{
        Thread.sleep(5000);
        String title = driver.getTitle();
        Assert.assertEquals(title, "Start Your Search - eBay Inc. Careers");
    }
    public void checkUrl() throws InterruptedException{
        Thread.sleep(5000);
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, "https://careers.ebayinc.com/join-our-team/start-your-search/");
    }
    public boolean eBayLogoIsThere(){
        return ebayLogo.isDisplayed();
    }
    public void searchCareer(String value){
        typeOnCss("#search-keyword-banner", value);
        clickOnCss("#search-submit-banner");
    }
    public void ourCompanyClick(){
        ourCompanyLink.click();
    }
    public void discoverJobsLink(){
        clickByXpath("//span[contains(text(),'Discover jobs around the world')]");
    }
    public void findRightFitClick(){
        clickByXpath("//span[contains(text(),'Find the right fit for you')]");
    }
    public void buildOpportunityLink() {
        clickByXpath("//span[contains(text(),'Build opportunity with us')]");
    }
}
