#include <stdio.h>
int main() {
    // Type your code here
  int r,c,n;
  scanf("%d",&n);
  for(r=n;r>=1;r--)
  {
  	for(c=r;c>=1;c--)
    {
    	printf("%d",c);
    }
    printf("\n");
  }
	return 0;
}