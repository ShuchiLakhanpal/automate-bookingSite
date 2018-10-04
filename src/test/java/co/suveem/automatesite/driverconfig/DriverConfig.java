package co.suveem.automatesite.driverconfig;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class DriverConfig {
	
	private static Properties properties;
	
	private DriverConfig() {
		Path path = Paths.get("src","test","resources","config","driverconfig.yml");
		try {
			InputStream inputConfig = new FileInputStream(path.toFile());
			properties = new Properties();
			properties.load(inputConfig);
		} catch (IOException e) {
			System.out.println("Exception in reading file occured");
		}
	}
	
	public static String getProperty(String key) {
		if(properties == null) {
			new DriverConfig();
		}
		return properties.getProperty(key);
	}

}
