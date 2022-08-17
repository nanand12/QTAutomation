package selenium.QTAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Project4 {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
	        WebDriver d = new ChromeDriver();
	        d.manage().window().maximize();
	        d.get("https://www.trivago.in/");
	        d.findElement(By.id("input-auto-complete")).sendKeys("Mumbai");
	        Actions action = new Actions(d);
	        WebElement action1 = d.findElement(By.xpath("//span[normalize-space()='City · Maharashtra, India']"));
	        action1.click();
	        System.out.println("qwerty");
	        WebElement wait = new WebDriverWait(d, Duration.ofSeconds(2)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Check in']")));
	        System.out.println("asadcsc");
	        d.close();
	}

}
