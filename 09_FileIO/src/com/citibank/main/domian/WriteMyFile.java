package com.citibank.main.domian;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteMyFile {
	
	private OutputStream OutputStream;
	private String outMessage;
	
	public WriteMyFile(OutputStream OutputStream, String outMessage) {
		super();
		this.OutputStream = OutputStream;
		this.outMessage = outMessage;
	}
	
	public boolean writeFile() {
		byte [] data = outMessage.getBytes();
		try {
//			System.out.println("Written - kapil");
			OutputStream.write(data);
			
			return true;	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error While Writing Data in File");
//			e.printStackTrace();
			return false;	
		}
		finally {
			try {
				OutputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Error While Closing !!");
//				e.printStackTrace();
			}
			
		}
	}
	
	
	

}
