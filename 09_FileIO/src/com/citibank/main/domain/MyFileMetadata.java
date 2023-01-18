package com.citibank.main.domain;

import java.io.File;
import java.util.Date;

public class MyFileMetadata {
	public MyFileMetadata() {
		// TODO Auto-generated constructor stub
	}
	
	private String path = "C:\\JavaTraining\\test.txt";
	
	public void printFileMetadata() {
		System.out.println("File Print FileMetadata");
		File file= new File(path);
		
		if (file.exists()) {
			System.out.println("File Name ::" + file.getName());
			System.out.println("File path ::" + file.getAbsolutePath());
			System.out.println("File Size::" + file.length());
			System.out.println("Can open ::" +file.canExecute());
			System.out.println("Can Write ::" + file.canWrite());
			System.out.println("Can Read ::" + file.canRead());
			Date lastModifieldDate = new Date (file.lastModified());
			System.out.println("Last Modified ::" + lastModifieldDate);
			
		}
		else {
			System.out.println("File Does Not Exists");
			System.out.println("enter Valid path");
		}
	}

}
