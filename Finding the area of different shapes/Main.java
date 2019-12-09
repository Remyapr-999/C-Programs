import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
     // int i;
      Scanner sc = new Scanner(System.in);
      int choice = sc.nextInt();
      switch(choice)
      {
      case 1: int side = sc.nextInt();
      		  int areaSquare = side * side;
      		  System.out.println(areaSquare);
      		  break;
      case 2: int length = sc.nextInt();
      		  int breadth = sc.nextInt();
      		  int areaRectangle = length * breadth;
      		  System.out.println(areaRectangle);
      		  break;
      case 3: int base = sc.nextInt();
      		  int height = sc.nextInt();
      		  float areaTriangle = (base * height)/2;
      		  System.out.println(areaTriangle);
      		  break;
      case 4: int radius = sc.nextInt();
      		  double areaCircle = 3.14 * radius *radius;
      		  System.out.println(areaCircle);
      		  break;
      default: System.out.println("Invalid input");
      		  break;
      
      
      
      }
      sc.close();
    }
}