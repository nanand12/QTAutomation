package selenium.QTAutomation;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class DragNDrop {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver d=new ChromeDriver();
        d.manage().window().maximize();
        d.navigate().to("http://www.uitestpractice.com/Students/Actions");
        //WebElement draggableicn=d.findElement(By.id("draggable"));
       // WebElement droppableicn=d.findElement(By.id("droppable"));
        WebElement doubleClick= d.findElement(By.xpath(//button[@name='dblClick']));
       Actions action=new Actions(d);
       // action.dragAndDrop(draggableicn, droppableicn).build().perform();
        action.doubleClick(doubleClick).build().perform();
        System.out.println("DoubleClick is performed");

    }
 
}