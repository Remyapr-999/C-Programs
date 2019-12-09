#include<stdio.h>
int main()
{
  //Type your code here
  int i,n,j,k;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {
  	scanf("%d",&a[i]);
  }
  for(i=0;i<n-1;i++)
  {
  	for(j=0;j<n;j++)
    {
    	for(k=0;k<n;k++)
        {
        	if((k>j) && (j>i))
            {
            	printf("(%d, %d, %d) ",a[i],a[j],a[k]);
            }
        }
      
    }
    printf("\n");
  }
  return 0;
}