package base_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import page_pkg.Orange_homepage;
import page_pkg.Orange_loginpage;

public class Orange_base {
	public static WebDriver driver;
	public Orange_loginpage loginobj;
	public Orange_homepage homeobj;
	
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void objMtd()
	{
		loginobj=new Orange_loginpage(driver);
		homeobj=new Orange_homepage(driver);
	}


}

