#include<stdio.h>
int sqr(int);
int main() {
   // Type your code here
  int n;
  scanf("%d",&n);
    int op=sqr(n);
  printf("%d",op);    
   return 0;
}
int sqr(int m)
{
	int result=m*m;
  return result;
}