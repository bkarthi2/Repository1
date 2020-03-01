package com.HelperClass;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Multiplewindowhandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait w=new WebDriverWait(driver, 5);
		
		driver.get("https://www.google.com/intl/en_in/gmail/about/");
		driver.findElement(By.linkText("Create an account")).click();
		
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it= ids.iterator();
		String ParentWindow=it.next();//ChildWindow
		String ChildWindow=it.next();
		
		
		System.out.println(driver.getTitle());
		driver.switchTo().window(ChildWindow);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(ParentWindow);
		System.out.println(driver.getTitle());
		driver.close();
	}

}
