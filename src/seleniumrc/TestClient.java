package seleniumrc;

import org.openqa.selenium.server.SeleniumServer;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class TestClient {
private SeleniumServer server = null ;
private Selenium browser = null;

public void startServer() throws Exception {
	server = new SeleniumServer();
	server.start();
	System.err.println("Server Started =============");
	
	browser = new DefaultSelenium("localhost",4444,"*firefox","http://www.seleniumhq.org/docs/");
	browser.start();
	browser.open("/download/");// Open the base url in the browser or it will append the string and open the url
	browser.windowMaximize(); // maximise the browser window
	System.err.println("Client  Started =============");
	
	Thread.sleep(3000);
	
	//browser.close(); // close the server
	browser.stop(); // stop the client
	
	server.stop();
	
}
	
	public static void main(String[] args) {
		
		try {
			TestClient obj = new TestClient();
			obj.startServer();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
