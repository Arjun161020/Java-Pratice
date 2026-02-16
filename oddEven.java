import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  Number : ");
		int a = sc.nextInt();
		
		if(a % 2 == 0) {
		  System.out.println("the number is Even");
		} else{
		  System.out.println("the number is Odd");
		}
	}
}
