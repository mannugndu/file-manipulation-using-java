package com.test;

import java.io.*;


class Test
{
	public static void main(String[] args)throws IOException
	{
		boolean bb=false;
		FileRenamer rn = new FileRenamer();
		try {
			bb = rn.rename("/media/mann/New Volume/mca data/5th sem/ss");
		}
		catch(IOException e) {}
		System.out.println(bb);
	}
	
	
}