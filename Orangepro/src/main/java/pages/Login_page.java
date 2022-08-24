package pages;

import browser.Info;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_page {
   @FindBy(css = "input[name='username']") private WebElement username;
   @FindBy(xpath = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input") private WebElement password;
   @FindBy (xpath = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button") private WebElement button;
   public void loginToPage(){
       username.sendKeys(Info.user_name);
       password.sendKeys(Info.password);
       button.click();
   }
}
