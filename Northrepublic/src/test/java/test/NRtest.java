package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Addtocart;
import page.NRlogin;
import page.Contactus;

public class NRtest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.northrepublic.com");
		driver.manage().window().maximize();
	}
	@Test
	public void test() throws Exception
	{
		NRlogin ob=new NRlogin(driver);
		ob.signin();
		ob.setvalues("abc@gmail.com","12345");
		ob.login();

		Addtocart ob1=new Addtocart(driver);
		ob1.newnr();
		ob1.product();
		ob1.add();
		
		Contactus obj=new Contactus(driver);
		obj.tshirt();
		obj.stock();
		obj.contact();
	}
}
