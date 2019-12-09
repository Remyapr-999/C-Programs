#include<stdio.h>
int main()
{
  //fill the code
  int i,n;
  scanf("%d",&n);
  int a[n];
  int max=0;
  for(i=0;i<n;i++)
  {
  	scanf("%d",&a[i]);
  }
  max=a[0];
  for(i=0;i<n;i++)
  {
  	if(a[i]>max)
    {
    	max=a[i];
    }
    
  }
  printf("%d",max);
  return 0;
}