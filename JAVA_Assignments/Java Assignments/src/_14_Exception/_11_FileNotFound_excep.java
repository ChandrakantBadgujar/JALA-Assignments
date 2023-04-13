package _14_Exception;

import java.io.File;
import java.io.FileNotFoundException;

public class _11_FileNotFound_excep {

	public static void main(String[] args) {
		
		try {
            
            File file = new File("C/MyFile/New/file.txt");

            
            file.createNewFile();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Something went wrong!");
            e.printStackTrace();
        }

	}

}
