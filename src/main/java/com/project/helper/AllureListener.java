package com.project.helper;
import com.project.webdriver.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.*;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.cucumberjvm.callback.OnFailureCallback;

import java.net.MalformedURLException;

public class AllureListener implements OnFailureCallback{

    @Attachment(value = "{0}", type = "image/png")
    public byte[] saveImageAttach() {
        WebDriver driver = Driver.getDriver();
        byte[] bytes = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        return bytes;
    }

    public Object call() {
        return saveImageAttach();
    }
}