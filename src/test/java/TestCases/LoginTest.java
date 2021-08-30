package TestCases;

import Pages.Login;
import Pages.MainPanel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base_Grid.BaseTest;

public class LoginTest extends BaseTest {

	@Test
	public void init() throws Exception {
		Login loginPageCheck = new Login(driver);
		loginPageCheck.setUsernameField("admin");
		loginPageCheck.setPasswordField("Test123!");
		log.info("Entered username and password.");
		loginPageCheck.clickonLogin();
		log.info("Clicked LogIn button.");

		String expectedUrl = "https://tutoring.klassroomutils.com/admin";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
		log.info("URL verification is complete.");

		//MainPanel adminPanel=  loginPageCheck.clickonLogin();
		//Assert.assertTrue(adminPanel.dashboardVisibility());
	}











//
//	@Test
//	public void logInTest() {
//		// open the page
//		String url = "https://tutoring.klassroomutils.com/login";
//		driver.get(url);
//		log.info("Page is opened.");
//
//		//By Username=By.id("_username");
//
////		public void insertUsername(){
////			String getUsername =driver.findElement(Username).getText();
////			Assert.assertEquals("admin",getUsername);
////		}
//		// enter username
//		WebElement username = driver.findElement(By.id("_username"));
//		username.sendKeys("admin");
//
//		// enter password
//		WebElement password = driver.findElement(By.id("password"));
//		password.sendKeys("Test123!");
//		log.info("Entered username and password.");
//
//		// push log in button
//		WebElement logInButton = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[3]/button[1]"));
//		logInButton.click();
//		log.info("Clicked LogIn button.");
//
//		// Verifications:
//
//		// 1 - new url
//		String expectedUrl = "https://tutoring.klassroomutils.com/admin";
//		String actualUrl = driver.getCurrentUrl();
//		Assert.assertEquals(actualUrl, expectedUrl);
//		log.info("URL verification is complete.");
//
//		//AD button
//		WebElement AD_Button = driver.findElement(By.xpath("//body/div[1]/nav[1]/div[1]/ul[1]/a[1]/div[1]/p[1]"));
//		Assert.assertTrue(AD_Button.isDisplayed(), "AD Button is not visible.");
//		//AD_Button.click();
//		log.info("AD button is visible.");
//
////		// 2 - log out button is visible
////		WebElement logOutButton = driver.findElement(By.cssSelector("body.adminHomepage:nth-child(2) div.c-admin-nav:nth-child(1) nav.navbar.navbar-fixed-left div.visible-xs.c-admin-nav__control:nth-child(3) ul.c-admin-nav__user-menu.dropup.open:nth-child(3) ul.dropdown-menu.animated.fadeIn li.c-admin-nav__user-menu__li:nth-child(5) > a:nth-child(1)"));
////		Assert.assertTrue(logOutButton.isDisplayed(), "logOutButton is not visible.");
////		//logOutButton.click();
////		log.info("Log Out button is visible.");
//

	}


