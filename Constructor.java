public class Main
{
    int a;
    int b;
    
    //Initialize constructor
    Main(){
        a = 10;
        b = 20;
    }
    
	public static void main(String[] args) {
		System.out.println("*************constructor concept *********");
		Main obj = new Main();
		System.out.println("***Value***" + obj.a);
		System.out.println("***Value***" + obj.b);
		
	}
	

}
