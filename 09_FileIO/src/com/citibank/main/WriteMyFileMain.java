package com.citibank.main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.citibank.main.domain.MyFileWriter;
import com.citibank.main.domian.WriteMyFile;

public class WriteMyFileMain {

	public static void main(String[] args) {
		String path = "";
		String data = "";
		boolean isAppend = false;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Write Menu :::");
		System.out.println("--------------");
		System.out.println("Enter the Path & name file with extension");
		path = scanner.next();
		scanner.nextLine();
		System.out.println("Enter the Date to be written inside text file");
		data = scanner.nextLine();
		System.out.println("Do you want to Append true/false");
		isAppend = scanner.nextBoolean();

		File file = new File(path);

		FileWriter fileWriter = null;
		MyFileWriter myFileWriter = null;

		try {
			fileWriter = new FileWriter(path, isAppend);
			myFileWriter = new MyFileWriter(fileWriter, data);
			if (myFileWriter.writeFile()) {
				System.out.println("File has been written");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Error While Closing");
			}
			
		}

		

	}

}
