package utils;

public class Rstring {

	public static void main(String[] args) {
		String s1= "Welcome";
		String snr="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			snr=snr+s1.charAt(i);
			
				}
System.out.println(snr);
String stringThis="helloworld";
StringBuilder Strin1= new StringBuilder(stringThis);
String reversestring= Strin1.reverse().toString();
System.out.println(reversestring);
	}
	
	

}
