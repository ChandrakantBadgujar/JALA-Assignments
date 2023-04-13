package _15_Java_IO;

import java.io.FileWriter;
import java.io.IOException;

public class _06_WriteTExt_FileWriter {

	public static void main(String[] args) {
		
		  String text = "I am Sonu!";
	        String fileName = "output.txt";

	        try {
	            FileWriter writer = new FileWriter(fileName);
	            writer.write(text);
	            writer.close();
	            System.out.println("Successfully wrote text to file.");
	        } 
	        catch (IOException e) {
	            System.out.println("An error occurred.");
	            e.printStackTrace();
	        }
	}

}
