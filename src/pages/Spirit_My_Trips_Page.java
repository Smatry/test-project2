package pages;

import elements.Spirit_My_Trips_Page_Elements;
import org.openqa.selenium.WebDriver;


public class Spirit_My_Trips_Page {
    WebDriver driver;
    Spirit_My_Trips_Page_Elements clickAccLink;
    Spirit_My_Trips_Page_Elements emailAddressEnter;
    Spirit_My_Trips_Page_Elements passwordEnter;
    Spirit_My_Trips_Page_Elements singInClick;
    Spirit_My_Trips_Page_Elements forgotPasswordLink;

    public Spirit_My_Trips_Page(WebDriver driver) {
        this.driver = driver;

        clickAccLink = new Spirit_My_Trips_Page_Elements(driver);
        emailAddressEnter = new Spirit_My_Trips_Page_Elements(driver);
        passwordEnter = new Spirit_My_Trips_Page_Elements(driver);
        singInClick = new Spirit_My_Trips_Page_Elements(driver);
        forgotPasswordLink = new Spirit_My_Trips_Page_Elements(driver);

    }
     // SinIn
    public void emailEnterData(String email) {
        emailAddressEnter.emailAddress.sendKeys(email);
     }
    public void passwordEnterData(String password) {
        passwordEnter.passwordData.sendKeys(password);
    }
    public void singIn() {
        singInClick.singInCTA.click();
    }
    // Acc_Creation_Url
     public void clickAccCreations() {
        clickAccLink.createAccCTA.click();
     }

     // Forgot_Password_Url
      public void forgotPasswordOption() {
          forgotPasswordLink.forgotPassword.click();
      }
}