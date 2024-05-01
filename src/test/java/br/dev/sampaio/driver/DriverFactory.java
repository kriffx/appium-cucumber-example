package br.dev.sampaio.driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.io.File;

public class DriverFactory {
    public static AppiumDriver createInstance() {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setApp(new File("src\\test\\resources\\TestApp.apk").getAbsolutePath());
        options.setPlatformName("Android");
        options.setDeviceName("emulator-5554");
        options.setNoSign(true);
        options.setAutoGrantPermissions(true);
        options.setAppPackage("com.swaglabsmobileapp");
        options.setAppActivity("com.swaglabsmobileapp.MainActivity");

        return new AppiumDriver(ServiceManager.getService().getUrl(), options);
    }
}