package com.cg.stream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferEx1 {
	static BufferedOutputStream buffer=null;
	static FileOutputStream fo= null;

	public static void main(String[] args) {
		try {
			 fo=new FileOutputStream("D:/Capgemini/JP/data.txt");
			//BufferedOutputStream buffer=new BufferedOutputStream(fo);
			 buffer=new BufferedOutputStream(fo);
			buffer.write('A');
			buffer.write('B');
			buffer.write('C');
			buffer.write('R');
			System.out.println(5/0);
			buffer.write('D');
			buffer.write('E');
			//buffer.close();
			//buffer.flush();
			System.out.println("done.....");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				buffer.close();
			}catch(IOException e) {
				e.printStackTrace();
				
			}
		}
		// TODO Auto-generated method stub

	}

}
