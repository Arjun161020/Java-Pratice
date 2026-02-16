import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  Number A: ");
		int a = sc.nextInt();
		System.out.println("Enter the  Number B: ");
		int b = sc.nextInt();
		System.out.println("Enter the  Number C: ");
		int c = sc.nextInt();

		if(a > b && a > c) {
			System.out.println("the Number A is Greater");
		} else if(b > a && b > c) {
			System.out.println("the Number B is Greater");
		} else if(c > a && c > b){
			System.out.println("the Number C is Greater");
		} else {
      System.out.println("Some numbers are equal");
    }
	}
}
