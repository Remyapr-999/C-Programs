
#include<stdio.h>

void left_right(int a[],int n,int iter);


int main()
{
   int n,i,iter;
   
   scanf("%d",&n);
   int a[n];
   
   for( i = 0; i < n ; i++)
   {
       scanf("%d",&a[i]);
   }
   
   
   scanf("%d",&iter);
  
   left_right(a,n,iter);
  
   return 0;  
}

 void left_right(int arr[],int n,int iter)
 {
     int i , j ;
     int o_temp,e_temp,o_temp_i,e_temp_i;
     o_temp_i = (n%2 == 0)? n -2:n-1;
     e_temp_i =(n%2 == 0)? n - 1: n-2 ;
     

    //To Roate right and Left
    
    for( i = 0 ; i < iter ; i++)
    {
        
        //for right rotation
        o_temp = arr[o_temp_i];
        for( j = o_temp_i; j >= 0 ; j=j-2)
        {
            
            arr[j]=arr[j-2];
        }
        
        arr[0] = o_temp;
        
        //for left rotation
        
        e_temp = arr[1];
        
        for( j = 1; j < n ; j = j+2)
        {
            
            arr[j] = arr[j+2]; 
        }
        
        arr[e_temp_i] = e_temp;
        
    }
    
    for( i = 0 ; i < n ; i++ )
    {
        printf( "%d ", arr[i]);
    }
  
 }