package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class HomeAndGardenPage extends CommonAPI {

    public HomeAndGardenPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#gh-logo")
    WebElement ebayLogo;


    public List<String> getShopByCategories(){
        List<WebElement> categories;
        categories = driver.findElements(By.xpath("//*[@id=\"w1-w0\"]/ul"));
        List<String> list = new ArrayList<String>();
        for(WebElement w : categories)
            list.add(w.getText());
        return list;
    }

    public void checkDropdown(){
    WebElement dropDown = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[4]/div[1]/div[1]/div[1]/div[1]/section[1]/ul[1]/li[1]/button[1]/*"));
    dropDown.click();
//    dropDown.findElement(By.linkText("Gear"));
    WebElement gearOption = driver.findElement(By.xpath("//ul[@id='w1-w0-w0-accordion-subtree']//li[5]//a[1]"));
    Assert.assertTrue(gearOption.isDisplayed());
}
    public void checkUrl(){
        Assert.assertEquals("https://www.ebay.com/b/Home-Garden/11700/bn_1853126", driver.getCurrentUrl());
    }
    public void checkTitle(){
        Assert.assertEquals("Home & Garden | eBay", driver.getTitle());
    }
    public void checkEbayLogo(){
        Assert.assertTrue(ebayLogo.isDisplayed());
    }
    public void checkSearch(){
        typeByCss("#gh-ac", "tomato plants");
    }

}
