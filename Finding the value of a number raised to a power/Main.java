import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      int pdt=1,i;
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int y = sc.nextInt();
      for(i=1;i<=y;i++)
      {
      	pdt=pdt*x;
      }
      System.out.println(pdt);
      
    }
}