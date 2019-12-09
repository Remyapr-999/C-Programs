// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Type your code here 
  int n,i,location;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {
  	scanf("%d",&a[i]);
  }
  int max=a[0];
  for(i=0;i<n;i++)
  {
  	if(a[i]>max)
    {
    	location=i;
    }
  }
  printf("%d",location);
  
   return 0;
}