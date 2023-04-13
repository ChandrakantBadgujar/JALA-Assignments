package _15_Java_IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class _05_WriteText_FileReader {

	public static void main(String[] args) {

		try {
			File file = new File("example.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

			br.close();
			fr.close();
		} catch (IOException e) {
			System.out.println("Error reading file");
			e.printStackTrace();
		}

	}

}
