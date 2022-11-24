package Hashmapprogram;

import java.util.HashMap;
import java.util.Set;

public class StringProgram
{
	public static void main(String[] args) 
	{
		String str="we will we will rock you and  we will we will ";
		
		String[] spl = str.split(" ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0;i<=spl.length-1;i++ )
		{
			String s1 = spl[i];
			
			if(map.containsKey(s1))
			{
				map.put(s1, map.get(s1)+1);
			}
			else 
			{
				map.put(s1, 1);
			}
		}
		
		Set<String> keys = map.keySet();
		
		for(String key:keys)
		{
			System.out.println(key+": "+map.get(key));
			System.out.println("we have made some changes in the code please check");
		}
		
		
		
	}

}
