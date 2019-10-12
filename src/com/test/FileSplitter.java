package com.test;

import java.io.*;


class FileSplitter
{
	
	
	public void split(String path,String fileName,int partitionCount)throws IOException
	{
		/////////////////////////////////////////////////////////
		//// how many partition do you want to generate ?   ////
		////////////////////////////////////////////////////////
		 
		
		int users = partitionCount;
		
		
		
		File f = new File(path,fileName);
		System.out.println("file size : "+(float)f.length()/(1024*1024)+" MB");
		
		File f2 = new File(path,"file-copies");
		f2.mkdir();
		
		FileInputStream fis = new FileInputStream(f);
		
		System.out.println("Copies are saved to : "+f2.getAbsolutePath());
		
		long fileSize = f.length();
		
		int partitionSize = (int) fileSize/users;
		
		byte[] b = new byte[partitionSize];
		
		System.out.println("partition size : "+(float)partitionSize/(1024*1024)+" MB");
		
		int x=1;
		String file="copy-"+x+"-"+fileName;
		
		while(fis.available()!=(fileSize%users))
		{
			FileOutputStream fos = new FileOutputStream(new File(f2,file));
			fis.read(b);
			
				fos.write(b);
				fos.flush();
				System.out.println("Created Partition "+x);
			
			fos.close();
			x++;
			file="copy-"+x+"-"+fileName;
			
		}
		if(fis.available()!=0)
		{
		System.out.println("Extra data appended to the last file");
		file="copy-"+(--x)+"-"+fileName;
		FileOutputStream fos = new FileOutputStream(new File(f2,file),true);
	
		while(fis.available()!=0)
		{
			fos.write(fis.read());
			fos.flush();
		}
		fos.close();
		}
		else
		{
			System.out.println("Each partition has equal size");
		}
		
		
		
		
		
		fis.close();
		
		
	}
}