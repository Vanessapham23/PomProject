package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.BasePage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {

	
	WebDriver driver;
	//TestDatas
	String userName = "demo@techfios.com";
	String password = "abc123";
	String dashBoardValidationText = "Dashboard";
	String addCustomerValidationTest = "Add Contact";
	String FULL_NAME = "SELENIUM FEB2023";
	String COMPANY = "Techfios";
	String EMAIL = "demoFeb23@techfios.com";
	
	@Test	
	public void userShouldBeAbleToAddCustomer() throws InterruptedException {
		
		driver = BrowserFactory.init();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.performLogin(userName, password);
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashBoardPage(dashBoardValidationText);
		dashboardPage.clickCustomerButton();
		dashboardPage.clickAddCustomerButton();
		
		
		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
	   addCustomerPage.validateAddCustomerPage(addCustomerValidationTest);
	   addCustomerPage.insertFullName(FULL_NAME);
	   addCustomerPage.selectCompanyName(COMPANY);
	   addCustomerPage.emailName(EMAIL);
	  
	} 
	
}
