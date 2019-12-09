import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
    	int i;
    	Scanner sc = new Scanner(System.in);
    	String st1 = sc.nextLine();
    	String st2 = sc.nextLine();
    	st1=st2;
    	int parts = sc.nextInt();
    	//String replaced = replace(st1,st2);
    	//System.out.println(st2.length());
    	for(i = 0;i < st1.length();i++)
    	{
    		char c = st1.charAt(i);
    		
    		System.out.print(c);
    		if(c == ' ')
    		{
    			System.out.println("");
    		}
    	}
    	
    	sc.close();
    }
}