import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import pages.Login_page;
import pages.PimPage;

public class FirstTest extends basTest  {
    //WebDriver driver;
    @Test
    public void test01(){
        loginPage().loginToPage();
        navigateTorecu().recruitmentM();




   }


}
