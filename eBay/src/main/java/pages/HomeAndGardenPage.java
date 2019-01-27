package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class HomeAndGardenPage extends CommonAPI {

    public HomeAndGardenPage(){
        PageFactory.initElements(driver, this);
    }


    public List<String> getShopByCategories(){
        List<WebElement> categories;
        categories = driver.findElements(By.xpath("//*[@id=\"w1-w0\"]/ul"));
        List<String> list = new ArrayList<String>();
        for(WebElement w : categories)
            list.add(w.getText());
        return list;
    }

    public void checkDropdown(){
    Select dropDown = new Select(driver.findElement(By.xpath("//*[@id='w1-w0-w0-accordion-arrow']")));
        dropDown.selectByVisibleText("Gear");
    WebElement gearOption = driver.findElement(By.xpath("//ul[@id='w1-w0-w0-accordion-subtree']//li[5]//a[1]"));
        Assert.assertTrue(gearOption.isSelected());
}
    public void checkUrl(){
        Assert.assertEquals("https://www.ebay.com/b/Home-Garden/11700/bn_1853126", driver.getCurrentUrl());
    }
    public void checkTitle(){
        Assert.assertEquals("Home & Garden | eBay", driver.getTitle());

    }

}
