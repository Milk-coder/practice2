#include <stdio.h>
#include <math.h>
int main(){
	int i = 0; 
	for (i = 1; i < 1000000; i++){
		//ȷ��i�Ǽ�λ��
		int tmp = i;
		int sum = 0;
		int n = 0;
		while (tmp){
			n++;
			tmp/=10;
		}
		//����ÿһλ��n�η�֮��
		tmp = i;
		while (tmp){
			sum += (int)pow(tmp%10, n);
			tmp/=10;
		}
		//�Ƚ�
		if (sum == i){
			printf("%d\n", i);
		}
	}
	return 0;
}