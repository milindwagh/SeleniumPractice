
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait w = new WebDriverWait(driver, 15);
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		System.out.println(driver.findElement(By.cssSelector("p.text-center")).getText());
		String [] credentials = driver.findElement(By.cssSelector("p.text-center")).getText().split(" ");
		String username = credentials[2];
		String password = credentials[6].substring(0, credentials[6].length()-1);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		//driver.findElement(By.xpath("//label[2]//span[2]")).click();
		//w.until(ExpectedConditions.alertIsPresent());
		//Thread.sleep(10000);
		//System.out.println(driver.switchTo().alert().getText());
		//driver.switchTo().alert().accept();
		WebElement selectDropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown = new Select(selectDropdown);
		dropdown.selectByValue("consult");
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		driver.findElement(By.xpath("//input[@id='signInBtn']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//app-card[1]//div[1]//div[2]//button[1]")));
		
		//String[] itemNeeded = {"iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry"};
		
		List<WebElement> products = driver.findElements(By.cssSelector(".card-body"));
		//List<WebElement> tital = driver.findElements(By.cssSelector(".card-title"));
		for(int i=0; i < products.size(); i++)
		{
					driver.findElements(By.xpath("//div[@class='card-footer']/button")).get(i).click();
					System.out.println("item added");
			}
		}
	}
