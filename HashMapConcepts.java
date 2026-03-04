/******************************************************************************
 * HashMap Concepts 

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("HashMap");
		
		HashMap<Integer,String> bikes = new HashMap<Integer,String>();
		bikes.put(1,"BMW");
		bikes.put(2,"Ducati");
		bikes.put(3,"Yahama");
		bikes.put(1,"Hunter");
		bikes.put(4,"Royal Enfield");
		bikes.put(1,"Hunter");

		System.out.println("Bikes" + bikes);
		System.out.println("Bikes " + bikes.get(3));
		System.out.println("Bikes " + bikes.size());
		System.out.println("Bikes " + bikes.remove(1));
		
		System.out.println("Bikes" + bikes);
		for(HashMap<Integer, String> i : bikes.keySet()) {
		    System.out.println("Bikes" + bikes(i));
		}
	}
}
