package com.adactin.helper;

public class File_Reader_Manager {
	private File_Reader_Manager(){
		
	}
	
	public configuration_Reader getInstanceCR() throws Throwable {
		configuration_Reader reader=new configuration_Reader();
		return reader;
	}
	public static File_Reader_Manager getInstance(){
		File_Reader_Manager helper=new File_Reader_Manager();
		return helper;
	}
}