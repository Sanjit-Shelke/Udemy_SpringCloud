package com.practise;

import java.io.*;

public class Deserialzn1 implements Serializable{

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("C:\\Users\\Sanjit Shelke\\Desktop\\Java_Project\\ObjectPersistence.txt")) 
		{
			try(ObjectInputStream ois = new ObjectInputStream(fis))
			{
				Serialzn1 d = (Serialzn1)ois.readObject();
				d.name = "Deserialization";
				
				System.out.println(d.name+"\t"+d.age);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
