package selenium.QTAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class trivagoProject {

	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.trivago.in/");
        Thread.sleep(1000);
        driver.findElement(By.id("input-auto-complete")).sendKeys("Mumbai");
        Thread.sleep(1000);
        Actions action = new Actions(driver);
        WebElement action1 = driver.findElement(By.xpath("//div[@class='text-grey-900 text-l truncate']"));
        action1.click();
        
        //WebElement checkinbtn = driver.findElement(By.xpath("//span[normalize-space()='Check in']"));
        //checkinbtn.click();
        //Thread.sleep(1000);
        System.out.println("click");
                
        //SelectDate("27","August","2022");
        driver.findElement(By.xpath("//button[@data-testid='calendar-checkin']")).click();
        System.out.println("oototo");
        driver.findElement(By.xpath("//span[@class='flex flex-col text-s text-grey-900'][1]")).click();
        System.out.println("assdd");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='flex flex-col text-s text-grey-900'][2]")).click();
        System.out.println("wqwqasa");
        WebElement guestselect = driver.findElement(By.xpath("//button[@data-testid='guest-selector']"));
        guestselect.click();

	   
	}

}
