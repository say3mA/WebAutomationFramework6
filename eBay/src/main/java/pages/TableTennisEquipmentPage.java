package pages;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;

public class TableTennisEquipmentPage extends CommonAPI {
    public TableTennisEquipmentPage(){
        PageFactory.initElements(driver, this);
    }
    public void tableTennisSearch(String item) throws InterruptedException{
        typeByXpath("//input[@id='gh-ac']", item);
        clickOnCss("#gh-btn");
        Thread.sleep(5000);
    }

}
