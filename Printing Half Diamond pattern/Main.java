#include <stdio.h>
int main() {
	// Type your code here
  int r,c,spc,n;
  scanf("%d",&n);
  for(r=1;r<=n;r++)
  {
  	for(spc=1;spc<=n-r;spc++)
    {
    	printf(" ");
    }
    for(c=1;c<=(2*r)-1;c++)
    {
    	printf("*");
    }
    printf("\n");
  }
  
	return 0;
}