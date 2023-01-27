package pages;

import elements.Spirit_Home_Page_Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Spirit_Home_Page {
    WebDriver driver;
    Spirit_Home_Page_Elements freeSpiritLink;
    Spirit_Home_Page_Elements saverClubLink;
    Spirit_Home_Page_Elements myTripsLink;
    Spirit_Home_Page_Elements CheckInUrl;
    Spirit_Home_Page_Elements flightStatusUrl;
    Spirit_Home_Page_Elements dealsUrl;
    Spirit_Home_Page_Elements ContactUsUrl;
    Spirit_Home_Page_Elements SpiritJetBlueUrl;
    Spirit_Home_Page_Elements OneWay;
    Spirit_Home_Page_Elements oneWayChose;
    Spirit_Home_Page_Elements dropDownFromManu;
    Spirit_Home_Page_Elements getDropDownToManu;

    public Spirit_Home_Page(WebDriver driver) {
        this.driver = driver;

        freeSpiritLink = new Spirit_Home_Page_Elements(driver);
        saverClubLink = new Spirit_Home_Page_Elements(driver);
        myTripsLink = new Spirit_Home_Page_Elements(driver);
        CheckInUrl = new Spirit_Home_Page_Elements(driver);
        flightStatusUrl = new Spirit_Home_Page_Elements(driver);
        dealsUrl = new Spirit_Home_Page_Elements(driver);
        ContactUsUrl = new Spirit_Home_Page_Elements(driver);
        SpiritJetBlueUrl = new Spirit_Home_Page_Elements(driver);
        OneWay = new Spirit_Home_Page_Elements(driver);
        oneWayChose= new Spirit_Home_Page_Elements(driver);
        dropDownFromManu = new Spirit_Home_Page_Elements(driver);
        getDropDownToManu = new Spirit_Home_Page_Elements(driver);

    }

    // Free_Spirit_Url test
    public void clickSpiritLink() {
        freeSpiritLink.freeSpiritCTA.click();
    }
    //  Saver_Club_Url test
    public void clickSaverClubLink() {
        saverClubLink.saverClubCTA.click();
    }
    // My_Trips_Url test
    public void clickMyTripUr() {
        myTripsLink.myTripsCTA.click();
    }
    public void clickCheckInUrl () {
    CheckInUrl.CheckInCTA.click();
    }

    // Flight_Status_Url test
     public void clickFlightStatusUrl() {
        flightStatusUrl.flightStatusCTA.click();
    }
    //  Deals_Url test
     public void clickDealsUrl() {
         dealsUrl.DealsCTA.click();
     }
     // Contact_Us_Url test
     public void clickContactUsUrl() {
        ContactUsUrl.ContactUsCTA.click();
    }
     // Spirit_JetBlue_Url
     public void clickSpiritJetBlueUrl() {
        SpiritJetBlueUrl.SpiritJetBlueCTA.click();
     }
    // Drop_Down_From test
     public void clickOneWayFrom() {
        OneWay.dropDownOneWay.click();
    }
     public void clickOneWaySelect() {
        oneWayChose.oneWaySelect.click();
    }
    public List<WebElement> getOWFromAirportListCheck() {
        return dropDownFromManu.dropDownFromAirport;

    }
    // Drop_Down_To test
    public List<WebElement> getOWToAirportListCheck() {
        return getDropDownToManu.getDropDownToAirport;
    }

}
