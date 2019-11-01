#include <stdio.h>
#include <math.h>
int main(){
	int i = 0; 
	for (i = 1; i < 1000000; i++){
		//确定i是几位数
		int tmp = i;
		int sum = 0;
		int n = 0;
		while (tmp){
			n++;
			tmp/=10;
		}
		//计算每一位的n次方之和
		tmp = i;
		while (tmp){
			sum += (int)pow(tmp%10, n);
			tmp/=10;
		}
		//比较
		if (sum == i){
			printf("%d\n", i);
		}
	}
	return 0;
}