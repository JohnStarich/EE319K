package util;

import java.util.LinkedList;

public class LittleEndianToBigEndian {
	public static String parseFile(String fileName) throws Exception {
		return ListUtils.stringByConcatListWithString(parseList(FileUtils.readFile(fileName)), "\n");
	}
	
	public static String parseKeilOutputFile(String fileName) {
		return ListUtils.stringByConcatListWithString(parseKeilOutputList(FileUtils.readFile(fileName)), "\n");
	}
	
	public static LinkedList<String> parseList(LinkedList<String> lines) {
		LinkedList<String> linesModified = new LinkedList<String>();
		for(String line : lines)
			if(line != null && line.length() == 8)
				linesModified.add(line.substring(6,8)+line.substring(4,6)+line.substring(2,4)+line.substring(0,2));
		return linesModified;
	}
	
	public static LinkedList<String> parseKeilOutputList(LinkedList<String> lines) {
		LinkedList<String> linesModified = new LinkedList<String>();
		lines.removeFirst();
		lines.removeLast();
		lines.removeLast();
		for(String line : lines) {
			int length = line.length();
			if(line != null && length >= 9) {
				line = line.substring(9, length-2);
				if(length >= 8)
					linesModified.add(line.substring(0, 8));
				if(length >= 16)
					linesModified.add(line.substring(8, 16));
				if(length >= 24)
					linesModified.add(line.substring(16, 24));
				if(length >= 32)
					linesModified.add(line.substring(24, 32));
			}
		}
		return parseList(linesModified);
	}
}
