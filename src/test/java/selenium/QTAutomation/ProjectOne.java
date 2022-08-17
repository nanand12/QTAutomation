package selenium.QTAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ProjectOne {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.in/");
		WebElement searchTextBox= d.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		WebElement submitIcon= d.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchTextBox.sendKeys("Mobile phones under 30000");
		//System.out.println(searchTextBox.getAttribute("value"));
		searchTextBox.submit();
		WebElement sortBy= d.findElement(By.xpath("//span[@class='a-dropdown-prompt']"));
		sortBy.click();
		WebElement clickOnNewestArrival= d.findElement(By.xpath("//a[@id='s-result-sort-select_4']"));
		clickOnNewestArrival.click();
		WebElement validateText= d.findElement(By.xpath("//span[text()='Newest Arrivals']"));
		System.out.println(validateText.getText());
		String validateTextFieldContent= validateText.getText();
		Assert.assertEquals(validateTextFieldContent, "Newest Arrivals");
		System.out.println("Assertion successful");
	}

}
