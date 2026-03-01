class Avenger {
    void assembel(){
        System.out.println("****Avenger Assembel****");
    }
}

class Caption extends Avenger {
    void america(){
        System.out.println("****Steve Rogers****");
    }
    @Override
    void assembel(){
        System.out.println("****the First Avenger****");
    }
}

class Iron extends Avenger {
    void ironMan(){
        System.out.println("****Tony Starc****");
    }
}

class spider extends Avenger {
    void spiderman(){
        System.out.println("****Peter Parker****");
    }
    
    @Override
    void assembel(){
        System.out.println("****spider man Join to the Avenger team from 2024****");
    }
}

public class Main
{
	public static void main(String[] args) {
		System.out.println("**********Inheritance Concepts************");
		
		spider s = new spider();
		s.spiderman();
		s.assembel();
		Caption c = new Caption();
		c.america();
		c.assembel();
	}
}
