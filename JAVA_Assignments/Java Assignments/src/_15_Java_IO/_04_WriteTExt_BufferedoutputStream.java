package _15_Java_IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _04_WriteTExt_BufferedoutputStream {

	public static void main(String[] args) {
		try {
			String text = "Hello, World!";
			BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("File.txt"));
			outputStream.write(text.getBytes());
			outputStream.close();
			System.out.println("File written successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
