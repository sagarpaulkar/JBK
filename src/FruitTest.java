import java.util.Arrays;
import java.util.Scanner;

import com.kiranacademy.array.Employee;

public class FruitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of a array :-  ");
		int size= sc.nextInt();
		
		Fruit[] f= new Fruit[size];
		
		System.out.println(Arrays.toString(f));
		
		for(int index=0;index<size;index++) {
			
			System.out.println("enter fname,price :-  ");
			String fname=sc.next();
			int price=sc.nextInt();
			
			f[index]= new Fruit(fname,price);
		}
		
		System.out.println(Arrays.toString(f));
		
		Fruit max=getMaxFruit(f);
		System.out.println(max);
		
		
	}
	
	static Fruit getMaxFruit(Fruit[] f)
	{
		Fruit maxFruit=new Fruit();  // maxEmployee==>Employee [eid=0, name=null, salary=0] Employee class object
		
		for (Fruit fr : f) 
		{
			if(fr.price>maxFruit.price)
				maxFruit=fr;
		}
		
		
		return maxFruit;
	}

}
