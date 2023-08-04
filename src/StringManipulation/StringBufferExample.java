package StringManipulation;

public class StringBufferExample {

	/* Total 15 constructors are present in a string class 
	 * new String() creates empty String object
	 * StringBuffer is mutable / changeable
	 * 
	 * String and StringBuffer are not related .
	 * 
	 * String object's content can not be modified
	 * StringBuffere object's content can be modified
	 * 
	 * */
	public static void main(String[] args) {
		
	StringBuffer sb=new StringBuffer("Hello");  // [HJavalo] StringBuffer object
        sb.replace(1,3,"Java"); 
        System.out.println(sb); 
        
        StringBuffer sb1=new StringBuffer("Hello"); // sb1===>[Hdllo] StringBuffer object
		sb1.setCharAt(1,'d');
        System.out.println(sb1);
        
        StringBuffer sb2=new StringBuffer("Hello"); 
		sb2.deleteCharAt(0);
		
        System.out.println(sb2);
        
        
        StringBuffer sb3=new StringBuffer("Hello"); // sb3==>[HelloWorld append()] StringBuffer class object 
		sb3.append("World");
        System.out.println(sb3);

        
       
       
	}

}
