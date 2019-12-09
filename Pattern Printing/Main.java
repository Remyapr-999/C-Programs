import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      int i,j;//n=5;
		      Scanner sc = new Scanner(System.in);
		      int row = sc.nextInt();
		      int col = sc.nextInt();
		      int num = row;
		      int n=num;
		      for(i = 0;i < row;i++)
		      {
		    	  num=n+1;
		      	for(j = 0;j < col;j++)
		        {
		      		if(i == 0)
	        		{
	        			System.out.print(num-1);
	        		}
		      		else
		      		{
				        	if(j <= i)
				            {
				        		System.out.print(--num);
				            }
				        	else
				        	{
				        		System.out.print(num);
				        	}
		      		}
		        }
		        System.out.println("");
		      }
		      sc.close();
    }
}