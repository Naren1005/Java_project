package collections;

import java.util.*;


public class hashmap {

	public static void main(String[] args) {

		Map<Integer,String> m=new Hashtable<>();
		m.put(101,"narendra");
		
		m.put(102,"hema");
		m.put(103,"Lalitha Varshini");
		m.put(104,"Vindhya");
		System.out.println(m);
		m.put(101,"Narendra");
		System.out.println("************");
		//Retrieval of keys from the map
		Set<Integer> sk=m.keySet();
		for(Integer key:sk)
		{
			System.out.println("the list of keys:"+key);
		}
		//Retrieval of values from the map
		System.out.println("************");
		Collection<String> values=m.values();
		for (String value : values) {
			System.out.println(value);

		}

		//Retrieval of values from the map based on key
		System.out.println("101 emp details are: "+m.get(101));
		//getting all the keys and respective values
		System.out.println("************");
		for(Integer key:sk)
		{
			System.out.println(key+ ">>>>>>>>: "+m.get(key));
		}
		m.remove(101);
		System.out.println("after remove"+ m);
		System.out.println(m.containsKey(103));
		
	}

}
