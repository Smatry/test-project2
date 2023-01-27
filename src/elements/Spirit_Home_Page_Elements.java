package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Spirit_Home_Page_Elements {


    WebDriver driver;

    // Free_Spirit_Url
    @FindBy(className = "sp-image") public WebElement freeSpiritCTA;
    // Saver_Club_Url
    @FindBy(xpath = "//img[@alt='savers_club_image']") public WebElement saverClubCTA;
    // My_Trips_Url
    @FindBy(xpath = "//a[@data-qa='home-page.common-header-my-trips']") public WebElement myTripsCTA;
    // Check_In_Url
    @FindBy(xpath = "//a[@data-qa='home-page.common-header-check-in']") public WebElement CheckInCTA;
    // Flight_Status_Url
    @FindBy(xpath = "//a[@data-qa='home-page.common-header-flight-status']") public WebElement flightStatusCTA;
    // Deals_Url
    @FindBy(xpath = "//a[@data-qa='home-page.common-header-deals']") public WebElement DealsCTA;
    // Contact_Us_Url
    @FindBy(xpath = "//a[@data-qa='home-page.common-header-contact-us']") public WebElement ContactUsCTA;
    // Spirit_JetBlue_Url
    @FindBy(xpath = "//strong//a[@target='_blank']") public WebElement SpiritJetBlueCTA;
    // drop_Down_From
    @FindBy(xpath = "//i[@class='far fa-chevron-down ng-star-inserted']") public WebElement dropDownOneWay;
    @FindBy(xpath = "//label[@data-qa='one-way']") public WebElement oneWaySelect;
    @FindBy(xpath = "//label[@class='fromStation ng-tns-c142-3']") public List<WebElement> dropDownFromAirport;
    // drop_Down_To
    @FindBy(xpath = "//label[@class='toStation ng-tns-c142-3']") public  List<WebElement> getDropDownToAirport;

    // constructor
    public Spirit_Home_Page_Elements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

}