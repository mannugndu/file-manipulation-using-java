package com.test;

import java.io.*;


class FileRenamer
{
	public boolean rename(String path)throws IOException
	{
		
		
		File f = new File(path);
		String[] files = f.list();

		
		
		int count = 1;
		
		
		for(String file : files)
		{
			
			File ff = new File(f,file);
			ff.renameTo(new File(f,"00"+count+".jpeg"));
			count++;
		}

		
		return true;
	}
}