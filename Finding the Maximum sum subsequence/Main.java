#include<stdio.h>
int main()
{
        int n;
        scanf("%d",&n);
        int a[20];
        int i, j;
        for(i=0; i<n; i++)
        {
            scanf("%d",&a[i]);
        }
        printf("%d",sum_subsequence( a, n ) );
        return 0;
}
     int sum_subsequence( int a[], int n )
    {
        int running_sum, max_sum_sub, i;
  
 	    running_sum = a[0];
  	    max_sum_sub = a[0];
  	    for(i = 1; i < n; i++)
        {
            if(a[i] > a[i-1])
            {
                running_sum += a[i];
            }
            else 
            {
                running_sum = a[i];
            }
            if(running_sum > max_sum_sub)
            {
                max_sum_sub = running_sum;
            }
        }
        return max_sum_sub;
    }