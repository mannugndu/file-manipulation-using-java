package com.test;

import java.io.*;
import java.util.Random;


class DuplicacyRemover
{
	public static void main(String[] args)throws IOException
	{
		File f = new File("files","file2.txt");
		File output =new File("files","output.txt");
		
		PrintWriter pw = new PrintWriter(output);
		
		
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		String str = br.readLine();
		while(str != null)
		{
			boolean available = false;
			BufferedReader br2 = new BufferedReader(new FileReader(new File("files","output.txt")));
			String str2 = br2.readLine();
			while(str2 != null)
			{
				if(str.equals(str2))
				{
					available = true;
					break;
				}
				str2 = br2.readLine();
			}
			if(available == false)
			{
				pw.println(str);
				pw.flush();
				
			}
			
			
			str = br.readLine();
			
		}
		
	
		pw.close();
		
		
		
	}
}