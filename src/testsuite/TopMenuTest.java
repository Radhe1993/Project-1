package testsuite;

import browserfactory.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest
{
    String baseUrl = " https://demo.nopcommerce.com/";
    @Before
    public void setBaseUrl()
    {
        // setUp the browser
        openBrowser(baseUrl);
    }

    @Test
    public  void  userShouldNavigateToComputerPageSuccessfully()
    {

         // click on the ‘Computers’ Tab
         driver.findElement(By.linkText("Computers")).click();
         // Verify the text ‘Computers’
         String text = driver.findElement(By.tagName("h1")).getText();
         System.out.println(text+" text Should be display");
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully()
    {
        // click on the ‘Electronics’ Tab
        driver.findElement(By.linkText("Electronics")).click();
        //Verify the text ‘Electronics’
        String electronics = driver.findElement(By.tagName("h1")).getText();
        System.out.println(electronics+" text Should be display");

    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully()
    {
        //click on the ‘Apparel’ Tab
        driver.findElement(By.linkText("Apparel")).click();
        // Verify the text ‘Apparel’
        String apparel = driver.findElement(By.tagName("h1")).getText();
        System.out.println(apparel+" text should be display");
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully()
    {
        // click on the ‘Digital downloads’ Tab
        driver.findElement(By.linkText("Digital downloads")).click();
        // Verify the text ‘Digital downloads'
        String digital = driver.findElement(By.tagName("h1")).getText();
        System.out.println(digital+" text should be display");
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully()
    {
        // userShouldNavigateToBooksPageSuccessfully
        driver.findElement(By.linkText("Books")).click();
        //click on the ‘Books’ Tab
        String book = driver.findElement(By.tagName("h1")).getText();
        System.out.println(book+" text should be display");
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully()
    {
        //click on the ‘Jewelry’ Tab
        driver.findElement(By.linkText("Jewelry")).click();
        //Verify the text ‘Jewelry’
        String jewelry = driver.findElement(By.tagName("h1")).getText();
        System.out.println(jewelry+" text should be display");
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully()
    {
        //click on the ‘Gift Cards’ Tab
        driver.findElement(By.linkText("Gift Cards")).click();
        //Verify the text ‘Gift Cards’
        String gift = driver.findElement(By.tagName("h1")).getText();
        System.out.println(gift+" text should be display");
    }
}
