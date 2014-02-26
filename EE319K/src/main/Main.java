package main;
import util.LittleEndianToBigEndian;


public class Main {
	public static void main(String args[]) throws Exception {
//		System.out.println(LittleEndianToBigEndian.parseFile("data/data.txt"));
		System.out.println(LittleEndianToBigEndian.parseKeilOutputFile("data/keil.txt"));
	}
}
