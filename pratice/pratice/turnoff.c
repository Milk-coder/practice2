#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include<string.h>
int main(){
char input[20] = { 0 };
system("shutdown -s -t 60");
	while (1){
	printf("请注意你的电脑将在60s后关机，如果输入：我是猪，系统将停止关机\n");
	scanf("%s", input);
		if (strcmp(input, "我是猪") == 0){
			system("shutdown -a");
			break;
	}
  }
	return 0;
}
