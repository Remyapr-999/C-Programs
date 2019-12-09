#include <stdio.h>
int sum(int);
int main()
{
  //Type your code here
  int n,s=0;
  scanf("%d",&n);
  int x=sum(n);
  printf("%d",x);
}
int sum(int n)
{
  int s;
	if(n==1)
    {
    	return 1;
    }
  else
  {
  	s=n+sum(n-1);
  }
  return s;

}