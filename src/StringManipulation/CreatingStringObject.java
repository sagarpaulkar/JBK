package StringManipulation;

public class CreatingStringObject {

public static void main(String[] args) {
		
		
		String s= new String("jbk"); 
		System.out.println(s.length());
		
		// s(1000) ==>[jbk length()  charAt()] String class object at address 1000

		String s1="java";// s1 [j][a][v][a]
						 //     0  1  2  3 
		System.out.println(s1.charAt(1));
		System.out.println(s1.charAt(s1.length()-1));
		char ch=s1.charAt(2);
		System.out.println(ch);
		
		System.out.println("jbk".length());
		System.out.println("jbk".concat("java").contains("k"));// method chaining
		
	}

}
