package pages;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends CommonAPI {

    public SignInPage(){
        PageFactory.initElements(driver, this);
    }
}
