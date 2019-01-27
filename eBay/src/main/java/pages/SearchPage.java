package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.By.linkText;

public class SearchPage extends CommonAPI {

    public SearchPage(){
        PageFactory.initElements(driver, this);
    }
    public TableTennisEquipmentPage pingPongLinkClick(){
       clickByXpath("/html[1]/body[1]/div[4]/div[1]/div[2]/div[2]/div[6]/div[8]/div[1]/div[2]/ul[1]/li[6]/a[1]");
       return new TableTennisEquipmentPage();
    }


}
