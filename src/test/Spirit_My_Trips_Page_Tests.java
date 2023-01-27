package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Spirit_My_Trips_Page;

public class Spirit_My_Trips_Page_Tests {
    WebDriver driver;
    Spirit_My_Trips_Page myPage;


    @BeforeMethod
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\96910\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://qa01.nk.spirit.com/my-trips/find-trip");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        Thread.sleep(2000);

        myPage = new Spirit_My_Trips_Page(driver);


    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    @Test
    public void my_Trips_Url() throws Exception {

        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);
        String expectedURL = "https://qa01.nk.spirit.com/my-trips/find-trip";

        String newUrl = driver.getCurrentUrl();
        System.out.println(newUrl);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");

}

    @Test
    public void Sing_In_To_Acc() throws Exception {

        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);
        String expectedURL = "https://qa01.nk.spirit.com/account/activity";

        Thread.sleep(2000);
        myPage.emailEnterData("mikesmithFSgold@spirit.com");
        Thread.sleep(2000);
        myPage.passwordEnterData("Brandy12$");
        myPage.singIn();
        Thread.sleep(5000);
        String newUrl = driver.getCurrentUrl();
        System.out.println(newUrl);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");

    }

    @Test
    public void Create_An_Acc() throws Exception {

        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);
        String expectedURL = "https://qa01.nk.spirit.com/free-spirit";

        myPage.clickAccCreations();
        Thread.sleep(3000);
        String newUrl = driver.getCurrentUrl();
        System.out.println(newUrl);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");

    }
    @Test
    public void Forgot_Password_Url() throws Exception {

        SoftAssert sa = new SoftAssert();

        Thread.sleep(2000);
        String expectedURL = "https://qa01.nk.spirit.com/retrieve-password";

        Thread.sleep(2000);
        myPage.forgotPasswordOption();
        Thread.sleep(2000);
        String newUrl = driver.getCurrentUrl();
        System.out.println(newUrl);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");

    }
}