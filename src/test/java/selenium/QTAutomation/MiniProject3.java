package selenium.QTAutomation;

import java.awt.Desktop.Action;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MiniProject3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pepperfry.com");
		String ActualTitle = "Online Furniture Shopping Store: Shop Online in India for Furniture, Home Decor, Homeware Products @ Pepperfry";
		String Title = driver.getTitle();
		System.out.println(Title);
		if (ActualTitle.equals(Title)) {
			System.out.println("Title text Validated");
		} else
			System.out.println("Title text not matched.");

		WebElement Furniture = driver
				.findElement(By.xpath("//a[@href='https://www.pepperfry.com/furniture.html?type=hover-furniture']"));
		Actions action = new Actions(driver);
		action.moveToElement(Furniture).build().perform();
		Thread.sleep(4000);
		WebElement Seating = driver.findElement(By.linkText("Seating"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(Seating).build().perform();

		WebElement Benches = driver.findElement(By.linkText("Benches"));
		Actions action2 = new Actions(driver);
		action2.moveToElement(Benches).build().perform();
		Benches.click();

		List<WebElement> Benchnames = driver.findElements(By.xpath("//li[@class='clip-main-cat carousel-cell ']"));
		int numberofbenches = Benchnames.size();
		System.out.println("Number of Benches : " + numberofbenches);

		for (int i = 0; i <= Benchnames.size(); i++) {
			String name1 = Benchnames.get(i).getText();

			System.out.println(name1);

			Thread.sleep(2000);
			WebElement IB = driver.findElement(By.xpath("//p[text()='16 options']"));
			String num = IB.getText().split(" ")[0];
			System.out.println(num);
		
			if (Integer.valueOf(num) > 1) {
				System.out.println("Industrial Benches are more than 1.");
			} else
				System.out.println("Industrial Benches is 1 or less than 1.");
		
	}
	// Thread.sleep(2000);
	// driver.close();

}
}
