#include <stdio.h>
int main() {
	//Type your code
  int n,sum=0,count;
  scanf("%d",&n);
  for(count=1;count<=n;count=count+1)
  {
  	sum=sum+count;
  }
  printf("%d",sum);
	return 0;
}