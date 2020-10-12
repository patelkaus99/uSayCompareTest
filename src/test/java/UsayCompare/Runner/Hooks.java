package UsayCompare.Runner;

import UsayCompare.Base.BasePage;
import UsayCompare.Base.BrowserSelector;
import UsayCompare.Base.LoadProp;
import UsayCompare.Base.Utils;
import cucumber.api.java.After;
import cucumber.api.java.Before;


import java.util.concurrent.TimeUnit;

public class Hooks extends BasePage {

    BrowserSelector browserSelector=new BrowserSelector();

    @Before
    public void openBrowser(){
        browserSelector.selectBrowser(new LoadProp().getProperty("browser"));
        driver.get(new LoadProp().getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @After
    public void closeBrowser(){
          driver.quit();
    }


}
