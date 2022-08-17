package selenium.QTAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PractiseMat {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://www.uitestpractice.com/Students/Form");
		WebElement firstName=d.findElement(By.xpath("//input[@id='firstname']"));
		firstName.sendKeys("Nitin");
		System.out.println(firstName.getAttribute("value"));
		WebElement lastName= d.findElement(By.xpath("//input[@id='lastname']"));
		lastName.sendKeys("Anand");
		System.out.println(lastName.getAttribute("value"));
		WebElement marritialStatus= d.findElement(By.xpath("//label[normalize-space()='Single']//input[@name='optradio']"));
		marritialStatus.click();
		System.out.println("Marritial status of User is:"+marritialStatus.getAttribute("value"));
		WebElement userHobby=d.findElement(By.xpath("//input[@value='cricket']"));
		userHobby.click();
		System.out.println("Hobby of User is:"+userHobby.getAttribute("value"));
		
		Select select= new Select(d.findElement(By.xpath("//select[@id='sel1']")));
		select.selectByVisibleText("Denmark");
		System.out.println("Country name selected is:"+ select.getFirstSelectedOption().getText());
		
		d.findElement(By.id("datepicker")).click();
		WebElement dateOfBirthMonth= d.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select select1= new Select(dateOfBirthMonth);
		select1.selectByVisibleText("Dec");
		//System.out.println("Month of Birth selected is:"+ select1.getFirstSelectedOption().getText());
		
		WebElement yearOfBirth= d.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select select2= new Select(yearOfBirth);
		select1.selectByVisibleText("1993");
		//System.out.println("Year of Birth selected is:"+ select2.getFirstSelectedOption().getText());
		
		WebElement dateOfMonth= d.findElement(By.xpath("//a[@class='ui-state-default ui-state-active ui-state-hover']"));
		dateOfMonth.click();
		//System.out.println("DOB of user is:"+ dateOfMonth.getAttribute("value"));
		
//		d.findElement(By.id("datepicker")).click(); 
//        WebElement Month=d.findElement(By.className("ui-datepicker-month")); 
//        Select select_M=new Select(Month); 
//        select_M.selectByVisibleText("Dec");
//
//        WebElement yrs=d.findElement(By.className("ui-datepicker-year")); 
//        Select select_yrs=new Select(yrs); 
//        select_yrs.selectByVisibleText("2000");

        d.findElement(By.xpath("//a[text()='27']")).click();
		d.findElement(By.xpath("//input[@id='phonenumber']")).sendKeys("5464646");
		d.findElement(By.xpath("//input[@id='username']")).sendKeys("Nitin");
		d.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		d.findElement(By.xpath("//textarea[@id='comment']")).sendKeys("All Good");
		d.findElement(By.xpath("//input[@id='pwd']")).sendKeys("126464tedfwsg");
		d.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("Automated");
		
		
		
		
		
		
	
	}

}
