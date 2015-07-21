package seleniumrc;

import com.thoughtworks.selenium.*;

public class Sample extends SeleneseTestCase {
	public void setUp() throws Exception {
		setUp("http://www.bing.com","*firefox");
	}
    public void testTemp () throws Exception {
    	selenium.start();
    	selenium.open("/");
    	selenium.windowMaximize();
    	selenium.type("sb_form_q","nareshkalakanti");	
    	selenium.click("sb_form_go");
    	
    }
	

}
