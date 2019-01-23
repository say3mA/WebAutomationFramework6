package pages;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

//Selling on eBay | Electronics, Fashion, Home &amp; Garden | eBay
public class SellPage extends CommonAPI {

    public SellPage(){
        PageFactory.initElements(driver, this);
    }


}
