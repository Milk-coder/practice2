#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main(){
	//��ӡ����
	int line = 0;
	int i = 0; 
	scanf("%d", &line);
	for (i = 0; i < line; i++){
		//��ӡ�ϰ벿��(�ȴ�ӡ�ո��ٴ�ӡ*�ţ�
		int j = 0;
		for (j = 0; j < line - i - 1; j++){
			printf(" ");
		}
		for (j = 0; j < 2 * i + 1; j++){
			printf("*");
		}
		printf("\n");
	}
		//��ͬ�ķ�����ӡ�°벿��
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


