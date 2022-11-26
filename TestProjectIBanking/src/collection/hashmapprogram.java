package collection;

import java.util.HashMap;
import java.util.Set;

public class hashmapprogram 
{
	public static void main(String[] args)
	{
		int value=1234563212;
		String con = Integer.toString(value);
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		
		for(int i=0;i<=con.length()-1;i++)
		{
			char val = con.charAt(i);
			
			if(map.containsKey(val))
			{
				map.put(val, map.get(val)+1);

			}
			else
			{
				map.put(val, 1);
			}
			
			Set<Character> keys = map.keySet();
			for(Character key:keys)
			{
				System.out.println(key+": "+map.get(key));
			}
		}
		
	}
	
	

}
