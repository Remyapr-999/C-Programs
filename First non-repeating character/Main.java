#include<stdio.h>
#include<string.h>
int main(){
    char a[100];
    scanf("%[^\n]s", a);
    char ch;
    int f;
    for(int i = 0; a[i] != '\0'; i++){
        f = 0;
        for(int j = 0; a[j] != '\0'; j++){
            if(a[i] == a[j] && i != j){
                f = 1;
                break;
            }
        }
        if(f == 0){
            ch = a[i];
            break;
        }
    }
    if(f == 0){
        printf("%c", ch);
    }
    else{
        printf("All the characters are repetitive");
    }
}