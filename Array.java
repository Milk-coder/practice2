import java.util.Arrays;
public class Array{
	//遍历数组
	public static void printArray(int[] arr){
		for(int x: arr){
			System.out.println(x);
		}
	}
	//检查数组有序性
	public static boolean isSorted(int[] arr){
		for(int i = 0; i <arr.length;i++){
			if(arr[i] > arr[i+1]){
				return true;
			}	
		}
			return false;
	}
	// 数组逆序
	public static void reverse(int[] arr){
		int left = 0;
		int right = arr.length-1;
		while(left<right){
			int tmp = arr[left];
			arr[left] = arr[right];
			arr[right] = tmp;
			left++;
			right--;
		}
	}
	public static void main(String[] args){
		int[] arr = {5,4,3};
	//数组转字符串
		String Arr = Arrays.toString(arr);
		System.out.println(Arr);
		printArray(arr);
		System.out.println(isSorted(arr));
		reverse(arr);
		System.out.println(Arrays.toString(arr));
	}
}

