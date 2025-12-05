package UtilityAE;

import java.io.FileInputStream;
import java.util.Properties;

import FrameworkExceptionsAE.fileNotFoundException;

public class properties {
	
	public String propUtil(String key) {
		
	try {
		FileInputStream fis = new FileInputStream("C:\\Users\\Nis\\git\\repository13\\AutomationExercise\\src\\main\\resources\\data.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String data = prop.getProperty(key);
		return data;
	} catch (Exception e) {
		throw new fileNotFoundException("filenotfound"+e.getMessage());
	}
	
		
	}

}
