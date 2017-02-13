package logDemo.logDemo;

import java.io.IOException;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {

	@Test
	public void logTest(){
		Logger logger = LoggerFactory.getLogger(getClass());
		for(int i = 100; i < 200; i ++){
			logger.debug("first logger test");
		}
	}
	
	@Test
	public void dailyTest() throws InterruptedException, IOException{
		Logger logger = LoggerFactory.getLogger("dailyLog");
		for(int i = 1; i < 50; i ++){
			logger.debug("daily logger test {}");
		}
	}
}
