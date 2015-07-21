package seleniumrc;

import org.openqa.selenium.server.RemoteControlConfiguration;
import org.openqa.selenium.server.SeleniumServer;

public class TestServer {
	
	private SeleniumServer server = null;
	private RemoteControlConfiguration rc = null;
	
	public void startServer() throws Exception {
		rc = new RemoteControlConfiguration();
		rc.setPort(4546);
		rc.setLogOutFileName("/Users/naresh/Documents/Logs/selenium.log");
		// We need to pass the object rc inside the constructor of selenium server
		server = new SeleniumServer(rc);
		server.start();
		server.stop();
		
	}

	public static void main(String[] args) {
		try {
			TestServer obj = new TestServer();
			obj.startServer();
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
