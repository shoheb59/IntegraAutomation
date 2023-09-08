package TestRunner;

import Base.Setup;
import Pages.DeviceCountCheckInHomeAndDevice;
import org.testng.annotations.Test;

public class DeviceCountMatchRunner extends Setup {


    @Test
    public void countCheckDevice() throws InterruptedException {
        DeviceCountCheckInHomeAndDevice deviceCountCheckInHomeAndDevice = new DeviceCountCheckInHomeAndDevice(driver);
        driver.get("http://dev.tesenso.cloud");
        Thread.sleep(4000);
        deviceCountCheckInHomeAndDevice.countCheck();
        
    }
}
