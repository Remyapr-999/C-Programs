#include<stdio.h>
int main()
{
  //Type your code here
  int year,ck;
  scanf("%d",&year);
  ck=year%4;
  if(ck==0)
  {
  	printf("Leap year");
  }
  else
  {
  	printf("Not Leap year");
  }
  return 0;
}