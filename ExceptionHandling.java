import java.util.*;
public class Main {
	public static void main(String[] args) {
		System.out.println("*****Exception Handling*****");
		try{
		    int a[] = {1,2,3};
		    System.out.println(a[5]);
		} catch(Exception e){
		    System.out.println(e);
		} finally {
		    System.out.println("Try catch Executed");
		}
		
		Scanner sc = new Scanner(System.in);
		try {
    		System.out.println("Please Enter your age : ");
    		int age = sc.nextInt();
    		sc.nextLine();
    		if(age < 18) {
    		   throw new ArithmeticException("Access Denied....." + age);
    		} else {
    		    System.out.println("Access Granted");
    		}
		}catch(ArithmeticException e){
		    System.out.println("Access Denied.....");
		}
		
		
		try {
		  int a = Integer.parseInt("string");
		  System.out.println(a);
		} catch(NumberFormatException e){
		    System.out.println("Input Mismatch Exception");
		}
		
		System.out.println("Please Enter the String : ");
		String name= sc.nextLine();
		try{
		    System.out.println(name.charAt(10));
		} catch(StringIndexOutOfBoundsException e) {
		   System.out.println("Invalid index access");
		}
	}
}
