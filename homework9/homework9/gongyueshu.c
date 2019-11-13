#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main(){
	int a = 0;
	int b = 0;
	scanf("%d %d", &a, &b);
	while ((a - b) != 0){
		if (a > b){
			a = a - b;
		}
		else
			b = b - a;
	}
	printf("%d\n", b);
	return 0;
}