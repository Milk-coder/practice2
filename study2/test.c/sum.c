#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main(){
	int n = 0;
	int r = 0;
	while (scanf("%d  %d ", &n, &r) != EOF){
		int count = 0;
		while (n){
			count += n%r;
			n /= r;
		}
		int arr[32] = { 0 };
		int i = 0;
		while (count){
			arr[i] = count%r;
			i++;
			count /= r;
		}
		while (--i>= 0){
			if (arr[i] < 10)
				printf("%d", arr[i]);
			else
				printf("%c", arr[i] - 10 + 'A');
		}
		printf("\n");
	
	}
	return 0;
}