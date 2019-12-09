#include <stdio.h>
int main() {
	//Type your code
  int num,sum,count,flag=1;
  scanf("%d",&num);
  for(count=1;count<=num*2-1;count=count+1)
  {
  //  if(flag<=count) 
   // {
    if(count%2==1)
      {
          printf("%d\n",count);	
      }
    //}
    // flag=flag+1;
  }
	return 0;
}