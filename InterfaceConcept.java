
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



// //interface
// interface Checking{
//      void add(int a,int b);
//      void sound();
     
//      default void method2() {
//         System.out.println("This is a default method");
//     }
     
// }

// class car implements Checking{
    
//     @Override
//     public void add(int a , int b){
//         System.out.println("Car Brands BMW BENZ JAGUAR AUDI "+ (a+b));
//     }
    
//     @Override
//     public void sound(){
//         System.out.println("These automobile sound is very nice to hear");
//     }
// }


// public class Main
// {
// 	public static void main(String[] args) {
// 		System.out.println("****Abstraction*****");

// 		Checking c = new car();
// 		c.method2();
// 		c.add(10,20);
// 		c.sound();
// 	}
// }
