package _15_Java_IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class _02_WriteText_OutputStream {

	public static void main(String[] args) {

		String text = "Hi am Text File!"; // The text we want to write to the file

		try {

			FileOutputStream fos = new FileOutputStream("output.txt");


			byte[] bytes = text.getBytes();

			// Use the FileOutputStream to write the byte array to the file
			fos.write(bytes);


			fos.close();

			System.out.println("Successfully wrote text to file!");
		} 
		catch (IOException e) {
			System.err.println("Error writing text to file: " + e.getMessage());
		}

	}

}
