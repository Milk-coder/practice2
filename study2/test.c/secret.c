#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main(){
	char psw[10] = {0};
	int i = 0;
	for (i = 0; i < 3; i++){
		printf("ÇëÊäÈëÃÜÂë");
		scanf("%s", &psw);
	     if(strcmp(psw,"7715877") == 0){//×Ö·û´®±È½Ï¿âº¯Êý
			 printf("ÃÜÂëÕýÈ·\n"); 
			 break;
		}
		 else{
			 printf("ÃÜÂë´íÎó\n");
		 }
		 if (i == 3){
			 printf("Èý´ÎÃÜÂë´íÎó£¬ÍË³ö³ÌÐò\n");
		 }
	}
	return 0;
}