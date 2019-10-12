package com.test;

import java.io.*;
import java.util.Random;


class TxtFileCreator
{
	public static void main(String[] args)throws IOException
	{
		File f = new File ("files","file3.txt");
		PrintWriter pw = new PrintWriter(f);
		Random r = new Random();
		System.out.println("creating the file");
		for(long i=1;i<300005;i++)
		{
			
			if(i%5==0)
			{
				pw.write(" ");
			}
			if(i%100==0)
			{
			
				
				pw.println();
			}
			else
			{
				int rand_val = r.nextInt(90);
				while(rand_val<=65 || rand_val>=90)
				{
					rand_val = r.nextInt(90);
				}
				pw.write(rand_val);
				
			}
			
		}
		System.out.println("file created successfully");
		System.out.println("file size :"+f.length()/(1024*1024)+"MB");
		pw.flush();
		pw.close();
		
		
		
	}
}