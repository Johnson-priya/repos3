package com.cg.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



public class CopyFileEx {

	public static void main(String[] args) {
		 FileInputStream io = null;
		 FileOutputStream op = null;
		try {
			io=new FileInputStream("D:/Capgemini/JP/download.png");
			//io = new FileInputStream("D:/Capgemini/JP/hello.txt");
			op=new FileOutputStream("D:/Capgemini/JP/hello3.png");
			//op= new FileOutputStream("D:/Capgemini/JP/hello2.txt");
			int ch=0;
			while((ch=io.read())!=-1) {
					// op.write((char) ch);
					 }
				System.out.println("image copied.....");
		}
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
	//	try {
		//	op=new FileOutputStream("D:/Capgemini/JP/hello3.png");
			//op= new FileOutputStream("D:/Capgemini/JP/hello2.txt");
		//} catch (FileNotFoundException e) {
			
			//e.printStackTrace();
	//	}
		// int ch=0;
		// try {
		//	while((ch=io.read())!=-1) {
				// op.write((char) ch);
			// }
			//System.out.println("File copied.......");
		//} 
		//catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
		 
          
  
       
        

	}

}
