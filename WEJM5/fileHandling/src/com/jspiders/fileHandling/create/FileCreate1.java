package com.jspiders.fileHandling.create;

import java.io.File;
import java.io.IOException;

public class FileCreate1 {
	public static void main(String[] args) {
		//default path of a file
		File file=new File("wejm5.txt");
		try {
			file.createNewFile();
			System.out.println("File created successfully...!!");
		} catch (IOException e) {
			System.out.println("File not created...!!");
		}
	}
}
