package Neosoft_Java_Coding;

public class p10 
{

	public static void main(String[] args) 
	{
		int n=10;
		for(int i=1;i<=2*n-1;i++)
		{
			if(i<=n){
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				if(k==1 || k==i)
					System.out.print("* ");
				else
					System.out.print("  ");	
			}
			}
			else
			{
				for(int j=1;j<=i-n;j++)
				{
					System.out.print(" ");
				}
				for(int k=2*n-1;k>=i;k--)
				{
					if(k==2*n-1|| k==i)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				
			}
			
			System.out.println();
		}
	}

}
