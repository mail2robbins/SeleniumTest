
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;



public class Test1 {




    @Test
    public void newTest1(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\chandrashekarn\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://192.168.1.61/PriceWatch");



    }







    }

