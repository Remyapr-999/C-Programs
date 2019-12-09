#include <stdio.h>
int main() {
	//Type your code here
  int a,b,c;
  scanf("%d%d%d",&a,&b,&c);
  int op=gcd(a,b,c);
  printf("%d",op);
	return 0;
}
int gcd(int x,int y,int z)
{
  int value,min;
	if(x<y && x<z)
    {
    	min=x;
    }
  else if(y<x && y<z)
  {
  	min=y;
  }
  else
  {
  	min=z;
  }
  while(min>=1)
  {
  if((x%min == 0)&&(y%min == 0)&&(z%min == 0))
  {
  	value=min;
    break;
  }
  min--;
  }
  return value;
}