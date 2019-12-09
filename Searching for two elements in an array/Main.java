#include<stdio.h>
int main()
{
  //Type your code here
  int n,i,e1,b;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {
  	scanf("%d",&a[i]);
  }
  scanf("%d",&e1);
  scanf("%d",&b);
  int x=-1;
  int y=-1;
  for(i=0;i<n;i++)
  {
  	if(e1==a[i])
    {
    	x=i;
    }
    if(b==a[i])
    {
    	y=i;
    }
  }
  printf("%d\n",x);
  printf("%d",y);
  return 0;
}