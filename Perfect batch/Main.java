/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
int main()
{
  //Type your code here
  int n,i,sum1=0,sum2=0;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {
  	scanf("%d",&a[i]);
  }
  for(i=0;i<n;i++)
  {
  	if(i<=2)
    {
    	sum1=sum1+a[i];
    }
    else
    {
    	sum2=sum2+a[i];
    }
  }
  if(sum1==sum2)
  {
  	printf("Perfect Batch");
  }
  else
  {
  	printf("Not a Perfect Batch");
  }
  
  return 0;
}