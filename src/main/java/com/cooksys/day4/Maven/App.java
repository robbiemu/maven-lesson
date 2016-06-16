package com.cooksys.day4.Maven;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

	public static Logger Log = LoggerFactory.getLogger(App.class);
	
	public static void main(String[] args) {
		Log.trace("aspect-oriented autogenerated style trace messages");
		Log.debug("debug");
		Log.info("info");
		Log.warn("warning");
		Log.error("error");
	}

}
