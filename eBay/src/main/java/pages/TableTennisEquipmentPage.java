package pages;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;

public class TableTennisEquipmentPage extends CommonAPI {
    public TableTennisEquipmentPage(){
        PageFactory.initElements(driver, this);
    }

}
