package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RemoveSILPage {

	WebDriver driver;

	public RemoveSILPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element library
	@FindBy(how = How.NAME, using = ("todo[11]"))
	WebElement MANGO_CHECKBOX;
	@FindBy(how = How.NAME, using = ("submit"))
	WebElement REMOVE_BUTTOM;
	
	//methodes to interact with element
	public void clickMangoCheckBox() {
		MANGO_CHECKBOX.click();
		
	}
	public void clickRemoveButtom() {
		REMOVE_BUTTOM.click();
		
	}
	public void verifyMangocheckboxIsRemoved() {
		wetForElement(driver, 5, MANGO_CHECKBOX);
		Assert.assertTrue("Mango checkbox is not removed!", MANGO_CHECKBOX.isDisplayed());
		System.out.println("Test pass");
	}
	private void wetForElement(WebDriver driver, int time, WebElement LOCATOR) {
		WebDriverWait wait = new WebDriverWait(driver, 2);
		wait.until(ExpectedConditions.visibilityOf(LOCATOR));

	}

		
	}
	


