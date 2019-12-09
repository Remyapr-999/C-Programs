#include<stdio.h>
int prime(int);
int main(){
    // Type your code here
  int n,i;
  scanf("%d",&n);
  for(i=2;i<=n;i++)
  {
  	int flag=prime(i);
    if(flag==1)
    {
    	printf("%d\n",i);
    }
  }
    return 0;
}
int prime(int num)
{
	int prime=1,n=2;
 	while(n<=num/2)
    {
    	if(num%n == 0)
        {
        	prime=0;
          break;
        }
      n++;
    }
  return prime;
}
	
