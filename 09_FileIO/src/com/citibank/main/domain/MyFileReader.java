package com.citibank.main.domain;

import java.awt.image.BufferedImageFilter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class MyFileReader {
	private char[] data;
	private int length;
	private File file;
	private Reader reader;
	private BufferedReader bufferedReader;

	public MyFileReader(File file, Reader reader) {
		super();
		this.file = file;
		this.reader = reader;
	}

	public MyFileReader(BufferedReader bufferedReader) {
		this.bufferedReader = bufferedReader;
	}

	public String readFileLineByLine() {
		String fileData = "";
		try {
			String temp = bufferedReader.readLine();
			do {
				fileData = fileData + temp + "\n";
				temp = bufferedReader.readLine();
			} while (temp != null);

			return fileData;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error while reading file !!!");
		} finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Error while closing bufferedReader");
			}
		}
		return null;
	}

	public String readFile() {
		try {
			length = (int) file.length();
			data = new char[length];
			reader.read(data);
			String dataFromFile = new String(data);
			return dataFromFile;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error While Reading file !!!");
		} finally {
			try {
				System.out.println("Rawat-1");
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Error while closing file !!!");
			}
		}
		return " ";

	}

}
