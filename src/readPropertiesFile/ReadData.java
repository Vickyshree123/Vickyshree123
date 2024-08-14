package readPropertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.xmlbeans.impl.common.SystemCache;


public class ReadData {

	public static void main(String[] args) throws IOException {
		
		FileInputStream myFile = new FileInputStream(System.getProperty("user.dir")+"//FBData.properties");
		
		Properties prop = new Properties();
	prop.load(myFile);
		
		Object value = prop.getProperty("lastName");
		
		System.out.println(value);
	}

}
