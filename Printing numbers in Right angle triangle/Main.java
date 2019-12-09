#include <stdio.h>
int main(){
  	// Type your code here
  int i,j,num;
  scanf("%d",&num);
  for(i=1;i<=num;i++)
  {
  	for(j=1;j<=i;j++)
    {
    	printf("%d",i);
    }
    printf("\n");
  }
	return 0;
}