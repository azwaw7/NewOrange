package browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class browser {
    static WebDriver driver;
    public static WebDriver getDriver(){

        if (Info.BROWSER.equalsIgnoreCase("chrome")){
        WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();}
        else if (Info.BROWSER.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
   return driver; }


}
