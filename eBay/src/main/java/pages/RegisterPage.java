package pages;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends CommonAPI {

    public RegisterPage(){
        PageFactory.initElements(driver,this);
    }
    public void registerUser(String firstName, String lastName, String email, String password){
        typeByCss("#firstname", firstName);
        typeByCss("#lastname", lastName);
        typeByCss("#email", email);
        typeByCss("#password", password);
        clickOnCss("#ppaFormSbtBtn");
    }
}
