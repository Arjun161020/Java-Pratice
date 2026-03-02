
//interface
interface Checking{
     void car();
     void sound();
     
     default void method2() {
        System.out.println("This is a default method");
    }
     
}

class car implements Checking{
    
    @Override
    public void car(){
        System.out.println("Car Brands BMW BENZ JAGUAR AUDI");
    }
    
    @Override
    public void sound(){
        System.out.println("These automobile sound is very nice to hear");
    }
}


public class Main
{
	public static void main(String[] args) {
		System.out.println("****Abstraction*****");

		Checking c = new car();
		c.method2();
		c.car();
		c.sound();
	}
}
