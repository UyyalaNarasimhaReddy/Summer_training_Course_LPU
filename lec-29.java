package Strings;

import java.util.Arrays;

public class StringStudy2 {
	public static void main(String[] args) {

	    String str = "NArasimha";
	    System.out.println(str.startsWith("NA"));
	    //---------------------------------------------
	    String str1 = "narasimHA";
	    System.out.println(str1.endsWith("HA"));
	    //--------------------------------------------
	    String str2 = "Java";
	    byte[] byteArray;
	    byteArray = str2.getBytes();
	    System.out.println(Arrays.toString(byteArray));
	    //--------------------------------------------
	    String str3 = "I";
	    String str4 = "love";
	    String str5 = "INDIA";
	    String joinedStr = String.join(" ", str3, str4, str5);

	    System.out.println(joinedStr);

	  }

}
