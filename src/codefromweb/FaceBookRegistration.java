package codefromweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookRegistration {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='u_0_1']")).sendKeys("anuka");
		driver.findElement(By.xpath(".//*[@id='u_0_3']")).sendKeys("positive");
		driver.findElement(By.xpath(".//*[@id='u_0_5']")).sendKeys("my_debota@hotmail.com");
		driver.findElement(By.xpath(".//*[@id='u_0_8']")).sendKeys("my_debota@hotmail.com");
		driver.findElement(By.xpath(".//*[@id='u_0_a']")).sendKeys("apositive");
		new Select(driver.findElement(By.xpath(".//*[@id='month']"))).selectByVisibleText("Mar");
        new Select(driver.findElement(By.xpath(".//*[@id='day']"))).selectByVisibleText("27");
        new Select(driver.findElement(By.xpath(".//*[@id='year']"))).selectByVisibleText("1960");
        driver.findElement(By.id("u_0_d")).click();
        driver.findElement(By.id("u_0_i")).click();
	}

}
