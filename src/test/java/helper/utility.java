package helper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class utility {
   public static WebDriver driver;

   public static void setUpDriver(){
       EdgeOptions options = new EdgeOptions();
       options.addArguments("--no-sandbox");
//       options.addArguments("--headless");
       WebDriverManager.edgedriver().setup();
       driver = new EdgeDriver(options);
       driver.manage().window().minimize();
   }

   public static void quitDriver(){
       driver.quit();
   }
}
