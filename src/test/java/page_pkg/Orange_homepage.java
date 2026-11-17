package page_pkg;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Orange_homepage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6") WebElement logo;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span") WebElement admin;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input") WebElement adminsearch;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]") WebElement search;
	public Orange_homepage(WebDriver driver) {
		
		this.driver =driver;
		PageFactory.initElements(driver,this);
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	}
	
	public void logoMtd()
	{
		if(logo.isDisplayed())
		{
			System.out.println("Visible");
		}
		else
		{
			System.out.println("Not visible");
		}
	}
	
	public void adminmtd()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")));
		admin.click();
	}
	
	public void screenmtd() throws Exception
	{
		wait.until(ExpectedConditions.urlContains("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers"));
		adminsearch.sendKeys("sona");
		search.click();
		
		File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(s,new File("C:\\Users\\Luminar Technolab\\Desktop\\selenium exam\\seleniumExam\\screen\\screen.png"));
		
		
		
	}
	
	
	
	

}
