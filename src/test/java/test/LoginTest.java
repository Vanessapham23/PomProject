package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {

	WebDriver driver;
	//TestDatas
	String userName = "demo@techfios.com";
	String password = "abc123";
	String dashBoardValidationText = "Dashboard";

	@Test
	public void validUserShouldBeAbleToLogin() throws InterruptedException {
		// object
		// By Class Name

		driver = BrowserFactory.init();

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(userName);
		loginPage.insertPassword(password);
		loginPage.clickOnSignIn();
        Thread.sleep(5000);
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashBoardPage(dashBoardValidationText);
		
		BrowserFactory.tearDown();
	}
	
}