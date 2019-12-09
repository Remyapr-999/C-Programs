#include<stdio.h>
int sum_n(int);
int main() {
    // Type your code here
  int n;
  scanf("%d",&n);
  int op=sum_n(n);
  printf("%d",op);
  	return 0;
}
int sum_n(int m)
{
	int sum=0,i;
  for(i=1;i<=m;i++)
  {
      	sum=sum+i;
  }
  return sum;
}