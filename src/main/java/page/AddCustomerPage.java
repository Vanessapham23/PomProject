package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCustomerPage extends BasePage {

	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {

		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div/div[1]/h5")
	WebElement ADD_CUSTOMER_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]")
	WebElement COMPANY_DROP_DOWN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
	WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]")
	WebElement PhoneNumber_Element;

	public void validateAddCustomerPage(String expectedText) {
		validateElement(ADD_CUSTOMER_HEADER_ELEMENT.getText(), expectedText, "Add customer is not available here");

	}

	public void insertFullName(String fullName) {

		FULL_NAME_ELEMENT.sendKeys(fullName + randomNumGenerator(999));
	}

	public void selectCompanyName(String company) {

		selectFromDropDown(COMPANY_DROP_DOWN_ELEMENT, company);

	}

	public void emailName(String email) {

		EMAIL_ELEMENT.sendKeys(randomNumGenerator(999) + email);
	}

}
