package selenium.QTAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstSeleniumPRG {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriverManager.firefoxdriver().setup();
	WebDriver d= new ChromeDriver();
	WebDriver d1=new FirefoxDriver();
	d.manage().window().maximize();
	d.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.2.1");
}
}
