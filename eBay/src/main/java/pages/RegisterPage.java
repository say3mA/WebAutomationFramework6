package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RegisterPage extends CommonAPI {

    public RegisterPage(){
        PageFactory.initElements(driver,this);
    }
    public void properUrl(){
        Assert.assertEquals(driver.getCurrentUrl(), "https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
    }
    public void properTitle(){
        Assert.assertEquals(driver.getTitle(), "Sign in or Register | eBay");

    }
    public void registerUser(String firstName, String lastName, String email, String password){
        typeByCss("#firstname", firstName);
        typeByCss("#lastname", lastName);
        typeByCss("#email", email);
        typeByCss("#password", password);
        clickOnCss("#ppaFormSbtBtn");
    }
    public void eBayLogo(){
        Assert.assertTrue(driver.findElement(By.xpath("//img[@id='gh-logo']")).isDisplayed());
    }
    public void userAgreementLink(){
        clickByXpath("//a[@title='link opens in new window'][contains(text(),'User Agreement')]");
    }
    public void userPrivacyNotice(){
        clickByXpath("//a[contains(text(),'User Privacy Notice')]");
    }
    public void nortonLogo(){
        Assert.assertTrue(driver.findElement(By.xpath("//i[@id='gf-norton']")).isDisplayed());
    }
    public void showPasswordBox(){
        driver.findElement(By.xpath("//span[@class='chk-lb regular-text']"));
    }
}
