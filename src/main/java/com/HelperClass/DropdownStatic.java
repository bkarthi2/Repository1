package com.HelperClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownStatic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String DepartureCity= "//a[@value='BLR']";
		String ArrivalCity="//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='HYD']";
		
		driver.get("https://www.spicejet.com/");
		String TitleValidation=driver.getTitle();
		System.out.println(TitleValidation);
		driver.findElement(By.id("divpaxinfo")).click();
		Select se=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		Thread.sleep(100);
		se.selectByValue("3");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(5000);
	//	List<WebElement> CityList=driver.findElements(By.id("glsctl00_mainContent_ddl_originStation1_CTNR"));
		
					
			
			driver.findElement(By.xpath(DepartureCity)).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(ArrivalCity)).click();
			
			
			
		}
		
	}


