package com.practise;

import java.io.*;

public class Serialzn1 implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	
	String name = "Serialization";
	int age = 23;

	public static void main(String[] args) {
		
		Serialzn1 s = new Serialzn1();
		
		try(FileOutputStream fos = new FileOutputStream("C:\\Users\\Sanjit Shelke\\Desktop\\Java_Project\\ObjectPersistence.txt")) 
		{
			try(ObjectOutputStream os = new ObjectOutputStream(fos))
			{
				os.writeObject(s);
				
			} 
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
				
		System.out.println(s.name+"\t"+s.age);
		
		s = null;
	}
	

}
