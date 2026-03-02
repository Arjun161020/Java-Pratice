
//Method Overloading PolyMorphism
class PolyMorphism{
    void add(int a, int b){
        System.out.println(a+b);
    }
    
    void add(double a, double b){
        System.out.println(a+b);
    }
    
    void add(float a, float b){
        System.out.println(a+b);
    }
}

//Method Override
class Substract extends PolyMorphism{
    
    @Override
    void add(double a, double b){
        System.out.println(a-b);
    }
}


public class Main
{
	public static void main(String[] args) {
		System.out.println("****PolyMorphism*****");
		PolyMorphism p = new PolyMorphism();
		p.add(10,30);
		p.add(34.4784,98.58487);
		p.add(129.89,348.5334);
		
		PolyMorphism s = new Substract();
		s.add(34.4784,98.58487);
		
	}
}
