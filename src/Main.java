import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Main  {

        WebDriver driver;

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

        }
        @AfterMethod
        public void tearDown() {
                driver.close();
        }

        @Test
        public void Free_Spirit_Url() throws Exception {

                SoftAssert sa = new SoftAssert();

                String expectedURL = "https://qa01.nk.spirit.com/free-spirit";

                driver.findElement(By.className("sp-image")).click();
                Thread.sleep(2000);
                String newUrl = driver.getCurrentUrl();
                System.out.println(newUrl);

                sa.assertEquals(newUrl,expectedURL,"Verify URL of new page");


        }

}


