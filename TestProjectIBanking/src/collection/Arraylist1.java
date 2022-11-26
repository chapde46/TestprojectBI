package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist1 
{
	public static void main(String[] args)
	{
		ArrayList a1 = new ArrayList();
		
		a1.add(45);
		a1.add("vishal");
		a1.add("tejas");
		a1.add("atul");
		a1.add("bandu");
		a1.add("surya");
		a1.add("akash");
		a1.add("sameer");
		a1.add(79);
		a1.add(36);
		a1.add(null);
		a1.add('A');
		a1.add('B');
		a1.add('C');
		
		
		boolean res = a1.contains("vishal");
		System.out.println(res);
		boolean res1 = a1.isEmpty();
		int res2 = a1.indexOf("sameer");
		Object res3 = a1.get(5);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		int res4 = a1.size();
		Iterator itr = a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		for(Object s1:a1)
		{
			System.out.println(s1);
		}
		
		
	}
}
