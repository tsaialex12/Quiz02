package test;

import java.io.*;

public class test02 {

	public static void main(String[] args) {
		try {
			FileWriter file = new FileWriter("rand.txt");
			for (int i = 0; i < 1000; i++) {
				int a = (int) (Math.random() * 1000) + 1;
				file.write(a + "\n");
			}
			file.close();
		} catch (Exception e) {
			System.out.print("Something Error");
		}
	}
}
