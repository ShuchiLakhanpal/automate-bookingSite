package co.suveem.automatesite.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
	
	public static String getFileName(String testName) {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("ddMMyyyyHHmmss");
		return testName+"_"+format.format(date)+".png";
	}

}
