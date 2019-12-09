#include <stdio.h>
int main(){
	// Type your code here
  int i,j,num,flag=0;
  scanf("%d",&num);
  for(i=1;i<=num;i++)
  {
  	for(j=1;j<=i;j++)
    {
    
       if(flag==0)
      {
      	printf("*");
         flag=1;
      }
      else{
      	printf("#");
        flag=0;
      }
     
    }
    printf("\n");
    //printf("#");
  }
  	return 0;
}