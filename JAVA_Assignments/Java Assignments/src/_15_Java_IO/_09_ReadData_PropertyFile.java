package _15_Java_IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class _09_ReadData_PropertyFile {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream("config.properties");
          
            prop.load(input);
         
            System.out.println(prop.getProperty("db.host"));
            System.out.println(prop.getProperty("db.port"));
            System.out.println(prop.getProperty("db.username"));
            System.out.println(prop.getProperty("db.password"));
        } catch (IOException ex) {
            ex.printStackTrace();
	}
}
}
