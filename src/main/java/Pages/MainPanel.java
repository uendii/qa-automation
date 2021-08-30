package Pages;

import Base_Grid.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MainPanel  {

    WebDriver driver;

    public MainPanel (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(linkText = "Dashboard")
    WebElement dashboard;

    public Boolean dashboardVisibility() {
        return dashboard.isDisplayed();
    }
}
