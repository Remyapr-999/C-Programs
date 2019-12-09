#include <stdio.h>
int main() {
	//Type your code
  int num,com,i;
  scanf("%d%d",&num,&com);
  for(i=1;i<=num;i++)
  {
  	printf("%d",i);
    if((i%3==0)&&(i!=num))
    {
    	printf(",");
    }
  }
	return 0;
}