/******************************************************************************
 * ArrayList Concepts add remove get size set clear

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Array List");
		
		ArrayList<String> bikes = new ArrayList<String>();
		bikes.add("BMW");
		bikes.add("Ducati");
		bikes.add("Yahama");
		bikes.add("Royal Enfield");

		
		bikes.set(2, "Hayabusa");
		bikes.add(4, "Ninja");
		System.out.println("Bikes" + bikes);
		System.out.println("Bikes " + bikes.get(2));
		System.out.println("Bikes " + bikes.size());

		
		Collections.sort(bikes);
		System.out.println("Sort " + bikes);
		
		for (String i : bikes){
		    System.out.println(i);
		}
		
		System.out.println("Bikes " + bikes.remove(3));
		bikes.clear();
	}
}
