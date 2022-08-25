package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import browser.browser;

public  class PimPage {

    @FindBy(linkText = "Recruitment") private static WebElement recruitmentPage;

    @FindBy()
    public  PimPage recruitmentM(){
        recruitmentPage.click();
        return PageFactory.initElements(browser.driver,PimPage.class);
    }
}
