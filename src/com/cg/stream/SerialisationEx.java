package com.cg.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialisationEx {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setId(101);
		e1.setAdd("Bihar");
		e1.setName("Johnson");
		ObjectOutputStream objectOutput= null;
		FileOutputStream fo= null;
		try {
			fo=new FileOutputStream("D:/Capgemini/JP/emp.ser");
			objectOutput=new ObjectOutputStream(fo);
			objectOutput.writeObject(e1);
			System.out.println("Success.....");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Success.....");
		// TODO Auto-generated method stub

	}

}
