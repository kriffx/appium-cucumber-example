package br.dev.sampaio.steps;

import br.dev.sampaio.driver.DriverFactory;
import br.dev.sampaio.driver.DriverManager;
import br.dev.sampaio.driver.ServiceFactory;
import br.dev.sampaio.driver.ServiceManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks {
    @Before
    public void beforeTest() {
        AppiumDriverLocalService appiumDriverLocalService = ServiceFactory.createInstance();
        ServiceManager.setService(appiumDriverLocalService);
        ServiceManager.start();

        AppiumDriver driver = DriverFactory.createInstance();
        DriverManager.setDriver(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void afterTest() {
        DriverManager.quit();
        ServiceManager.stop();
    }
}