package _14_Exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class _12_IOException {

	public static void main(String[] args) {
		
		try {
            File file = new File("C/New/file.txt");
            FileReader fr = new FileReader(file);
            fr.read();
        } catch (IOException e) {
            System.out.println("An IOException occurred: " + e.getMessage());
        }

	}

}
