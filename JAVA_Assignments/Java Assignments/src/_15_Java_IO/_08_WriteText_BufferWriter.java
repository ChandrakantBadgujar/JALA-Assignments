package _15_Java_IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class _08_WriteText_BufferWriter {

	public static void main(String[] args) {

		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter("output.txt"));
			writer.write("Hello, world!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (writer != null) {
					writer.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
