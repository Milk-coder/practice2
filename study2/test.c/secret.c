#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main(){
	char psw[10] = {0};
	int i = 0;
	for (i = 0; i < 3; i++){
		printf("����������");
		scanf("%s", &psw);
	     if(strcmp(psw,"7715877") == 0){//�ַ����ȽϿ⺯��
			 printf("������ȷ\n"); 
			 break;
		}
		 else{
			 printf("�������\n");
		 }
		 if (i == 3){
			 printf("������������˳�����\n");
		 }
	}
	return 0;
}