import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			Map<String,String> map = new HashMap<String,String>();
			
			map.put("firstName", "lahari");
			map.put("lastName", "Vibhirampuram");
			map.put("sub", "Selenium");
			map.put("location", "Hyderabad");
			map.put("firstName", "lahari");
			
			System.out.println(map);
			System.out.println(map.size());
			
			System.out.println(map.get("firstName"));
			
			
			Set<String> keys = map.keySet();
			
			for(String key:keys){
				
				
				System.out.println("Key --> "+key+"  Value is -->"+map.get(key));
			}
			
			
			
		

	}

}
