package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Automation {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tofa\\Documents\\Automation Tools\\chromedriver_win32\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.phptravels.net/");
	    driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='https://www.phptravels.net/tours']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("select2-tours_city-container")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("Johor Bahru");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//*[@id='tours-search']/div/div/div[3]/div/div/div/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='tours-search']/div/div/div[3]/div/div/div/div/div[1]/div/div/div[2]/i")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='tours-search']/div/div/div[3]/div/div/div/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='submit']")).click();
		Thread.sleep(2000);
		
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//*[@id='sydney and bondi beach explorer']/div")));
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='legoland malaysia day pass']/div/div[2]/div/div[2]/div/a")).click();
		Thread.sleep(2000);
		
		je.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("/html/body/section[2]/div[2]/div/div/div[2]/div/div/div/form/div[3]/button")));
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/section[2]/div[2]/div/div/div[2]/div/div/div/form/div[3]/button")).click();;
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("Samya");
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys("Saha");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("test@yopmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("phone")).sendKeys("01716121212");
		Thread.sleep(1000);
		driver.findElement(By.name("address")).sendKeys("Kolkata");
		Thread.sleep(1000);
		driver.findElement(By.name("firstname_1")).sendKeys("Samya");
		Thread.sleep(1000);
		driver.findElement(By.name("lastname_1")).sendKeys("Saha");
		Thread.sleep(1000);
		driver.findElement(By.name("firstname_2")).sendKeys("Debraj");
		Thread.sleep(1000);
		driver.findElement(By.name("lastname_2")).sendKeys("Saha");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='gateway_paypal']")).click();
		Thread.sleep(1000);
		
		je.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("/html/body/div[2]/form/section[1]/div/div/div[1]/div[3]")));
		Thread.sleep(1000);
		
		driver.findElement(By.id("agreechb")).click();
		Thread.sleep(1000);
	}
}
