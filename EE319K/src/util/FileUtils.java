package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;

public class FileUtils {
	public static LinkedList<String> readFile(String fileName) {
		LinkedList<String> lines = new LinkedList<String>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			String currentLine = reader.readLine();
			while(currentLine != null) {
				lines.add(currentLine);
				currentLine = reader.readLine();
			}
			reader.close();
		} catch (Exception e) { e.printStackTrace(); }
		return lines;
	}
}
