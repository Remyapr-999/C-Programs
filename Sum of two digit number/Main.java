#include<stdio.h>
int main()
{
  //Type your code here
  int num,num1,num2,sum;
  scanf("%d",&num);
  num1=num/10;
  num2=num%10;
  sum=num1+num2;
  printf("%d",sum);
  return 0;
}