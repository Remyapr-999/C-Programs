#include<stdio.h>
#include<stdlib.h>
void check_sum_and_display(int arr[], int size, int sum);
int main()
{
    // Get the size of an array
    int n;
    scanf("%d", &n);
    
    // Get the array elements
    int a[n], i;
    for(i=0; i<n; i++)
    {
        scanf("%d", &a[i]);
    }
    
    // Get the sum value (to check with an array elements)
    int ele;
    scanf("%d", &ele);
    
  	// Function call to check the sum of any two elements in an array equal to given sum 
  	// and display the same
    check_sum_and_display(a, n, ele);
    return 0;
}

void check_sum_and_display(int a[], int n, int ele)
{
  // Type your code here
  int i,j,sum=0,flag=0;
  for(i=0;i<n;i++)
  {
  	for(j=i+1;j<n;j++)
    {
    	sum=a[i]+a[j];
      if(ele==sum)
      {
       printf("Perfect couple: %d %d",a[i],a[j]);
        flag=1;
        break;
      }
    }   
  }
  if((flag!=1))
  {
  	printf("No perfect couple found!");
  }
}