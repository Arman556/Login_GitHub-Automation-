package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class loginpage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/temp/Desktop/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/login");
		System.out.println("Open github website successfully");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Entering username on sign up page");
		driver.findElement(By.id("login_field")).sendKeys("Arman556");
		System.out.println("Entering password on sign up page");
		driver.findElement(By.id("password")).sendKeys("Armanace12345");
		Thread.sleep(2000);
		driver.findElement(By.name("commit")).click();
		Assert.assertEquals(driver.getTitle(), "GitHub", "User Not successfully moved to Sign Up page");
		System.out.println("Welcome to github");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/header/div[7]/details/summary/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/header/div[7]/details/details-menu/form/button")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
