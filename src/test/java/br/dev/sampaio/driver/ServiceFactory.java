package br.dev.sampaio.driver;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class ServiceFactory {
    public static AppiumDriverLocalService createInstance() {
        return new AppiumServiceBuilder().usingAnyFreePort().build();
    }
}
