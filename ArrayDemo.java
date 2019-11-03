public class ArrayDemo{
//求数组最大值
	// public static int max(int[] a){
		// int max = a[0];
		// for(int v:a){
			// if(v > max){
				// max = v;
				
			// }
		// }
		// return max;
	// }
	// public static int max2(int[] a){
		// int max = a[0];
		// int sz = a.length;
		// for(int i = 0; i< sz; i++){
			// if(max<a[i]){
				// max = a[i];
			// }
		// }
	   // return max;
	// }

	// public static void main(String[] args){
		// int[] arr = {1,2,3,4,5,6};
		// System.out.println(max(arr));
		   // System.out.println(max2(arr));
	// }
// }
		
	// 遍历数组
	public static int[] Array(int n){
		return new int[n];
	}
	public static void printArray(int[] a){
		int sz = a.length;
			for(int i = 0; i<sz;i++){
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};
		printArray(arr);
	}
}
	//求数组平均值
	// public static double average(int[] a){
		// int sum = 0;
		// int sz = a.length;
			// for(int v : a){
			// sum += v;
		// }
		// double r = sum / sz ;
			// return r;
	// }
	// public static void main(String[] args){
		 // int[] arr = {1,2,3,4,5,6};
		 // System.out.println(average(arr));
	// }
// }
	//查找数组下标对应元素
    // public static int find (int[] a ,int v){
		// for (int i = 0; i<a.length; i++){
			// if(a[i]==v){
				// return i;
			// }
		// }
		// return -1;
	// }
	// public static void main(String[] args){
		 // int[] a = {1,2,3,4,5,6};
		 // System.out.println(find(a,5));
	// }
// }	
				
		
		

		