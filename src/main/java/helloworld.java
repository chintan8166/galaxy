public class helloworld{
	
	public static void main(String[] args)
	{
		
		//traditional way with for loop
String str1="hello world";
String EmptyString="";


	for (int i=str1.length()-1; i>=0; i--)

		{
			EmptyString=EmptyString+str1.charAt(i);
		
		
		
		}


System.out.println(EmptyString);
		
		String s1= "please reverse this string";
		System.out.println("this is original string   :"+ s1);
		StringBuilder r1= new StringBuilder (s1);
		String g1= r1.reverse().toString();
		System.out.println("this is the reverse string  : "+g1);
		
		
		
		
		
	}
	
} 