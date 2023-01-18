package com.citibank.main.domain;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadMyFile {
	
	private String path = "C:\\JavaTraining\\test.txt";
	private InputStream inputStream;
//	private byte[] data = new byte[100];
	private byte[] data;
	private int arrayLength;
	public void readFile() {
		try {
			File file = new File(path);
			arrayLength = (int) file.length();
			data = new byte[arrayLength];
			inputStream = new FileInputStream(path);
			inputStream.read(data);
			for (byte b : data) {
				System.out.print((char)b);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Path of file is not correct");
//			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error while reading file");
//			e.printStackTrace();
		}
		finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Fail to close file");
//				e.printStackTrace();
			}
		}
		
		
	}
	

}
