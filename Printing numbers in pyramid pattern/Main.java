#include <stdio.h>
int main() {
	// Type your code here
  int r,c,spc,n,cnt=1;
  scanf("%d",&n);
  for(r=1;r<=n;r++)
  {
  	for(spc=1;spc<=n-r;spc++)
    {
    	printf(" ");
    }
    for(c=1;c<=r;c++)
    {
    	printf("%d ",cnt++);
    }
    printf("\n");
  }
	return 0;
}