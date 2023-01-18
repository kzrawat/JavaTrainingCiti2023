package com.citibank.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

import com.citibank.main.domain.MyFileReader;

public class ReadMyFileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = null;
		String response="";
		String path;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the File to be read");
		path = scanner.next();
		file = new File(path);
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			MyFileReader myFileReader = new MyFileReader(bufferedReader);
			response = myFileReader.readFileLineByLine();
			System.out.println("File has been read");
			System.out.println("Data inside file :\n" + response);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error While Doing the Buffered reader");
		} finally {
			try {
				fileReader.close();
				bufferedReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Error while closing ");
			}

		}

	}

//------------------------------------
//		File file = null;
//		FileReader fileReader = null;
//		String response;
//		String path;
//
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the File to be read");
//		path = scanner.next();
//		file = new File(path);
//
//		try {
//			fileReader = new FileReader(file);
//			MyFileReader myFileReader = new MyFileReader(file, fileReader);
//			response = myFileReader.readFile();
//
//			System.out.println("File has been read");
//			System.out.println("Data inside file :\n" + response);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			System.out.println("Erroe while Reading");
//		} finally {
//			try {
//				fileReader.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				System.out.println("Error while closing");
//			}
//		}
//
//	}

}
