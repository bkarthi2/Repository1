package com.RahulShetty.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;
	}

	By HeaderlinkPractiseProjects = By.linkText("Practice Projects");
	By Nameinput = By.xpath("//input[@placeholder='Your Name*']");
	By EmailID = By.xpath("//input[@placeholder='Your Email*']");
	By Submit=By.id("form-submit");
	
	//Your Email*

	public WebElement PractiseProjects() {

		return driver.findElement(HeaderlinkPractiseProjects);

	}

	public WebElement Inputname() {

		return driver.findElement(Nameinput);

	}
	public WebElement InputEmailID() {

		return driver.findElement(EmailID);

	}
	public WebElement Submitbutton() {

		return driver.findElement(Submit);

	}

}
