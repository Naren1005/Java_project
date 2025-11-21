

package collections;
import java.util.*;

public class wraper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=35;
		
		Integer i=Integer.valueOf(26);
		System.out.println(i);
		
		Integer v=Integer.valueOf(30); //Boxing
		Integer v1=i; // Auto boxing
		Integer p=56;
		int a1=v;  //Auto unboxing 
		int a11=v.intValue(); //un boxing
		System.out.println("The value of a1is :"+a1);
		
		
		
		ArrayList <Integer> al= new ArrayList<>();
		al.add(30);
		al.add(Integer.valueOf(36));
		
		String s="12";
		Long l=Long.valueOf(s); //
		System.out.println(l);
		

	}

}
