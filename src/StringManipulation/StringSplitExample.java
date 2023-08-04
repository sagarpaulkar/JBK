package StringManipulation;

public class StringSplitExample {

public static void main(String[] args) {
		
		String today = "26-10-2021";
							
		/* split() method gives us String array . strings  is a name , we have assigned to that array */
						      //	  0    1      2
		String[] strings = today.split("-");// strings ["26"]["10"]["2021"]
		
		
	// strings is a name of array
		
		for(String string : strings)
		{
			System.out.println(string);
		}
			
		for(int index=strings.length-1 ; index>=0 ; index--)
		{
			System.out.print(strings[index] + " ");
		}
		
		
	}

}
