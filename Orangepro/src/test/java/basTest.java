import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import browser.browser;
import browser.Info;
import pages.Login_page;

import java.time.Duration;

public class basTest {
    WebDriver driver;

@BeforeMethod
    public void setup(){
    driver = browser.getDriver();
    driver.navigate().to(Info.URL);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }

    @AfterMethod
    public void afterMthod(){
    //driver.close();
  //  driver.quit();

    }
    public Login_page loginPage(){
    return PageFactory.initElements(driver,Login_page.class);
    }
}
