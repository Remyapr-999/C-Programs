#include<stdio.h>
int main()
{
  //Type your code here
   int a,first,third,sum;
  scanf("%d",&a);
  first=a/100;
  third=a%10;
  sum=first+third;
  printf("%d",sum);
  return 0;
}