package collections;
import java.util.*;

public class vectorlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v= new Vector<>();
		
		v.add("naren");
		v.add(0,"hema");
		v.add(2,"lalitha varshini");
		v.add(3,"vindhya");
		Vector<String> v2=new Vector<>();
		v.add("Narendra");
		v.add("Narendra venkata");
		v.add("Narendra venkata akurathi");
		v.addElement("akurathi");
		v2.add("Narendra");
		v2.add("Narendra venkata");
		v2.add("Narendra venkata akurathi");
		System.out.println(v);
		System.out.println("index 0 value is "+v.get(0));
		v.remove(0);
		
		v.addAll(v2);
		
		System.out.println(v);
		System.out.println(v2);
		//v.removeAll(v2);
		//System.out.println("after removing v2 items from v"+ v);
	
		System.out.println(v2);
		
		
		
		System.out.println("size of v is:"+ v.size());
		
		System.out.println("Capacity of v"+ v.capacity());
		System.out.println("contains naren in v: "+ v.contains("naren"));
		System.out.println("v2 contains all of v : "+v.containsAll(v2));
	}

}
