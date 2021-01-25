import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetExample {
	
public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		set.add("Lahari");
		set.add("Epam");
		set.add("Selenium");
		set.add("Appium");
		set.add("Lahari");
		
		//Checking that duplicate elements are not allowed in set
		System.out.println(set);
		
		for(int i=0; i<set.size(); i++){
			
			System.out.println();
		}
		//using for each
		
		for(String var:set){
			
			System.out.println(var);
		}
		
		//Using iterator
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()){
			String var = itr.next();
			if(var.equals("Appium")){
			System.out.println(var);
			}
		}

	}

}
