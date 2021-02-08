import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList<String> cars = new LinkedList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Fordx");
	    cars.add("Mazda");
	    
	    cars.addLast("Honda");
	    cars.addFirst("Ford");
	    
	    cars.add(1,"Hyndai");
	    
	    
	    System.out.println(cars);
	    
	    cars.remove(2);
	    System.out.println(cars);
	    
	    
	}
	
	

}
