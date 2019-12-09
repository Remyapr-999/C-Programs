#include<stdio.h>
int fact(int);
int main()
{
	//Try out your code here
  int n,f;
  scanf("%d",&n);
  f=fact(n);
  printf("%d",f);
}
int fact(int n)
{
  int f;
	if(n==1)
    {
    	return 1;
    }
  else
  {
  	f = n*fact(n-1);
  }
  return f;
}