package javabasics;

public class Method_overloading {

	public static void main(String[] args) {
		Method_overloading O1 = new Method_overloading ();
		System.out.println(O1.A(10, 10));
		System.out.println(O1.A(10, 10, 10));

	}
public  int A(int b, int c) {
	int D= b+c;
	return D;
}
	public  int A(int b, int c,int e) {
		int D= b+c*e;
		return D;
}
}
