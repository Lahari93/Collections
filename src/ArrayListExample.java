
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		System.out.println(list);
		// size
		System.out.println(list.size());
		list.add(10);
		list.add("Lahari");
		list.add(10.25);
		list.add('c');
		list.add(true);
		list.add(null);
		list.add("Lahari");
		System.out.println(list);
		System.out.println(list.size());
		
		//Accessing list by index
		System.out.println(list.get(0));
		int var = (Integer) list.get(0);

		System.out.println(20 + var);

		// fetching the values from a list

		System.out.println(list.get(0));
		System.out.println(list.get(3));

		// removing the values from a list

		list.remove(5);
		System.out.println(list);
		System.out.println(list.size());
		
		//1. Iterating the values in list

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));
		}

		//2.
		for (Object var1 : list) {

			System.out.println(var1);
		}

		
		//3.
		Iterator itr = list.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

	}

}