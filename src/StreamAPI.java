import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names =new ArrayList<String>();
		
		names.add("Abdul");
		names.add("Bala");
		names.add("John");
		names.add("Abdul");
		
		for (String k : names)
		{
			System.out.println(k);
		}
		
		HashSet<String> hs =new HashSet<String>();
		hs.add("Vivek");
		
		for (String k : hs)
		{
			System.out.println(k);
		}
		
		
		HashMap<String, Integer> hm =new HashMap<String, Integer>();
		hm.put("Vivek", 1);
	
		for(Entry m : hm.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		//System.out.println(names);
		
		//names.stream().forEach(s->System.out.println(s));
		
		//names.stream().filter(s->s.contains("Bal") && s.length()>5).forEach(s->System.out.println(s));
	//	names.stream().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
	//	names.stream().distinct().sorted().forEach(s->System.out.println(s));
		
		System.out.println("Updates are done");

	}

}
