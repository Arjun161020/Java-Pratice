import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("**********Welcome to Sowmi Schools********");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Student Name : ");
		String name = sc.nextLine();
		System.out.println("");
		System.out.print("Enter the Roll No : ");
		int rollNo = sc.nextInt();
		
		String[] subject = { "English", "Tamil" , "Maths" , "Science" , "Social" };
		int marks[] = new int[5];
		for(int i = 0; i < subject.length ; i++){
		    System.out.println("Enter marks for " + subject[i] + ": ");
		    marks[i] = sc.nextInt();
		}
		
		int finalMarks = calculate(marks);
		System.out.println("your overall total marks : " + finalMarks);
		
		int average = averageCalculation(finalMarks);
		System.out.println("your overall average marks : " + average);
		
		String gradeCalc = gradeCalculation(average);
		System.out.println("your overall grade : " + gradeCalc);
	}
	
	static int calculate(int[] calc){
	    int total = 0;
	    for (int i = 0; i < calc.length; i++ ){
	        total = total+calc[i];
	    }
	    return total;
	}
	
	static int averageCalculation(int avg){
	    int finalAvg = 0;
	    finalAvg = avg / 5;
	    return finalAvg;
	}
	
	static String gradeCalculation(int avg) {
        if(avg >= 90){
           return "First class";
        } else if(avg >= 70){
            return "Second class";
        } else if( avg >= 60){
            return "thrid class";
        } else if(avg <= 60 && avg >= 40){
            return "pass";
        } else {
             return "Fail";
        }
	}
	
}
