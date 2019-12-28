
//this script show the execution of login page
import org.testng.annotations.Test;
	import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.AfterTest;

	

public class login_valid {
	
		WebDriver driver;

	  @Test
	  public void login() 
	  {
		
		 driver.findElement(By.id("cyclosUsername")).sendKeys("admin");
		 //driver.findElement(By.id("password")).sendKeys("1234");
		 driver.findElement(By.xpath("//input[@value='1']")).click();
		 driver.findElement(By.xpath("//input[@value='2']")).click();
		 driver.findElement(By.xpath("//input[@value='3']")).click();
		 driver.findElement(By.xpath("//input[@value='4']")).click();
		 driver.findElement(By.xpath("//input[@value='Submit']")).click();
		 String expected = "Application status";
		 WebElement res = driver.findElement(By.xpath("//table/tbody/tr/td"));
		 String actual = res.getText();
		 System.out.println(actual);
		 Assert.assertTrue(actual.contains(expected));
		 
	  }
	  @BeforeMethod
	  public void beforeMethod() 
	  {
		 // driver.get("http://localhost:8585/do/login");
		 
		  
	  }

	  @AfterMethod
	  public void afterMethod() 
	  {
		  System.out.println("test case is under test");
	  }

	  @BeforeTest
	  public void beforeTest()
	  {
		  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		  driver =new ChromeDriver();
		 driver.get("http://localhost:8585/do/login");
	  }

	  @AfterTest
	  public void afterTest() 
	  {
		 
	  }
	  

	}

