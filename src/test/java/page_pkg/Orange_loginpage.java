package page_pkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Orange_loginpage {

WebDriver driver;
WebDriverWait wait;

@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")WebElement username;
@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input") WebElement password;
@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button") WebElement login;

public Orange_loginpage(WebDriver driver) 
{
	this.driver=driver;
	PageFactory.initElements( driver,this);
	wait=new WebDriverWait(driver,Duration.ofSeconds(10));
}

public void loginMtd()
{
	wait.until(ExpectedConditions.urlContains("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));
	username.sendKeys("Admin");
	password.sendKeys("admin123");
	login.click();
	
}

}
