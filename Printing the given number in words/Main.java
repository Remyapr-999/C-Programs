#include<stdio.h>
int main()
{
  //Type your code here
  int opt,num;
  scanf("%d%d",&opt,&num);
  switch(opt)
  {
    case 1:printf("One");
      break;
    case 2:printf("Two");
      break;
    case 3:printf("Three");
      break;
    case 4:printf("Four");
      break;
    default :printf("Invalid");
  }
  return 0;
}