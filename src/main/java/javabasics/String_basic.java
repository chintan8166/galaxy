package javabasics;

public class String_basic {

	public static void main(String[] args) {
		String S1= "hello world";
		System.out.println(S1);
char[] ch1= {'a','b','c','d','e'};
String S2 = new String(ch1);
System.out.println(S2);
String obj= "hello";
String o1= obj.concat(" world");
System.out.println(o1);


StringBuilder Q1= new StringBuilder(S1);
String reversestring = Q1.reverse().toString();
System.out.println(reversestring);
	}

}
