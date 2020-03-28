package br.com.rsinet.bdd.mobile.appium.utility;

	import io.appium.java_client.MobileElement;
	import io.appium.java_client.PerformsTouchActions;
	import io.appium.java_client.TouchAction;
	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.touch.offset.PointOption;

	public class rolagemdeTela {

		private static TouchAction touch;
		private static AndroidDriver<MobileElement> driver;

		public rolagemdeTela(AndroidDriver<MobileElement> driver){

			this.driver = driver;
			this.touch = new TouchAction (this.driver);
		}

		public void scroll(String buscar) {
			
			driver.findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
							+ buscar  + "\").instance(0))")
			.click();
			
		}	
}
