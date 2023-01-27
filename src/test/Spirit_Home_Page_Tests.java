package test;

import elements.Spirit_Home_Page_Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Spirit_Home_Page;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Spirit_Home_Page_Tests {

    WebDriver driver;
    Spirit_Home_Page homePage;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\96910\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://qa01.nk.spirit.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        Thread.sleep(2000);

        homePage = new Spirit_Home_Page(driver);

    }

    @AfterMethod
    public void tearDown() {
        driver.close();

    }

    @Test
    public void Free_Spirit_Url() throws Exception {

        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);
        String expectedURL = "https://qa01.nk.spirit.com/free-spirit";
        homePage.clickSpiritLink();
        String newUrl = driver.getCurrentUrl();
        System.out.println(newUrl);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
    }

    @Test
    public void Saver_Club_Url() throws Exception {

        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);
        String expectedURL = "https://qa01.nk.spirit.com/savers-club";
        homePage.clickSaverClubLink();
        String newUrl = driver.getCurrentUrl();
        System.out.println(newUrl);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");

    }

    @Test
    public void My_Trips_Url() throws Exception {

        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);
        String expectedURL = "https://qa01.nk.spirit.com/my-trips/find-trip";
        homePage.clickMyTripUr();
        Thread.sleep(2000);
        String newUrl = driver.getCurrentUrl();
        System.out.println(newUrl);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");

    }

    @Test
    public void Check_In_Url() throws Exception {

        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);
        String expectedURL = "https://qa01.nk.spirit.com/home-check-in";
        homePage.clickCheckInUrl();
        Thread.sleep(2000);
        String newUrl = driver.getCurrentUrl();
        System.out.println(newUrl);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");

    }

    @Test
    public void Flight_Status_Url() throws Exception {

        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);
        String expectedURL = "https://qa01.nk.spirit.com/flight-status";
        homePage.clickFlightStatusUrl();
        Thread.sleep(2000);
        String newUrl = driver.getCurrentUrl();
        System.out.println(newUrl);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");

    }

    @Test
    public void Deals_Url() throws Exception {

        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);
        String expectedURL = "https://www.spirit.com/en/flights";
        homePage.clickDealsUrl();
        Thread.sleep(2000);
        String newUrl = driver.getCurrentUrl();
        System.out.println(newUrl);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");

    }
       @Test
       public void Contact_Us_Url() throws Exception {

        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);
        String expectedURL = "https://www.spirit.com/s/contact-us";
        homePage.clickContactUsUrl();
        Thread.sleep(2000);
        String newUrl = driver.getCurrentUrl();
        System.out.println(newUrl);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");


    }
       @Test
       public void Spirit_JetBlue_Url() throws Exception {

        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);
        String expectedURL = "https://lowfaresgreatservice.com/";
        homePage.clickSpiritJetBlueUrl();
        Thread.sleep(2000);
        String newUrl = driver.getCurrentUrl();
        System.out.println(newUrl);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");

       }

        @Test
        public void drop_Down_From() throws Exception {

        SoftAssert sa = new SoftAssert();
        homePage.clickOneWayFrom();
        homePage.clickOneWaySelect();
        List<WebElement> From = homePage.getOWFromAirportListCheck();
        List<String> arr1 = new ArrayList<>();
        for (WebElement option : From) {
            arr1.add(option.getText());
        }
        List<String> arr2 = new ArrayList<String>(arr1);
        Collections.sort(arr2);
        System.out.println("Actual List:" + arr1);
        System.out.println("Sorted List:" + arr2);

        sa.assertTrue(arr1.equals(arr2));

       }

        @Test
        public void drop_Down_To() {

        SoftAssert sa = new SoftAssert();
        homePage.clickOneWayFrom();
        homePage.clickOneWaySelect();
        List<WebElement> To = homePage.getOWToAirportListCheck();
        List<String> arr1 = new ArrayList<>();
        for (WebElement option : To) {
            arr1.add(option.getText());
        }
        List<String> arr2 = new ArrayList<String>(arr1);
        Collections.sort(arr2);
        System.out.println("Actual List:" + arr1);
        System.out.println("Sorted List:" + arr2);

        sa.assertTrue(arr1.equals(arr2));

      }

    }

