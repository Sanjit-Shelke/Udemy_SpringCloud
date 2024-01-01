package com.practise;

import java.io.*;

public class FileSystem2 {

	public static void main(String[] args)
	{
		File f = new File("C:\\Users\\Sanjit Shelke\\Desktop\\Java_Project\\fileSystemPractise.txt");
		
		if(!f.exists())
		{
			System.out.println("File does not exist");
			System.exit(0);
		}
		
		try(FileInputStream fis = new FileInputStream("C:\\Users\\Sanjit Shelke\\Desktop\\Java_Project\\fileSystemPractise.txt"))
		{
			byte b[] = new byte[(int)f.length()];
			fis.read(b);
			
			String s = new String(b);
			System.out.println(s);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
