
#include <stdio.h>

int main()
{
    int n,k,i,c,j,x;
    scanf("%d",&n);
    int a[n];
  	scanf("%d",&k);
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(j=1;j<=k;j++)
    {
        c=0;
        for(i=0;i<n;i++)
        {
            if(a[i]==j)
            {
                c++;
            }
            
        }
        printf("%d %d\n",j,c);
    }

    return 0;
}
