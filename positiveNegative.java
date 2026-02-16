import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  Number : ");
		int a = sc.nextInt();
		
		if(a >= 0) {
		  System.out.println("the number is Positive");
		} else if (a == 0){
		  System.out.println("the number is Neutral");
		}
		else{
		  System.out.println("the number is Negative");
		}
		
	}
}
