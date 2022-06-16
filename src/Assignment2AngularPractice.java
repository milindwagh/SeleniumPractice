import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2AngularPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.className("ng-valid")).sendKeys("Milind Wagh");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("milindwagh2007@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Talent_123");
		Assert.assertFalse(driver.findElement(By.id("exampleCheck1")).isSelected());
		driver.findElement(By.id("exampleCheck1")).click();
		Assert.assertTrue(driver.findElement(By.id("exampleCheck1")).isSelected());
		//driver.findElement(By.id("exampleFormControlSelect1")).click();
		WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select gender = new Select(staticDropdown);
		gender.selectByIndex(0);
		System.out.println(gender.getFirstSelectedOption().getText());
		
		Assert.assertFalse(driver.findElement(By.id("inlineRadio1")).isSelected());
		driver.findElement(By.id("inlineRadio1")).click();
		Assert.assertTrue(driver.findElement(By.id("inlineRadio1")).isSelected());
		
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("01271986");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		//Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Success!']")).getText(), "Success!");
		//System.out.println(driver.findElement(By.xpath("//strong[text()='Success!']")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		System.out.println("----"+driver.findElement(By.xpath("//strong/following-sibling::text()")).getText());
		//Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Success!']")).getText(),  "Success!");
		Assert.assertEquals(driver.findElement(By.xpath("//strong/following-sibling::text()")).getText(),  " The Form has been submitted successfully!");
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
	

	}

}
