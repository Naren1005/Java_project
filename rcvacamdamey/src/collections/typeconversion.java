package collections;

public class typeconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b=10;
		short s=175;
		int i=12654;
		float f=10.2f;
		long l=5988855;
		double d=52.55;
		char a='A';
		boolean bo= true;

		//implicit conversion
		//		d=s;
		//		d=i;
		//		d=bo;// type mismatch
		//		d=b;
		//System.out.println(d);

		// Explicit conversion

		b=(byte)s;
		System.out.println(b);



	}

}
