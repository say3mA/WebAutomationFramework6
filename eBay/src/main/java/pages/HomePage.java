
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.CommonAPI;
import org.testng.annotations.BeforeMethod;

public class HomePage extends CommonAPI {

    @FindBy(css = "#gh-ac")
    WebElement searchBar;

    public void search(){
        searchBar.sendKeys("alexa");
    }


}


