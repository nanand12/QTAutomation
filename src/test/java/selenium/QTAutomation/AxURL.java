package selenium.QTAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AxURL {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver d=new EdgeDriver();
		d.manage().window().maximize();
		d.get("https://theautomationzone.blogspot.com/2020/07/mix-of-basic-webelements.html");
		String ActualText=d.findElement(By.id("p3")).getText();
		System.out.println(ActualText);
		
		WebElement UserName=d.findElement(By.id("input1"));
		UserName.sendKeys("JAVA");
		System.out.println(UserName.getText());
		WebElement Password=d.findElement(By.id("input2"));
		Password.sendKeys("SELENIUM");
		System.out.println(UserName.getText());
		System.out.println(UserName.getAttribute("value"));
		System.out.println(Password.getAttribute("value"));
		
		UserName.clear();
		Password.clear();
		UserName.sendKeys("selenium");
		Password.sendKeys("java");
		
		System.out.println(UserName.getAttribute("value"));
		System.out.println(Password.getAttribute("value"));
		
		
		
		
	}

}
