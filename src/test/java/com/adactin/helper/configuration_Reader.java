package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class configuration_Reader {
	public static Properties p;
	
	public configuration_Reader() throws Throwable {
		File f=new File("C:\\Users\\SIVAPRAKASH\\eclipse-workspace\\Adactin\\src\\test\\java\\com\\adactin\\configuration\\configuration.properties");
		FileInputStream fis=new FileInputStream(f);
		p=new Properties();
		p.load(fis);
	}
	public String get_browser() {
			String browser = p.getProperty("browser");
			return browser;
}
public String get_url() {
	String url = p.getProperty("url");
	return url;
}
public String get_ccno() {
	String ccno = p.getProperty("ccno");
	return ccno;
}
public String getcctype() {
	
String cctype = p.getProperty("cctype");
return cctype;	
}
public String getccmonth() {
	String ccmonth = p.getProperty("ccmonth");
	return ccmonth;
}
public String getccyear() {
	String ccyear = p.getProperty("ccyear");
	return ccyear;
}
public String getccvno() {
	String ccvno = p.getProperty("ccvno");
	return ccvno;
}
	
}