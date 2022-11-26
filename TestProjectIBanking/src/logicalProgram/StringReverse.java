package logicalProgram;

public class StringReverse 
{
	public static void main(String[] args)
	{
	
		String str="vishal bandu chapde";
		String res = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			res=res+str.charAt(i);
		}
		System.out.println(res);
	}

}
