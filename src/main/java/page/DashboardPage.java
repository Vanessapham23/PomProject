package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class DashboardPage extends BasePage {
	
	WebDriver driver; 
	public void DashBoardPage(WebDriver driver) {
		this.driver= driver;
		
		
	}
	@FindBy(how = How.XPATH , using = "//h2[contains(text(), 'Dashboard')]") WebElement DASHBOARD_HEADER_ELEMENT;
	@FindBy(how = How.XPATH , using = "//*[@id=\"side-menu\"]/li[3]/a/span[1]") WebElement CUSTOMERS_MENU_ELEMENT;
	@FindBy(how = How.XPATH , using = "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a") WebElement ADD_CUSTOMERS_Menu_ELEMENT;
	

	public void validateDashBoardPage(String expectedText) {
		
		
		validateElement(DASHBOARD_HEADER_ELEMENT.getText(), expectedText, "Dashboard Page not found");
	
	}
	public void clickCustomerButton () throws InterruptedException {
		Thread.sleep(2000);
		CUSTOMERS_MENU_ELEMENT.click();
		
	}
	public void clickAddCustomerButton() {
		ADD_CUSTOMERS_Menu_ELEMENT.click();
		
	}

	
	
	
}
