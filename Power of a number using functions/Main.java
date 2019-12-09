#include<stdio.h>
#include<math.h>
int main(){
    // Type your code here
  int a,b;
  scanf("%d%d",&a,&b);
  int op=pwr(a,b);
  printf("%d",op);
  	return 0;
}
int pwr(int x,int y)
{
	int result=pow(x,y);
  return result;
}