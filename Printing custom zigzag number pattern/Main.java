#include <stdio.h>
int main() {
	// Type your code here
  int i,j,n;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
  	for(j=1;j<=n;j++)
    {
    	if(i%2==1)
        {
        	if(j!=n)
            {printf("%d",i);}
          	else{printf("%d",i+1);}
        }
      else
      {
      	if(j==1)
        {printf("%d",i+1);}
        else{printf("%d",i);}
      }
    }
    printf("\n");
  }
	return 0;
}