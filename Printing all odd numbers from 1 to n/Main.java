#include <stdio.h>
int main() {
	//Type your code
  int num,count;
  scanf("%d",&num);
  for(count=1;count<=num;count=count+1)
  {
  	if(count%2==1)
    {
    	printf("%d\n",count);
    }
  }
	return 0;
}