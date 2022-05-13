
public class Practise_Java {
	
	
	
	
	
	
public static void main(String[] args)
{
	Practise_Java  obj = new Practise_Java();
	
}
public Practise_Java() {
	
	String S1 = "chintan";
	String str ="";
	
	for(int j=S1.length()-1; j>=0;j--)
	{
		str=str+S1.charAt(j);
	}
	
	System.out.println(str);
	
	
	
	String E1= "chintan";
E1= E1.concat("Patel");
	System.out.println(E1);
	
}
}
