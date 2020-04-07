package mavenPackage;




import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import repository.AmazonDefaultPage;



public class AmazonDeliverToTest {
	   WebDriver driver;
	
	
	@Test
  public void deliverTo() throws Exception {
	    WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();        
        driver.get("https://www.amazon.com/");
		AmazonDefaultPage amazonDefaultPage = new AmazonDefaultPage(driver);
	amazonDefaultPage.clickOnDeliverTo();
	
	amazonDefaultPage.EnterZipCode();
	
	amazonDefaultPage.clickOnApply();
	driver.close();
  }
}
