package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

   public class Spirit_My_Trips_Page_Elements {

    WebDriver driver;

       //SingIn
       @FindBy (xpath = "//input[@data-qa='find-trip-page-username']") public WebElement emailAddress;
       @FindBy (xpath = "//input[@data-qa='find-trip-page-password']") public WebElement  passwordData;
       @FindBy(xpath = "//button[@class='btn btn-primary btn-responsive']")public WebElement singInCTA;

       // Create an Account
       @FindBy (xpath = "//button[@class='btn btn-secondary btn-responsive']") public WebElement  createAccCTA;

       // Forgot Password

       @FindBy (xpath = "//div//button[@routerlink='/retrieve-password']") public WebElement forgotPassword;

       public Spirit_My_Trips_Page_Elements(WebDriver driver) {
           this.driver = driver;
           PageFactory.initElements(driver, this);


       }

   }