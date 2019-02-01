package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

import static org.openqa.selenium.By.linkText;

public class SearchPage extends CommonAPI {

    public SearchPage(){
        PageFactory.initElements(driver, this);
    }
    public TableTennisEquipmentPage pingPongLinkClick(){
       clickByXpath("/html[1]/body[1]/div[4]/div[1]/div[2]/div[2]/div[6]/div[8]/div[1]/div[2]/ul[1]/li[6]/a[1]");
       return new TableTennisEquipmentPage();
    }
    public void properUrl(){
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/v/allcategories");
    }
    public void properTitle(){
        Assert.assertEquals(driver.getTitle(), "bob");
    }
    public void partsAndAccessoriesLink(){
        clickByXpath("//div[@id='nav-1']//div[2]//div[1]//div[2]//div[1]//a[1]//h3[1]");
    }
    public void numberOfLinksInCategories(){
        List<WebElement> list = driver.findElements(By.className("sub-category"));
        List<String> data = new ArrayList<>();
        for(WebElement w: list){
            data.add(w.getText());
        }
        Assert.assertEquals(data.size(), 1018);
    }
    public void boatsLink(){
        clickByXpath("/html[1]/body[1]/div[4]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/ul[1]/li[1]/a[1]");
    }
    public void partsImage(){
        Assert.assertTrue(driver.findElement(By.xpath("//img[@src='https://i.ebayimg.com/00/s/MjM2WDMxNQ==/z/NXwAAOSw~AVYphDS/$_57.JPG?set_id=80000000000']")).isDisplayed());
    }
}
