package br.dev.sampaio.driver;

import io.appium.java_client.service.local.AppiumDriverLocalService;

public class ServiceManager {
    private static final ThreadLocal<AppiumDriverLocalService> service = new ThreadLocal<>();

    private ServiceManager() {
        super();
    }

    public static AppiumDriverLocalService getService() {
        return service.get();
    }

    public static void setService(AppiumDriverLocalService service) {
        ServiceManager.service.set(service);
    }

    public static void start() {
        ServiceManager.getService().start();
    }

    public static void stop() {
        if (ServiceManager.getService() != null) {
            ServiceManager.getService().stop();
        }
    }
}