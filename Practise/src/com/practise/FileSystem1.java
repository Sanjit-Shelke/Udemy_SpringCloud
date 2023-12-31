package com.practise;

import java.io.*;

public class FileSystem1 {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\Sanjit Shelke\\Desktop\\Java_Project\\fileSystemPractise.txt");
			byte b[] = new byte[100];
			
			System.out.println("Enter data");
			int k = System.in.read(b);
			fos.write(b);
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
