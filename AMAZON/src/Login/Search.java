package Login;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Search  {

public static void main(String[] args) {

// System Property for Chrome Driver
	System.setProperty("webdriver.chrome.driver", "D:\\TEST AUTOMATION\\Chromedriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
// Launch Website
	driver.navigate().to("https://www.amazon.in/");
	driver.manage().window().maximize();


	WebElement element2 = driver.findElement(By.id("twotabsearchtextbox"));
	element2.sendKeys("cricket leather bat");
	element2.submit();
	
//	element2.sendKeys("cricket leather bat").submit();
	
	
//	driver.findElement(By.tagName("SG Scorer Classic Kashmir Willow Cricket Bat ( Size: Size 6,Leather Ball )") with No Cost EMI/Additional Exchange Offers")).click();
	
driver.findElement(By.partialLinkText("SG Scorer Classic Kashmir Willow Cricket Bat ( Size: Size 6,Leather Ball )")).click();

  }
}
