package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_ex {

	WebDriver driver;

	@BeforeMethod
	public void browser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver94.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/selenium%20set%20up/Offline%20Website/Offline%20Website/index.html");
		// Assert.assertEquals(driver.getTitle(), "JavaByKiran | Log in");
	}

	@Test(priority = 1)
	public void testtext() {
		String act = driver.findElement(By.xpath("/html/body/div/div[1]/a/h4")).getText();
		String exp = "JAVA | SELENIUM | PYTHON";
		Assert.assertEquals(act, exp);

	}

	@Test(priority = 2)
	public void A() {

		String expected = "Register a new membership";
		String actual = driver.findElement(By.xpath("/html/body/div/div[2]/a")).getText();
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 3)
	public void checkblank() {

		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.id("email")).sendKeys("");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		String actual = driver.findElement(By.id("email_error")).getText();
		String expected = "Please enter email.";
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 4)
	public void loginpassword() {
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		String actual = driver.findElement(By.xpath("//div[@id='password_error']")).getText();
		String expected = "Please enter password.";
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 5)
	public void m2() {
		String act = driver.findElement(By.xpath("/html/body/div/div[1]/a/b")).getText();
		String exp = "Java By Kiran";
		Assert.assertEquals(act, exp);

	}

	@Test(priority = 6)
	public void m3() {
		String act = driver.findElement(By.xpath("/html/body/div/div[2]/a")).getText();
		String exp = "Register a new membership";
		Assert.assertEquals(act, exp);

	}

	@Test(priority = 7)
	public void img() {
		String act = driver.findElement(By.xpath("/html/body/div/center/img")).getTagName();
		String exp = "img";
		Assert.assertEquals(act, exp);
	}

	@Test(priority = 8)
	public void login3() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kamblemangesh@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String act = driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/div")).getText();
		String exp = "Please enter email as kiran@gmail.com";
		Assert.assertEquals(act, exp);

	}

	@Test(priority = 9)
	public void m1() {
		driver.findElement(By.id("email")).sendKeys("");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String actual = driver.findElement(By.xpath("//div[@id='email_error']")).getText();
		String expected = "Please enter email";
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 10)
	public void login() {
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button")).click();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");

	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}
}
