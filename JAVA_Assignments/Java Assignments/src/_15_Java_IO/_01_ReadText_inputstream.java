package _15_Java_IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class _01_ReadText_inputstream {

	public static void main(String[] args) {

		try {
			File file = new File("example.txt");
			FileInputStream inputStream = new FileInputStream(file);
			InputStreamReader reader = new InputStreamReader(inputStream);
			BufferedReader bufferedReader = new BufferedReader(reader);

			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}

			bufferedReader.close();
			reader.close();
			inputStream.close();

		} 
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
