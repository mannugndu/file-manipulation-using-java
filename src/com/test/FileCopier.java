package com.test;

import java.io.*;
import java.util.Random;


class FileCopier
{
	public boolean copy(String path)throws IOException
	{

		File f = new File(path,"overview.txt");
		
		FileReader fr = new FileReader(f);
		
		BufferedReader br = new BufferedReader(fr);
		
		File f2 = new File(path,"overview_copy.txt");
		
		PrintWriter pw = new PrintWriter(f2);
		
		int i =(char) br.read();
		while(i != -1)
		{
			if((char)i=='�')
			{
				i=(int)' ';
			}
			
			pw.write(i);
			
			i=br.read();
		}
		
		
		pw.flush();
		pw.close();
		
		
		f.renameTo(new File(path,"overview_copy.txt"));
		f2.renameTo(new File(path,"overview.txt"));
		
		
		
		
		
		
		
		
		return true;
	}
}