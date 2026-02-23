public class Main
{
	public static void main(String[] args) {
	    //String concepts
		String str = "Hello World";
		String abc = new String("Checking");
		
		//String Methods 
		System.out.println("*******String Length******"+str.length());
		System.out.println("*******String UpperCase******"+str.toUpperCase());
		System.out.println("*******String LowerCase******"+str.toLowerCase());
		System.out.println("*******String CharAt******"+str.charAt(4));
		System.out.println("*******String equals******"+ str.equals("abc"));
		System.out.println("*******String SubString******"+ str.substring(0,5));
		System.out.println("*******String contains******"+ str.contains("He"));
		
		
		//Reverse a String
		String rev = "";
		for(int i = str.length() - 1 ; i >= 0 ; i--) {
		    rev += str.charAt(i);
		}
		
		System.out.println("*******String Reverse******"+ rev);
		
		
	}
}
