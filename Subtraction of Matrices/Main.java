#include<stdio.h>
int main()
{
  //Type your code here
  int r,c,i,j;
  scanf("%d%d",&r,&c);
  int a[r][c],b[r][c],sub[r][c];
  for(i=0;i<r;i++)
  {
  	for(j=0;j<c;j++)
    {
    	scanf("%d",&a[i][j]);
    }
   // printf("\n");
  }
  for(i=0;i<r;i++)
  {
  	for(j=0;j<c;j++)
    {
    	scanf("%d",&b[i][j]);
    }
    //printf("\n");
  }
  for(i=0;i<r;i++)
  {
  	for(j=0;j<c;j++)
    {
    	sub[i][j]=a[i][j]-b[i][j];
     printf("%d ",sub[i][j]);
    }
    printf("\n");
  }
  
  return 0;
}