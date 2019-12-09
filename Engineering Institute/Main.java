

import java.util.Scanner;
import java.util.*;
class Faculty
{
	public int sa;

	public void salary(int sal)
	{
	  //write your Faculty class statements
		System.out.println("Base Salary: "+ sal);
		
	}
}
class CSE extends Faculty
{
	int cseSal;
	public void salary(int sal)
	{
	  //write your CSE class statements
		System.out.println("CSE Faculty: "+(sal+3000));
	}
}
class IT extends CSE
{
	//int itSal;
	public void salary(int sal)
	{
	  
		//write your IT class statements
		System.out.println("IT Faculty: "+ (sal+5000));
	}
}
class ECE extends IT
{
	
	public void salary(int sal)
	{
	  //write your ECE class statements
		System.out.println("ECE Faculty: "+(sal+4500));
	}
}

class Main
{
  public static void main(String[] args)
  {
	  ECE obj = new ECE();
	  //implement your required concept here
	  Scanner sc = new Scanner(System.in);
	  int baseSal = sc.nextInt();  
	  Faculty fac = new Faculty();
	  fac.salary(baseSal);
	  CSE cs = new CSE();
	  cs.salary(baseSal);
	  IT it = new IT();
	  it.salary(baseSal);
	  ECE ece = new ECE();
	  ece.salary(baseSal);
	  
	  
	}
}