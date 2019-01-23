package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class CareersPage extends CommonAPI {

    public CareersPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@title='eBay Inc. Home Page']")
    WebElement ebayLogo;
    @FindBy(css = "#search-keyword-banner")
    WebElement searchCareer;
    @FindBy(xpath = "//img[@src='https://static.ebayinc.com/static/assets/Uploads/Content/browse-jobs-by-location.png']")
    WebElement ebayBuildingImage;

}
