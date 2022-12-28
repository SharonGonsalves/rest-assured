package utils;

import java.io.IOException;

import java.util.Properties;

public class Config {
	
private static Properties properties;
	
	public Config() {
		properties = new Properties();
		try {
			properties.load(getClass().getClassLoader().getResourceAsStream("environment.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String get(String key) {
		return properties.getProperty(key);
	}

	}


