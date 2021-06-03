package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIN {

	public static void main(String[] args) {

		// System Property for Chrome Driver
		System.setProperty("webdriver.chrome.driver", "D:\\TEST AUTOMATION\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		
	driver.manage().window().maximize();
	
		
	driver.get("https://www.amazon.in/");
	
	WebElement signinbutton = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	
	signinbutton.click();
	

	
	WebElement emialbutton = driver.findElement(By.id("ap_email"));
	emialbutton.sendKeys("singhabhishek.7484@gmail.com");
	emialbutton.submit();

	driver.findElement(By.className("a-checkbox"));
	
	WebElement pssbutton = driver.findElement(By.id("ap_password"));
	pssbutton.sendKeys("qwerty@1234");
	pssbutton.submit();
}
	
}
