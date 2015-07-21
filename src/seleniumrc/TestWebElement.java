package seleniumrc;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

import org.openqa.selenium.server.SeleniumServer;


public class TestWebElement {

	private SeleniumServer server = null;
	private Selenium browser = null;

	// Instantiate object by creating a constructor

	public TestWebElement() throws Exception {
		//Starting the server
		server = new SeleniumServer();
		server.boot();
		server.start();// start the server
		//Staring the browser
		browser = new DefaultSelenium("localhost", 4444, "*firefox", "http://localhost:8080/Bugzilla/");
		browser.start(); // Start the client
		browser.open("http://localhost:8080/Bugzilla/");// this is going to open the web page in the browser
		browser.waitForPageToLoad("30000");//generate a delay for loading the webpage
		browser.windowMaximize();//Maximise the browser 



	}



	public void clickHyperLink() throws Exception {
		browser.click("//a[@id='enter_bug']/span[text()='File a Bug']");
		browser.waitForPageToLoad("30000");
		browser.waitForPageToLoad("30000");

	}


	public void typeInTextBox() throws Exception {
	   browser.type("//input[@name='Bugzilla_login']","naresh.kalakanti@gmail.com");
	   browser.type("//input[@id='Bugzilla_password']","cngldlab");
	   browser.type("//input[@id='quicksearch_top']","Selenium");
	}
	

	public void checkCheckBox() throws Exception {
		System.err.println("Check :" + browser.isChecked("//input[@name='Bugzilla_restrictlogin']"));
		System.err.println("Check :" + browser.isChecked("//input[@name='Bugzilla_restrictlogin']"));
		browser.check("//input[@name='Bugzilla_restrictlogin']");
		browser.uncheck("//input[@name='Bugzilla_restrictlogin']");
		
	}
	

	
	
	public void stopSelenium() throws Exception {
		browser.close();//close the web browser
		browser.stop();// stop the client
		server.stop();// stop the server

	}





	public static void main(String[] args) {
		try {
			TestWebElement obj = new TestWebElement();
			obj.clickHyperLink();
			obj.typeInTextBox();
//			obj.stopSelenium();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
