package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.RemoveSILPage;
import util.BrowserFactory;

public class RemoveSILStep {
	WebDriver driver =  BrowserFactory.startBrowser();


@When("^User click on mango check box$")
public void user_click_on_mango_check_box() throws Throwable {
	RemoveSILPage remove = PageFactory.initElements(driver, RemoveSILPage.class);
	remove.clickMangoCheckBox();
}

@When("^user click on remove button$")
public void user_click_on_remove_button() throws Throwable {
	RemoveSILPage removetab = PageFactory.initElements(driver, RemoveSILPage.class);
	removetab.clickRemoveButtom();
	}
@Then("^mango check box should be removed$")
public void mango_check_box_should_be_removed() throws Throwable {
	
	RemoveSILPage removeMangotab = PageFactory.initElements(driver, RemoveSILPage.class);
	removeMangotab.verifyMangocheckboxIsRemoved();
}
}


