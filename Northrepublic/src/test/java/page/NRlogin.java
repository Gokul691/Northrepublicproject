package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NRlogin {
WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"shopify-section-header\"]/section/div[1]/header[2]/div[3]/div/div[2]/a[1]")
	WebElement nrsignin;
	
	@FindBy(xpath="//*[@id=\"customer_login\"]/input[3]")
	WebElement nremail;
	
	@FindBy(xpath="//*[@id=\"customer_login\"]/input[4]")
	WebElement nrpass;
	
	@FindBy(xpath="//*[@id=\"customer_login\"]/button")
	WebElement nrclick;
	
	
	
	public NRlogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void signin() throws InterruptedException
	{
		Thread.sleep(2000);
		nrsignin.click();
	}
	public void setvalues(String email,String pass)
	{
		nremail.sendKeys(email);
		nrpass.sendKeys(pass);
		
	}
	public void login()
	{
		nrclick.click();
	}
	
	


}
