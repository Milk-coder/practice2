#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main(){
	int a = 0;
	int n = 0;
	int i = 0;
	int sum = 0;
	int j = 0;
	scanf("%d%d", &a, &n);
	for (i = 0; i < n; i++){
		j = j * 10 + a;
		sum += j;
	}
	printf("sum = %d", sum);
	return 0;
}