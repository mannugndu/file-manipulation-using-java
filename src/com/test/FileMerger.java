package com.test;

import java.io.*;


class FileMerger
{
	
	
	public void merger(String path)throws IOException
	{
		//String path = "Files//file-copies";
		File targetFile = new File(path,"output");
		targetFile.mkdir();
		
		File sourceFile = new File(path);
		
		String[] files = sourceFile.list();
		
		File target = new File(targetFile,"output.mp4");
		
		
		FileOutputStream fos = new FileOutputStream(target,true);
		
		
		for(String file:files)
		{
			File f = new File(sourceFile,file);
			
			if(f.isFile())
			{
				FileInputStream fis = new FileInputStream(f);
				
				while(fis.available()!=0)
				{
				fos.write(fis.read());
				fos.flush();
				}
				fis.close();
			}
			
			
		}

		fos.close();
		System.out.println("done");
	}
	
}