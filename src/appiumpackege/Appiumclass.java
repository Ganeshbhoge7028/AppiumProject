package appiumpackege;



import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration; 


public class Appiumclass {
	 public static void main(String[] args) throws MalformedURLException,IllegalMonitorStateException {
		    
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("platformName", "Android");
		 caps.setCapability("deviceName", "RZ8M302TRPJ");
		 caps.setCapability("appPackage", "io.ionic.starter"); 
		 caps.setCapability("appActivity", "io.ionic.starter.MainActivity"); 
		 caps.setCapability("automationName", "uiautomator2");
	        caps.setCapability("nativeWebScreenshot", true);
	        caps.setCapability("autoWebview", false);

		 // Add other capabilities as needed
		 AndroidDriver<?> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);

	   //     dc.setCapability(MobileCapabilityType.APP, "C:Users\ganesh.bhoge\Downloads\com.afwsamples.testdpc_8.0.1-8001_minAPI21(nodpi)_apkmirror.com.apk");
	      
	       // URL url =new URL("http://127.0.0.1:4723/wd/hub");
	     //   driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
	        try {
	        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ion-input-1-lbl"))).sendKeys("Ganesh");
	            // Example: Click the "Sign in" button
	        //    MobileElement signInButton = (MobileElement) driver.findElement(By.xpath("//ion-button[contains(., 'Sign in')]"));
	         //   signInButton.click();

	        } catch (Exception e) {
	            e.printStackTrace();
	        };

	    }
}
