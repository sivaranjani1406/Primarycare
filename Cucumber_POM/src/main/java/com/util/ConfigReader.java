package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private Properties prop;
	
	public Properties init_prop()
	{
		prop = new Properties();
			FileInputStream fis;
			try {
				fis = new FileInputStream("./src/test/resources/config/config.properties");
				prop.load(fis);
			} 
			catch (Exception e) {
				
				e.printStackTrace();
			}
			
	
		return prop;
	}
	
	
	
}
