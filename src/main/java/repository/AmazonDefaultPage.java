package repository;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonDefaultPage {
	
	WebDriver driver;
	
	private static Logger log =LogManager.getLogger(AmazonDefaultPage.class.getName());
			   
	//WebDriverWait wait = new WebDriverWait (driver, 20);

	public AmazonDefaultPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	  @FindBy(xpath="//a[@class='nav-a nav-a-2 a-popover-trigger a-declarative']")
	public  WebElement deliverTo;
	  	
	  @FindBy(xpath="//div[@id='a-popover-3']//div[@id='GLUXAddressBlock']//span[@class = 'a-button-text']")
	  public  WebElement signInToSeeYourAddresses;
	  
	  @FindBy(id="GLUXZipUpdateInput")
	  public WebElement zipCode;
	  
	  @FindBy(xpath="//div[@class='a-column a-span4 a-span-last']//input[@class ='a-button-input']")
	  public WebElement zipCodeApply;
	  
	  
	  public boolean clickOnDeliverTo()
	  {
		  try {
			  
			  if(deliverTo != null)
			  {
				  deliverTo.click();
				  log.info("Deliver to address is clicked");
				
			  }
			  else 
			  {
				  log.info("Deliver to address element is not found");
				  return false;
			  }
		  }
		  catch (Exception e) {
			  
			  log.info("Deliver to address element is not found exception");
		}
		  return true; 
		 
	  }
	  
	  
	  public boolean EnterZipCode() {
 try {
	 Thread.sleep(5000);
	//  wait.until(ExpectedConditions.visibilityOf(zipCode));
			  if(zipCode != null)
			  {
				
				  zipCode.sendKeys("560102");
				  log.info("zip code 560102 has been entered");
							  }
			  else 
			  {
				  log.info("Zip code Element was not found");
				  return false;
			  }
		  }
		  catch (Exception e) {
			  
			  log.info("zip code element is not found exception");
		}
		  return true; 
		  
	  }
	  
	  public boolean clickOnApply(){
 try {
	 Thread.sleep(5000);
			  if(zipCodeApply != null)
			  {
				  zipCodeApply.sendKeys("560102");
				  log.info("Zip code Element was found");
							  }
			  else 
			  {
				  log.info("Zip code Element was not found");
				  return false;
			  }
		  }
		  catch (Exception e) {
			  
			  log.info("zip code element is not found exception");
		}
		  return true; 
		  
	  }
	  
}
