import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer, String> ht1 = new Hashtable<>(); 
		  
        // Initialization of a Hashtable 
        // using Generics 
        Hashtable<Integer, String> ht2 
            = new Hashtable<Integer, String>(); 
  
        // Inserting the Elements 
        // using put() method 
        ht1.put(1, "one"); 
        ht1.put(2, "two"); 
        ht1.put(3, "three"); 
  
        ht2.put(4, "four"); 
        ht2.put(5, "five"); 
        ht2.put(6, "six"); 
  
        // Print mappings to the console 
        System.out.println("Mappings of ht1 : " + ht1); 
        System.out.println("Mappings of ht2 : " + ht2); 
        
        if (ht1.containsKey(2)) { 
            String a = ht1.get(2); 
            System.out.println("value for key" +"2 "
                               + a); 
        }
            
            
         // Iterating using enhanced for loop 
            for (Map.Entry<Integer, String> e : ht1.entrySet()) 
                System.out.println(e.getKey() + " "
                                   + e.getValue());    
        
    
	
	
		
		
		
	}

}
