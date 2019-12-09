#include<stdio.h>
int main()
{
	//Try out your code here
  int i,j,r,c,flag=0,cnt;
  scanf("%d%d",&r,&c);
  int a[r][c],b[r][c];
  for(i=0;i<r;i++)
  {
  	for(j=0;j<c;j++)
    {
    	scanf("%d",&a[i][j]);
    }
  }
  for(i=0;i<r;i++)
  {
  	for(j=0;j<c;j++)
    {
    	scanf("%d",&b[i][j]);
    }
  }
  for(i=0;i<r;i++)
  {
  	for(j=0;j<c;j++)
    {
    	if((a[i][j])==(b[i][j]))
        {
        	cnt++;
          if(cnt==(r*c))
          {
          	flag=1;
          }
        }
    }
     }
  if(flag==1)
  {
  printf("Yes");
  }
  else
  {
  	printf("No");
  }
	return 0;
}