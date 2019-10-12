package com.test;

public class ProjectManipulator {
	
	void doIt()throws Exception
	{
		//create the new overview file
				FileCopier fc = new FileCopier();
				FileRenamer fr = new FileRenamer();
				
				
				String pack = "";
				String copyPath = "C:\\wamp64\\www\\abee\\packages\\"+pack;
				String renamePath = copyPath+"\\gallery";
				
				
				boolean result_copy,result_rename;
				
				result_copy = fc.copy(copyPath);
				result_rename = fr.rename(renamePath);
				
				System.out.println(result_copy);
				System.out.println(result_rename);
	}

}
