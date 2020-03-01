package com.HelperClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		WebElement move= driver.findElement(By.cssSelector("a[class='dropdown-toggle meganav-shop']"));
		WebElement inputBox= driver.findElement(By.cssSelector("#input"));
		List<WebElement> categories= driver.findElements(By.cssSelector("a[class='dropdown-toggle meganav-shop']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(move).build().perform();
		
		List<WebElement> carts =driver.findElements(By.xpath("//button[@id='dropdownMenu2']"));
		System.out.println(carts.get(1).getText());
		
	}

}
