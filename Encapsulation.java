public class Main
{
	public static void main(String[] args) {
		System.out.println("****Hello Encapsultation*****");
		Encapsultation esc = new Encapsultation();
		esc.setName("sowmi");
		esc.setMarks(100);
		System.out.println(esc.getName());
		System.out.println(esc.getMarks());
	}
}

class Encapsultation{
    
    	private String name;
		private int marks;
		
		//Getter and setter
		public void setName(String name){
		    this.name = name;
		}
		
		public void setMarks(int marks){
		    if(marks >= 35){
		        this.marks = marks;
		    }else{
		        System.out.println("Fail");
		    }
		}
		
		public String getName() {
		    return name;
		}
		
		public int getMarks(){
		    return marks;
		}
}
