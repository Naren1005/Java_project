package collections;
import java.util.*;

public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		// stack specefic methods (Push, pop,peek,search)
		
		Stack<String> st= new Stack<>();
		st.push("Red");
		st.push("White");
		st.push("yellow");
//		System.out.println("contains or not :"+st.contains("yellow"));
//		System.out.println("Valu at index 1 is :"+st.get(1));
//		System.out.println("Stack object values"+st);
//		st.remove(2);
//		System.out.println("Stack object values"+st);
//		st.clear();
//		System.out.println("Stack object values"+st);
		
		//***stack methods
		//System.out.println(st.peek());
		System.out.println("Stack object values"+st);
		
		//System.out.println(st.pop());
		System.out.println(st.search("yellow"));
		System.out.println(st.indexOf("yellow"));
		System.out.println("Stack object values"+st);
		System.out.println("stack empty or not:"+ st.empty());
		
		
		
		

	}

}
