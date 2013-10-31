package com.small.design.pattern.util;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggerTool {
	
	 
	public static synchronized Logger getLogger() {
		Logger log =  LogManager.getLogManager().getLogger("design_pattern.log");
		return log;
	}
}
