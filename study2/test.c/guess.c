#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h> 
#include<stdlib.h>
#include<time.h>
void menu(){
	printf("################################\n");
	printf("########### 1.play #############\n");
	printf("########### 0.exit #############\n");
	printf("################################\n"); 
}
void game(){
	int input = 0;
	int random_num = rand() % 100 + 1;
	while (1){
		printf("请输入数字");
		scanf("%d", &input);
		if (input > random_num){
			printf("猜大了\n");
		}
		else if (input < random_num){
			printf("猜小了\n");
		}
		else {
			printf("恭喜你猜对了\n");
			break;
		}	
	}
}
int main() {
	int input = 0;
	srand((unsigned)time(NULL));
	do
	{
		menu();
		printf("请选择是否开始游戏");
		scanf("%d", &input);

		switch (input){
		case 1:
			game();
			break;
		case 0:
			break;
		default:
			printf("输入错误，请重新输入!");
			break;
		}
	} while (input);
	return 0;
}
