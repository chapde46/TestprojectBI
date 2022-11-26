package logicalProgram;

public class ArmstrongNumber 
{

	public static void main(String[] args)
	{
		int num = 153;
		int sum = 0;
		for(int i=num; i>0;i=i/10)
		{
			int res = i%10;
			
			sum=sum+res*res*res;
			
		}
		if(num==sum)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("number is not armstrong");
		}
		
	}
}
