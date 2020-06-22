package pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TCBPage {

	WebDriver driver;

	public TCBPage(WebDriver driver) {
		this.driver = driver;
	}

	// WebElement library
	@FindBy(how = How.NAME, using = ("allbox"))
	WebElement TOGGLE_ALL_CHECKBOX;
	@FindBy(how = How.ID, using = ("label-first"))
	WebElement PAGE_TITLE;

	// Methods to interact with elements

	public void verifyPageTitle() {
		wetForElement(driver, 2, PAGE_TITLE);
		PAGE_TITLE.click();
		System.out.println("NSS-TODO List v 1.1 tab is dysplayed");
	}

	public void clicktoggleAllCheckBox() {
		TOGGLE_ALL_CHECKBOX.click();

	}

	public void verifyToggleAllCheckboxSelection() {
		wetForElement(driver, 5, TOGGLE_ALL_CHECKBOX);
		Assert.assertTrue("ToggleAllCheckbox is not selected!", TOGGLE_ALL_CHECKBOX.isSelected());
		System.out.println("Test pass");
	}

	public void verifyAllCheckboxesareSelected() {
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (int i = 0; i <checkboxes.size(); i++) {
			//checkboxes.get(i).click();

			if (checkboxes.get(i).isSelected()) {
				System.out.println(i + " checkBox is selected ");
			} 
			else {
				System.out.println(i + " checkBox is not selected ");
			}
		}
	}

	

	public void tearDown() {
		driver.close();
		driver.quit();
	}

	private void wetForElement(WebDriver driver, int time, WebElement LOCATOR) {
		WebDriverWait wait = new WebDriverWait(driver, 2);
		wait.until(ExpectedConditions.visibilityOf(LOCATOR));

	}

}
