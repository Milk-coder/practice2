#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main(){
	//打印行数
	int line = 0;
	int i = 0; 
	scanf("%d", &line);
	for (i = 0; i < line; i++){
		//打印上半部分(先打印空格，再打印*号）
		int j = 0;
		for (j = 0; j < line - i - 1; j++){
			printf(" ");
		}
		for (j = 0; j < 2 * i + 1; j++){
			printf("*");
		}
		printf("\n");
	}
		//相同的方法打印下半部分
		for (i = 0; i < line - 1; i++){
			int j = 0;
			for (j = 0; j < i + 1; j++){
				printf(" ");
			}
			for (j = 0; j < 2 * (line - i - 1) - 1; j++){
				printf("*");
			}
			printf("\n");
		}
	return 0;

}


