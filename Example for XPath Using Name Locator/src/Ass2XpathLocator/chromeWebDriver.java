package Ass2XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class chromeWebDriver {
	public WebDriver driver;

  @Test
  public void chrom() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lo0ol\\" + "Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		// Navigate to a website
		driver.navigate().to("https://www.elm.sa/en/Pages/default.aspx");
		
		// Mazimize current window
		driver.manage().window().maximize();
		
		// define the web element to find it
		WebElement idMethod = driver.findElement(By.linkText("Clients' Training"));
		
		idMethod.click();
		
		// define the web element by xpath to find it
		WebElement NameMethod = driver.findElement(By.xpath("//input[@name='ctl00$ctl66$g_3d4c58d0_78d6_419e_b6cb_ff0b4121b9a3$ctl00$txtName']"));
		
		NameMethod.sendKeys("Mawaddah");
		
		// Delay execution for 5 seconds after find specific web element
		Thread.sleep(5000);
		
		// Close the browser
		driver.quit();
  }
}
