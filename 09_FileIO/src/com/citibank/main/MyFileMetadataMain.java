package com.citibank.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import com.citibank.main.domain.MyFileMetadata;
import com.citibank.main.domain.ReadMyFile;
import com.citibank.main.domian.WriteMyFile;

public class MyFileMetadataMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		MyFileMetadata myfileMetadata = new MyFileMetadata();
//		myfileMetadata.printFileMetadata();

//		ReadMyFile readMyfile = new ReadMyFile();
//		readMyfile.readFile();

		String path = "";
		String data = "";
		boolean isAppend=false;
		

		Scanner scanner = new Scanner(System.in);

		System.out.println("Write Menu :::");
		System.out.println("--------------");
		System.out.println("Enter the Path & name file with extension");
		path = scanner.next();
		System.out.println("Enter the Date to be written inside text file");
		data = scanner.next();
		System.out.println("Do you want to Append true/false");
		isAppend = scanner.nextBoolean();

//		File file = new File(path);

		FileOutputStream fileOutputStream = null;
		WriteMyFile writeMyFile = null;
		
		try {
//			fileOutputStream = new FileOutputStream(file);
			fileOutputStream = new FileOutputStream(path, isAppend);
			writeMyFile = new WriteMyFile(fileOutputStream, data);
			if (writeMyFile.writeFile()) {
				System.out.println("File has been written");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error While Creating the file");
		} finally {
			try {
				fileOutputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Error Closing FileOutputStream");
			}
		}

	}

}
