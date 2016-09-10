import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {

	HashSet<String> new_set = new HashSet<String>();
	
	protected void read_set()
	{
		System.out.println("Adding to Set");
		
		new_set.add("1");
		new_set.add("2");
		new_set.add("3");
		new_set.add("4");
		new_set.add("5");
		
		System.out.println("Addition complete");
	}
	
	public void print_set()
	{
		System.out.println("Printthe value of HashSet");
		
		Iterator itr = new_set.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	
}

