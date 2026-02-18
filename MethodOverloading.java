public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int result = add(10,20);
		System.out.println("*********int add **********"+result);
		double result1 = add(10.403,20.675);
		System.out.println("*********double add **********"+result1);
		int result3 = add(10,20,40);
		System.out.println("*********int add **********"+result3);
		double result4 = add(10.403,20.675,30.567,90.4674);
		System.out.println("*********double add **********"+result4);

	}
	
	//method overloading
	public static int add(int a , int b){
	     return a+b;
	}
		//method overloading
	public static double add(double a , double b){
	     return a+b;
	}
	//2. overloading with 3 parameters
	public static int add(int a , int b, int c){
	    return a+b+c;
	}
	
	//3.overloading with 4 parameters
	public static double add(double a , double b , double c , double d) {
	    return a+b+c+d;
	}

}
