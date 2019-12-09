#include <stdio.h>
int main(){
	// Type your code here
  int i,j,count=1,num;
  scanf("%d",&num);
  for(i=1;i<=num;i++)
  {
  	for(j=1;j<=num;j++)
    {
    	printf("%d",count);
    }
    printf("\n");
    count=count+1;
  }
  	return 0;
}