package testsuite;

import browserfactory.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest
{
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public  void  setBaseUrl()
    {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToLoginPageSuccessfully()
    {
        // click on the ‘Login’ link
        WebElement linkText = driver.findElement(By.linkText("Log in"));
        linkText.click();

      //  Verify the text ‘Welcome, Please SignIn!
        String expectedText = "Welcome, Please Sign In!";
        String actualText = driver.findElement(By.tagName("h1")).getText();
        System.out.println(actualText);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials()
    {

        //Find the log in link and click on login link

        WebElement linkText = driver.findElement(By.linkText("Log in"));
        linkText.click();
        //find the field enter email address
        driver.findElement(By.id("Email")).sendKeys("prime@gmail.com");
        // find the password field enter in password
        driver.findElement(By.name("Password")).sendKeys("prime@123");
         driver.findElement(By.linkText("Log in")).click();
        System.out.println("Log out");
    }
    @Test
    public void verifyTheErrorMessage()
    {
        // Click on Login link
        WebElement linkText = driver.findElement(By.linkText("Log in"));
        linkText.click();
        // Enter invalid username
        driver.findElement(By.id("Email")).sendKeys("prim@gmail.com");
        // Enter invalid password
        driver.findElement(By.name("Password")).sendKeys("prime12");
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
        System.out.println("‘Login was unsuccessful Please correct the errors and try again. No customer account found’.");


    }

}
