//#include <stdio.h>
//int binary_search(int arr[],int key,int sz){
//	int mid = 0;
//	int left = 0;
//	int right = sz - 1;
//	while (left <= right){
//		mid = (left + right) / 2;
//		if (arr[mid] > key){
//			right = mid - 1;
//		}
//		else if (arr[mid] < key){
//			left = mid + 1;
//		}
//		else {
//			return mid;
//		}
//	}
//	return -1;
//}
//int main(){
//	int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 ,9, 10};
//	int sz = sizeof (arr)/sizeof (arr[0]);
//	int key = 6;
//	int ret = binary_search(arr,6,sz);
//	if (ret == -1){
//		printf("未找到");
//	}
//	else{
//		printf("找到了，下标是：%d\n", ret);
//	}
//	return 0;
//}