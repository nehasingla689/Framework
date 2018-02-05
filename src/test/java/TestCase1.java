import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
    WebDriver driver;
    @Test
    public  void method1()
    {
driver.get("http://toolsqa.com/automation-practice-form/");
driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[8]/input")).sendKeys("neha");
driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[11]/input")).sendKeys("singla");


    }
    @Before
    public  void method2()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\neha.singla03\\Downloads\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");
      driver=new ChromeDriver();
    }
    @After
    public  void method3()
    {
driver.close();
    }
}
