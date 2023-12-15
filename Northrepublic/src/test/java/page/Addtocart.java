package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Addtocart {
	
	WebDriver driver;
	By newnr=By.xpath("//*[@id=\"shopify-section-header\"]/section/div[1]/header[2]/div[3]/div/div[2]/ul/li[1]/a");
	By product=By.xpath("//*[@id=\"8942704525618\"]/div/a/div/div/div[4]/div[3]/button");
	By addtocart=By.xpath("//*[@id=\"sf-theme\"]/div[18]/div[2]/div/div[1]/div[2]/div[4]/button[1]");
	
	public Addtocart(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void newnr()
	{
		driver.findElement(newnr).click();
	}
	public void product() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(product).click();
	}
	public void add()
	{
		driver.findElement(addtocart).click();
	}

}
