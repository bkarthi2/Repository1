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
}
