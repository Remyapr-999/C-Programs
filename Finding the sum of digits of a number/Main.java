#include <stdio.h>
int main() {
	//Type your code
  int n,sum=0,last;
  scanf("%d",&n);
  while(n>0)
  {
  	last=n%10;
    sum=sum+last;
    n=n/10;
  }
  printf("%d",sum);
	return 0;
}