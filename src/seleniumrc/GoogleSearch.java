package seleniumrc;

import com.thoughtworks.selenium.DefaultSelenium;

public class GoogleSearch {

	public static void main(String[] args) {
		// for IE = "internetexplorer" 
		// for Firefox = "firefox"
		// for google chrome ="googlechrome"
		DefaultSelenium selenium = new DefaultSelenium("localhost", 4444, "*firefox","http://bing.com");
		selenium.start(); // launch browser and open the URL
		selenium.open("/");
		selenium.windowMaximize();
		selenium.type("sb_form_q","nareshkalakanti");
		selenium.click("sb_form_go");
	}
}
