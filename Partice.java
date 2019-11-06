import java.util.Arrays;
public class Partice{
	//二分查找（有序）
	public static int binarySearch(int[]a,int v){
	int left = 0;
	int right = a.length - 1;
	while (left <= right){
		int mid = (left + right)/2;
		if (v == a[mid]){
			return mid;
		}
		else if(v > a[mid]){
			 left = mid + 1;
		}
		else{
			 right = mid - 1;
		}	
	}
	return -1;
}
	public static void main(String[] args){
	int[] a = {1,2,3,4,5};
    System.out.println(binarySearch(a,4));
	}
}
	// 冒泡排序
	public static void swap(int[] a, int i, int j){
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	public static void bubblesort(int[] a){
		for(int i = 0;i<a.length;i++){
			for(int j =0;j<a.length-i-1;j++){
				if(a[j]>a[j+1]){
				swap(a,j,j+1);
				}
			}
		}
	}
	public static void main(String[] args){
		int[] a = {3,5,4,2,9};
		bubblesort(a);
		System.out.println(Arrays.toString(a));
	}
}

	
				
				
					
	
	