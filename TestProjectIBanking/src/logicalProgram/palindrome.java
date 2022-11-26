package logicalProgram;

public class palindrome 
{ 
	public static void main(String[] args)
	{
		int a=123321;
		
		String str = Integer.toString(a);
		String res = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			res=res+str.charAt(i);
		}
		
		if(res==str)
		{
		System.out.println("pendrome");	
		}
		else
		{
			System.out.println("not pelindrome");
		}

	}
}	
		
	

