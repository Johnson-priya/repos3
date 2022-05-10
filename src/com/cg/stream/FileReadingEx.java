package com.cg.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadingEx {

	public static void main(String[] args) {
		FileInputStream fi=null;
		
		try {
			 fi= new FileInputStream("D:/Capgemini/JP/data.txt");
			
			int ch=0;
			while((ch=fi.read())!=-1) {
				System.out.println((char) ch);
				}
			}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
