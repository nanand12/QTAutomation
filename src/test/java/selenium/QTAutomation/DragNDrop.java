package selenium.QTAutomation;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class DragNDrop {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver d=new ChromeDriver();
        d.manage().window().maximize();
        d.navigate().to("http://www.uitestpractice.com/Students/Actions");
        //WebElement draggableicn=d.findElement(By.id("draggable"));
       // WebElement droppableicn=d.findElement(By.id("droppable"));
            // WebElement doubleClick= d.findElement(By.xpath(//button[@name='dblClick']));
        		//Actions builder = new Actions(driver);
       
          // action.dragAndDrop(draggableicn, droppableicn).build().perform();
       // action.doubleClick(doubleClick).build().perform();
        System.out.println("DoubleClick is performed");

    }
 
}