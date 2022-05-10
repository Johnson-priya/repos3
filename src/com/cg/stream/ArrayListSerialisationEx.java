package com.cg.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListSerialisationEx {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Sruti");
		al.add("Mitali");
		al.add("Manali");
		al.add("Priya");
		try {
			FileOutputStream fo=new FileOutputStream("D:/Capgemini/JP/corp.txt");
			ObjectOutputStream ob=new ObjectOutputStream(fo);
			ob.writeObject(al);
			fo.close();
			ob.close();
			System.out.println("Serialized.......");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileInputStream fi=new FileInputStream("D:/Capgemini/JP/corp.txt");
			ObjectInputStream ois=new ObjectInputStream(fi);
			ois.readObject();
			System.out.println("deserialised............");
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
