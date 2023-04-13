package _15_Java_IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class _03_ReadText_BufferInputStream {

	public static void main(String[] args) {
		try {

			FileInputStream fileStream = new FileInputStream("File.txt");


			BufferedInputStream bufferedStream = new BufferedInputStream(fileStream);

			// create a byte array to store the text
			byte[] buffer = new byte[1024];


			int bytesRead = 0;

			while ((bytesRead = bufferedStream.read(buffer)) != -1) {
				String text = new String(buffer, 0, bytesRead);
				System.out.print(text);
			}


			fileStream.close();
			bufferedStream.close();
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
	}

}
