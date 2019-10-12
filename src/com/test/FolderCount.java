package com.test;

import java.io.*;


class FolderCount
{
	public static void main(String[] args)throws IOException
	{
		int folderCounter=0;
		File f =  new File ("Files");
		String list_main[] = f.list();
		
		for(String list_main1:list_main)
		{
			File ff = new File(f,list_main1);
			if(ff.isDirectory())
			{
				folderCounter++;
				
				String[] innerList1 = ff.list();
				for(String innerList11 : innerList1)
				{
					File fff = new File(ff,innerList11);
					if(fff.isDirectory())
					{
						folderCounter++;
					}
				}
				
			}
				
			
			
		}
		
		System.out.println("folder are :"+folderCounter);
		
	}
}