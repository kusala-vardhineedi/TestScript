package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;



public class code {

private WebDriver driver;
	
	public static void main(String[] args) {

		
		code obj = new code();
		obj.setUp();
		obj.orderProduct();
		obj.tearDown();
	}
	
	public void setUp() {
        // Set the system property for the Edge browser driver executable
        System.setProperty(locators.path, locators.EDGE_DRIVER_PATH);

        // Initialize the Edge driver
        driver = new EdgeDriver();
        
    }
	
	public void orderProduct() {
        // Open the Amazon website
        driver.get(locators.AMAZON_URL);
        
        
        
        WebElement button = driver.findElement(By.className(locators.sign_in));
		button.click();
		WebElement button1 = driver.findElement(By.id(locators.mobile_num_box));
		button1.sendKeys(locators.login_id);
		WebElement button2 = driver.findElement(By.id(locators.continue_button));
		button2.click();
		WebElement button3 = driver.findElement(By.id(locators.password_box));
		button3.sendKeys(locators.password);
		WebElement button4 = driver.findElement(By.id(locators.submit_button));
		button4.click();
		WebElement button5 = driver.findElement(By.id(locators.search_box));
		button5.sendKeys(locators.product);
		WebElement button6 = driver.findElement(By.id(locators.search_symbol));
		button6.click();
		WebElement button7 = driver.findElement(By.className(locators.product_selection));
		button7.click();
		
	}
	
	 public void tearDown() {
	        // Close the browser
	        driver.quit();
	    }

	
}
