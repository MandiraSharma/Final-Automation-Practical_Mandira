package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.RemoveALIPage;
import pages.TestBase;
import util.BrowserFactory;

public class RemoveALIStep extends TestBase {
	WebDriver driver =  BrowserFactory.startBrowser();
	
	
	@When("^user click on remove buttom$")
	public void user_click_on_remove_buttom() throws Throwable {
		try {
		RemoveALIPage removeallitem = PageFactory.initElements(driver, RemoveALIPage.class);
		removeallitem.clickRemoveButtom();}
		catch(Exception e) {
			screenShot(driver,"C:\\screenShotFile\\RemoveAILFalure.jpg");
			
		}
	    
	}

	@Then("^All list item should be removed$")
	public void all_list_item_should_be_removed() throws Throwable {
		
		RemoveALIPage removeallitem = PageFactory.initElements(driver, RemoveALIPage.class);
		removeallitem.verifyAllItemListRemoved();
	}

	
	   
	

	



}
