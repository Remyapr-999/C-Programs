#include<stdio.h>
int main()
{
//Type your code here
  int i,n,j,k,temp;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {
  	scanf("%d",&a[i]);
  }
  scanf("%d",&k);
  for(i=0;i<n;i++)
  {
  	for(j=i+1;j<n;j++)
    {
        if(a[i]>a[j])
        {
    	temp=a[i];
      a[i]=a[j];
      a[j]=temp;
        }
    }
  }
   int x=n-k;
  printf("%d",a[n-k]);
return 0;
}