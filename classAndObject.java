public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Student std = new Student();
		
		std.name = "Arjun";
		std.id = 26;
		std.gender = "male";
		std.age = 26;
		
		std.display();
	}
	

}

	class Student {
	    String name;
	    int id;
	    String gender;
	    int age;
	    
	    void display(){
	        System.out.println("*******"+ name + "**********"+ id + "********" + gender + "******" + age);
	    }
	}
