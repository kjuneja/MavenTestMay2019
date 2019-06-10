package logging;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoggerTest {
	
	static String configFileName ="/Users/kunaljuneja/Desktop/Flexon Training/practicemaven/log4j.properties";
	
	public static final Logger logger = Logger.getLogger(LoggerTest.class.getName());

	
@BeforeTest
 public static void getLogger() {
	
	PropertyConfigurator.configure(configFileName);
	
}

@Test
public void testLogger() {
	
	logger.info("log.test1");
	logger.info("log test2");
	logger.info("Browser Closed");
	logger.error("Invalid browser");
	
}
}



