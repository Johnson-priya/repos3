package com.cg.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteEx1 {

	public static void main(String[] args) {
		try {
			FileOutputStream fo=new FileOutputStream("D:/Capgemini/JP/hello.txt");
			fo.write('A');
			fo.write('B');
			fo.write('B');
			fo.write('C');
			System.out.println("done.....");
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		
		// TODO Auto-generated method stub

	

}

