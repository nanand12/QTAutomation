package selenium.QTAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Project5 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.google.com/");
		List<WebElement> noOfLinks= d.findElements(By.tagName("a"));
		int size= noOfLinks.size();
		System.out.println(size);
		for(WebElement linkName:noOfLinks ) {
			System.out.println(linkName.getText()+" "+ linkName.getAttribute("href"));
		}
		
	}

}
