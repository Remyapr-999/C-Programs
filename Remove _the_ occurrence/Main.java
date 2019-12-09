#include<stdio.h>
#include<string.h>
int main(){
    char a[100], temp[26];
    scanf("%[^\n]s", a);
    int index = 0;
    for(int i = 0; a[i] != '\0'; i++){
        if((a[i] == 't' || 'T') && a[i + 1] == 'h' && a[i + 2] == 'e'){
            i = i + 3;
        }
        else{
            temp[index] = a[i];
            index++;
        }
    }
    temp[index] = '\0';
    printf("%s\n", temp);
    return 0;
}