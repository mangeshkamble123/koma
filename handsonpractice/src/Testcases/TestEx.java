package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestEx {



	public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "chromedriver94.exe");
			WebDriver driver  = new ChromeDriver();
			System.out.println(22);
			driver.get("file:///C:/selenium%20set%20up/Offline%20Website/Offline%20Website/index.html");
			driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
			driver.findElement(By.id("password")).sendKeys("123456");
			driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		    driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[3]/a/span")).click();
		    driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
		    
		    driver.findElement(By.id("username")).sendKeys("mangesh");
			driver.findElement(By.id("mobile")).sendKeys("1234567890");
			driver.findElement(By.id("email")).sendKeys("kmangesh123@gmail.com");
			driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[4]/div/input")).sendKeys("java");
			driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[5]/div/input[1]")).click();
			WebElement selectt =driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"));
			Select sel = new Select(selectt);
			sel.selectByIndex(3);
			driver.findElement(By.id("password")).sendKeys("12345");
			driver.findElement(By.id("submit")).click();
			Thread.sleep(10000);
			String popup =driver.switchTo().alert().getText();
			System.out.println(popup);
			driver.switchTo().alert().accept();
		    
			
			
			
			
		

	}
}
