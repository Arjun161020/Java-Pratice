import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  Number A: ");
		int a = sc.nextInt();
		System.out.println("Enter the  Number B: ");
		int b = sc.nextInt();
		System.out.println("Choose an Operator (+,-,*,/) you want to perform");
		int operator = sc.next().charAt(0);
		
		switch(operator) {
		    case '+' :
		        System.out.println("sum of 2 numbers" + (a+b));
		        break;
		    case '-' :
		        System.out.println("sub of 2 numbers" + (a-b));
		        break;
		    case '*' :
		        System.out.println("mul of 2 numbers" + (a*b));
		        break;
		    case '/' :
		        if(b != 0){
		            System.out.println("div of 2 numbers" + (a/b));
		        }else{
		            System.out.println("cannot divide by zero");
		        }
		        break;
		    default:
		        System.out.println("Invalid Input please try again"); 
		        
		}

	}
}
