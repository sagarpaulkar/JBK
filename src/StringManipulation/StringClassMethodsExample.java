package StringManipulation;

import java.util.Arrays;

public class StringClassMethodsExample {

public static void main(String[] args) {
		
		
		String s = "javabykiran";
		
		String sub=s.substring(4, 7);
		
		System.out.println(sub);// byk
		
		
		
		int index1=s.indexOf('a');  // indexof() gives first occurance's index 
		System.out.println(index1);
		

		int index2=s.lastIndexOf('a');// lastIndexOf gives last occurance's index
		System.out.println(index2);
		
	
		String s1 = "jbk";
		char[] d = s1.toCharArray();
		System.out.println(Arrays.toString(d));
		
		
		
		String s2="abc.txt";
		
		System.out.println(s2.endsWith(".txt"));
		
		
		
				
		
		String s3="Mr.Santosh";
		
		if(s3.startsWith("Mr."))
		{
			System.out.println("male");
		}
		
		else
		{
			System.out.println("female");
		}
		
		
		
		String s23="My name is India";
		System.out.println(s23.contains("india"));
		
		
		String s31="JBK";
		
		System.out.println(s31.equalsIgnoreCase("jbk"));;
		System.out.println(s31.equals("jbk"));;
		
		
		
		
		String s4="JAVA";
		System.out.println(s4.toLowerCase());
		
		String s5="java";
		System.out.println(s4.toUpperCase());
		
		
		String s6=" ab c ";
		System.out.println(s6.trim());// trim() removes space present at start and end of string
		
		
		
		byte[] bytes=s6.getBytes(); // getBytes gives us byte array
		
		System.out.println(Arrays.toString(bytes));
		
		
		
	}

}
