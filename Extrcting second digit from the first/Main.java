#include <stdio.h>
int main() {
	//Type your code
  int num,value;
  scanf("%d",&num);
  while(num/100!=0)
  {
  	    	num=num/10;
     
  }
  value=num%10;
  printf("%d",value);
	return 0;
}