#include <stdio.h>
int main() {
	//Type your code
  int num,f_no,l_no,sum;
  scanf("%d",&num);
  l_no=num%10;
  while(num/10!=0)
  {
  	num=num/10;
  }
  f_no=num;
  sum=l_no+f_no;
  printf("%d",sum);
	return 0;
}