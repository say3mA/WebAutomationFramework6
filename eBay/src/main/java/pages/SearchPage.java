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
       driver.findElement(By.linkText("Ping Pong")).click();
       return new TableTennisEquipmentPage();
    }


}
