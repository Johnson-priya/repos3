package com.cg.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class InputStreamEx {

	public static void main(String[] args) {
		FileOutputStream fo= null;
		PrintStream p =null;
		try {
			fo = new FileOutputStream("D:/Capgemini/JP/hello4.txt");
			p=new PrintStream(fo);
			p.println("Apple");
			p.println("Mango");
			//fo.close();
			//p.close();
			System.out.println("Done.....");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		//catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
	}


