import java.util.Scanner;

//import required packages here

class Item
{
	private int price;
	//create various method to return attribute value(s)
}
 
class Customer
{
	private String product;
	private int quantity;
	//create various method to return attribute value(s)
	void product(String product)
	{
		this.product = product;
		System.out.print("Total Price is : ");
	}
	
}

class Bill
{
	//implement your logic to calculate total price
	void bill(int p,int qua)
	{
		int amt = p*qua;
		System.out.print(amt);
	}
}
class Main
{
	public static void main(String[] args)
		{
			  Item i = new Item();
			  Customer c = new Customer();
			  Scanner sc = new Scanner(System.in);
			  String pdt = sc.nextLine();
			  int p =sc.nextInt();
			  int qua = sc.nextInt();
			  c.product(pdt);
			  Bill obj = new Bill();
			  obj.bill(p,qua);
			  //write the logic here
			  
		}
}
