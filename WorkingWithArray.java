import java.util.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello Welcome to the Array topic");
		
		// Declaring Array 
        int[] number = {10,20,30,40,50};
        System.out.println("printing the Specific Index number : "+number[3]);
        
        // Rewrite the Specific Index
        number[4] = 60;
        System.out.println("printing the rewrite Specific Index number : "+number[4]);
        
        //Printing the whole array using Loop
        for(int i =0  ; i < number.length ; i++ ){
            System.out.print(number[i] + ",");
        } 
        System.out.println("");
        //Creating array using the new keyword
        String[] Sow = new String[3];
        Sow[0] = "KinderJoy";
        Sow[1] = "DairyMilk";
        Sow[2] = "Kitkat";
        System.out.print(Arrays.toString(Sow));
	}
}
