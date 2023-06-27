package testsuite;

import browserfactory.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class RegisterTest extends BaseTest
{
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setBaseUrl()
    {
        // setUp the browser
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully()
    {
        //click on the ‘Register’ link
        driver.findElement(By.linkText("Register")).click();
        //Verify the text ‘Register’
       String register =  driver.findElement(By.tagName("h1")).getText();
        System.out.println(register+" text should be display");
    }
    @Test
    public void userSholdRegisterAccountSuccessfully()
    {
        //click on the ‘Register’ link
        driver.findElement(By.linkText("Register")).click();
        //Select gender radio button
        driver.findElement(By.className("female")).click();
        //Enter First name
        driver.findElement(By.id("FirstName")).sendKeys("Sita");
        //Enter Last name
        driver.findElement(By.id("LastName")).sendKeys("Ram");
       // Select Day Month and Year
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("5");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("August");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1999");
        //Enter Email address
        driver.findElement(By.id("Email")).sendKeys("sitaram15@gmail.com");
        //Enter Password
        driver.findElement(By.id("Password")).sendKeys("ram@11223");
        //Enter Confirm password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("ram@11223");
        //Click on REGISTER button
        driver.findElement(By.xpath("//button[@id='register-button']")).click();


    }
}
