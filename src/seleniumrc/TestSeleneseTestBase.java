package seleniumrc;

import org.openqa.selenium.server.SeleniumServer;

import com.thoughtworks.selenium.SeleneseTestBase;

public class TestSeleneseTestBase extends SeleneseTestBase {
	private SeleniumServer server = null;
	
      public void startServer() throws Exception {
    	     server = new SeleniumServer();
    	     server.start();
    	     setUp("http://www.seleniumhq.org/","*firefox", 4444);
    	     // We get selenium ready made object -->selenium
    	     selenium.open("/");
    	     selenium.windowMaximize();
    	     Thread.sleep(3000);
    	     tearDown();//Method closing browser and stopping client
    	     server.stop();
    	  
      }
	
	public static void main(String[] args) {
	try {
		TestSeleneseTestBase obj = new TestSeleneseTestBase();
		obj.startServer();
		
	} catch (Exception e) {
		e.printStackTrace();	}

	}

}
