package corejava;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Log4jDemo {

	private static final Logger logger = LogManager.getLogger(Log4jDemo.class);

	@Test
	public void log4jTest() {
		// basic log4j configurator
		BasicConfigurator.configure();
		logger.info("Hello world");
		logger.info("we are in logger info mode");

	}

}