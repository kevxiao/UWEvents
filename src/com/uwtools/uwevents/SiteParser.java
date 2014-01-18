package com.uwtools.uwevents;

import java.util.ArrayList;
import java.net.*;
import java.io.*;
import java.lang.String;

public class SiteParser {
	
	public void SiteParse(String[] args) throws Exception {
	
		//Open URL
		URL event1 = new URL("http://testing.net");
		URLConnection connect = event1.openConnection();
		BufferedReader input1 = new BufferedReader(new InputStreamReader(connect.getInputStream()));
	
		ArrayList<String> inputLine = new ArrayList<String>();
		String tempString;
	
		while ((tempString = input1.readLine()) != null) {
		    inputLine.add(tempString);
		}
		input1.close();
	
		for (String s : inputLine) {
		    if(s.equals("Events")){
		    	//Read in next lines
		    }
		}
	}
}