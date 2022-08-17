package selenium.QTAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://theautomationzone.blogspot.com/2020/07/mix-of-basic-webelements.html");
//		  WebElement element=d.findElement(By.id("mySelect"));
//		  Select select=new Select(element);
//		  List <WebElement> Elements=select.getOptions();
		List Elements=d.findElements(By.id("mySelect"));
		List<WebElement> select=new Select((WebElement) Elements).getOptions();
          for(int i =0;i<Elements.size();i++)
        	//  for(WebElement i:Elements)
          {
             String option= ((WebElement) Elements.get(i)).getText();
             System.out.println(option);
          }


	    }
	 
	

	}


