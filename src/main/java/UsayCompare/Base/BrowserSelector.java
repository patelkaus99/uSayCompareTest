package UsayCompare.Base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSelector extends Utils {

    //Browser selection method
    public void selectBrowser(String browserName) {
        if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\browserDriver\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else {
            System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\browserDriver\\chromedriver.exe");
            driver = new ChromeDriver();
        }
    }
}