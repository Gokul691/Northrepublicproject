package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Contactus {
	WebDriver driver;
	By Tshirt=By.xpath("//*[@id=\"shopify-section-header\"]/section/div[1]/header[2]/div[3]/div/div[2]/ul/li[4]/a");
	By stock=By.xpath("//*[@id=\"boost-sd__filter-tree-wrapper\"]/div/div/div/div[2]/div[2]/div/ul/li[1]/button");
	By contact=By.xpath("//*[@id=\"shopify-section-footer\"]/footer/div[1]/div/div/div[3]/div/ul/div/li[9]/a");
	
	public Contactus(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public void tshirt() 
	{
		driver.navigate().back();
		driver.findElement(Tshirt).click();
	}
	public void stock() throws InterruptedException
	{

		Thread.sleep(3000);
		driver.findElement(stock).click();
	
	}

	public void contact() 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		driver.findElement(contact).click();
	}

}
