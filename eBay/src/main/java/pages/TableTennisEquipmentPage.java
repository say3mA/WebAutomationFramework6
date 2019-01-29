package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class TableTennisEquipmentPage extends CommonAPI {
    public TableTennisEquipmentPage(){
        PageFactory.initElements(driver, this);
    }
    public void tableTennisSearch(String item) throws InterruptedException{
        typeByXpath("//input[@id='gh-ac']", item);
        clickOnCss("#gh-btn");
        Thread.sleep(5000);
    }
    public void checkTitle()throws InterruptedException{
        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(), "Table Tennis Equipment | eBay");
    }
    public void properUrl(){
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Table-Tennis-Equipment/97072/bn_1958176");
    }

    public void under25DollarsClick() {
        clickByXpath("//section[@id='w5']//ul//li[1]//a[1]");
    }
    public void _25to60DollarsClick() {
        clickByXpath("//section[@id='w5']//ul//li[1]//a[1]");
    }
    public void _60AndAboveClick() {
        clickByXpath("//section[@id='w5']//ul//li[1]//a[1]");
    }
    public void dropDownEquipmentSearch(){
        WebElement mySelectElement = driver.findElement(By.xpath("//select[@id='gh-cat']"));
        Select dropdown= new Select(mySelectElement);
        dropdown.selectByIndex(3);
    }
    public void dropDownSearchCount(){
        WebElement mySelectElement = driver.findElement(By.xpath("//select[@id='gh-cat']"));
        Select dropdown= new Select(mySelectElement);
        List<WebElement> list = dropdown.getOptions();
        Assert.assertEquals(list.size(), 38);

    }


}
