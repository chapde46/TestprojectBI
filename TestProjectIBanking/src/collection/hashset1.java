package collection;

import java.util.HashSet;
import java.util.Iterator;

public class hashset1
{
	public static void main(String[] args)
	{
		HashSet a1 = new HashSet();
		
		a1.add("element");
		a1.add("element");
		a1.add("element");
		a1.add("atome");
		a1.add("electrone");
		a1.add("protone");
		a1.add("neutrone");
		a1.add("nucleus");
		a1.add(null);
		a1.add(null);
		a1.add(46);
		a1.add(96);
		a1.add(87);
		a1.add(67);
		a1.add('A');
		a1.add('B');
		a1.add('C');
		
		System.out.println(a1.contains("element"));
		System.out.println(a1.size());
		Iterator itr = a1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
