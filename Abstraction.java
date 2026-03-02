//Abstraction
abstract class Abstraction{
     abstract void car();
     void vehicle(){
         System.out.println("Any vehicle can come");
     }
}

//Method Override
class car extends Abstraction{
    
    @Override
    void car(){
        System.out.println("Nothing will come near to these Brands BMW BENZ JAGUAR AUDI");
    }

}


public class Main
{
	public static void main(String[] args) {
		System.out.println("****Abstraction*****");

		Abstraction c = new car();
		c.vehicle();
		c.car();
	}
}
