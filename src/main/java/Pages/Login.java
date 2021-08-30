package Pages;

import Base_Grid.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login  {
    WebDriver driver;

    public Login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "_username")
    WebElement usernameField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[3]/button[1]")
    WebElement loginButton;

    //username
    public void setUsernameField(String usr) {
        usernameField.sendKeys(usr);
    }

    //password
    public void setPasswordField(String psw) {
        passwordField.sendKeys(psw);
    }

    public MainPanel clickonLogin() {
        loginButton.click();
        return new MainPanel(driver);
    }
}