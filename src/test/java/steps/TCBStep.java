package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.TCBPage;
import util.BrowserFactory;

public class TCBStep {
	
	// connect with BrowserFactory to call the driver
		WebDriver driver = BrowserFactory.startBrowser();
		
		@Given("^User is already in techfios test page$")
		public void user_is_already_in_techfios_test_page() throws Throwable {
			// validate the test page
		
			TCBPage verifytitle= PageFactory.initElements(driver, TCBPage.class);
			verifytitle.verifyPageTitle();
			
		   
		}

		@When("^User click on toggle all check box$")
		public void user_click_on_toggle_all_check_box() throws Throwable {
		    TCBPage togglallcheckbox = PageFactory.initElements(driver, TCBPage.class);
		    togglallcheckbox.clicktoggleAllCheckBox();
		    togglallcheckbox.verifyToggleAllCheckboxSelection();
		}

		@Then("^all check boxes for list items are also CHECKED ON$")
		public void all_check_boxes_for_list_items_are_also_CHECKED_ON() throws Throwable {
			Thread.sleep(5);
			 TCBPage togglallcheckbox = PageFactory.initElements(driver, TCBPage.class);
			 togglallcheckbox.verifyAllCheckboxesareSelected();
		}
		@Then("^close the browser$")
		public void close_the_browser() throws Throwable {
			TCBPage close= PageFactory.initElements(driver, TCBPage.class);
			close.tearDown();
		}




}
