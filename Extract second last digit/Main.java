#include<stdio.h>
int main()
{
  //Type your code here
  int a,n,sec_last;
  scanf("%d",&n);
  a=n%100;
  sec_last=a/10;
  printf("%d",sec_last);
  return 0;
}