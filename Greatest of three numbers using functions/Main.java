#include <stdio.h>
int great(int,int,int);
int main(){
	// Type your code here
  int a,b,c;
  scanf("%d%d%d",&a,&b,&c);
  great(a,b,c);
  	return 0;
}
int great(int x,int y,int z)
{
	if((x>y) && (x>z))
    {
    	printf("%d",x);
    }
  else if((y>x) && (y>z))
  {
  	printf("%d",y);
  }
  else
  {
  	printf("%d",z);
  }
}