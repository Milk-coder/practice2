#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main(){
	int a = 0;
	int b = 0;
	int temp = 0;
	int i = 0;
	printf("请输入两个正整数");
		scanf("%d", &a, &b);
	if (a<b){
		temp = a;
		a = b;
		b = temp;
	}
	for (i = a; i>0; i++){
		if (i%a == 0 && i%b == 0){
			printf("最小公倍数为=%d\n", i);
		}
	}
	return 0;


}