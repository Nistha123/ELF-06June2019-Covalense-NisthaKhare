package com.covalense.javaapp.filehandlingex;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestNewFile {

	public static void main(String[] args) {
		String poem = "How i wonder what you are";

		byte b[] = poem.getBytes();

		try {
			FileOutputStream fout = new FileOutputStream("Poem.txt" , true);

			fout.write(b);

			fout.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
