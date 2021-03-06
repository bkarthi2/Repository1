package rahulshettyacademy;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.ConfigurationFiles.WebDriverFactory;
import com.RahulShetty.pages.HomePage;

public class HomePageTests extends WebDriverFactory {
	
	@Test
	public void ClickingPractiseProjects() throws IOException {
		
		InvokingBrowser();
		properties();
		HomePage hm=new HomePage(driver);
		hm.PractiseProjects().click();
		hm.Inputname().sendKeys(prop.getProperty("inputname"));
		hm.InputEmailID().sendKeys(prop.getProperty("inputmailID"));
		hm.Submitbutton().click();
		
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
	@Test
	public void Demo1method() {
		
		System.out.println("this is demo1 project");
		System.out.println("tis is demo 2 project");
	}
	
	@Test
	public void repomethods() {
		
		System.out.println("this is repo method");
	}
}


