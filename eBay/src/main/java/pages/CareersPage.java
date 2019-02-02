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
    public void viewOpenPositions() {
        clickByXpath("//a[@class='button-flat']");
    }
    public void learnWhoWeAreClick(){
        clickByXpath("//span[contains(text(),'Build opportunity with us')]");
    }
    public void ourBenefitsClick(){
        clickByXpath("//div[@class='sub-navigation']//div[@class='inner']//ul[1]//li[1]");
    }
    public void getStartedNowLink(){
        clickByXpath("//span[contains(text(),'Learn about who and why we hire')]");
    }
    public void mainSearchButton(){
        clickByXpath("//button[@id='main-search-button']");
    }
    public void studentsImage(){
        Assert.assertTrue(driver.findElement(By.xpath("//img[@src='https://static.ebayinc.com/static/assets/Uploads/Content/start-your-career.png']")).isDisplayed());
    }
    public void impactLink(){
        clickByXpath("//body[contains(@class,'careers-land carousel-init layout-large')]/div[@id='sticky-wrap-main-header']/header[@id='main-header']/div[contains(@class,'main-header-top')]/div[contains(@class,'inner')]/div[contains(@class,'header-search-nav instant')]/nav[@id='header-nav']/ul[contains(@class,'header-nav-top')]/li[1]");
    }
    public void twitterLink(){
        clickByXpath("//div[contains(@class,'social-icons light large')]//a[contains(@title,'Twitter')]");
    }
    public void facebookLink(){
        clickByXpath("//div[contains(@class,'social-icons light large')]//a[contains(@title,'Facebook')]");
    }
    public void instagramLink(){
        clickByXpath("//a[contains(@title,'Instagram')]");
    }
    public void linkedInLink(){
        clickByXpath("//div[contains(@class,'social-icons light large')]//a[contains(@title,'LinkedIn')]");
    }
    public void glassdoorLink(){
        clickByXpath("//a[contains(@title,'Glassdoor')]");
    }

}
