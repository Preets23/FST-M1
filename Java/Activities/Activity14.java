package activities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

class Activity14{
	public static void main(String args[]) throws IOException {
		File file=new File("src/file.txt");
		boolean fstatus=file.createNewFile();
		if(fstatus) {
            System.out.println("File created successfully!");
        } else {
            System.out.println("File already exists at this path.");
        }
		File fileutil=FileUtils.getFile("src/file.txt");
		System.out.println("Data in file : "+FileUtils.readFileToString(fileutil,"UTF8"));
		
		File destDir=new File("src/resources");
		FileUtils.copyToDirectory(fileutil, destDir);
		
		File newFile=FileUtils.getFile(destDir,"newfile.txt");
		String newfiledata=FileUtils.readFileToString(newFile,"UTF8");
		System.out.println("Data in new file : "+newfiledata);
	}
	
		
	
}
