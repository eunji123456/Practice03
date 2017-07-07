package com.javaex.problem05;

public class StringUtil {
   
	public static String concatString(String[] strArray) {
		String resultStr ="";
		// TODO Auto-generated method stub
		for (int i=0;i<strArray.length;i++) {
			 resultStr += strArray[i];
		}
		return resultStr;
	}

}
