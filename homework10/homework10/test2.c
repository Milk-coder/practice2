#include<stdio.h>
int main(){
	int i;
	for (i = 1; i <= 100; i++){
		if (i % 10 == 9 || i / 10 == 9)
			printf(" %d ", i);
	}
	return 0;
}

