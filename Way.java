import java.util.Scanner;
public class Way{
	// 方法的使用
	//用递归求N的阶乘
	// public static void main(String[] args){
	 // Scanner scanner = new Scanner(System.in);
	 // int a = scanner.nextInt();
	 // System.out.println(factorial(a));
	// }
	// public static int factorial(int a){
		// if(a == 1){
			// return 1;
		// }
		// else{
			// return  a *factorial(a-1);
		// }
	// }
// }
// 递归求1+2+3+4...+10;
	// public static void main(String[] args){
	 // System.out.println(sum(10));
	// }
	// public static int  sum(int a){
		// if(a == 1){
			// return 1;
		// }
		// else{
				// return a+ sum(a-1);
		// }
	// }
// }
//顺序打印数字的每一位
	 public static void main(String[] args){
	 Scanner scanner = new Scanner(System.in);
	 int n = scanner.nextInt();
	 System.out.println(printf(n));
	 }
	 public static int printf(int n){
		 if(n<10){
			 return n;
		 }
		 else{
			 int r = n%10;
			 printf(r);
			 int a = n%10;
			 return n;
		 }
	 }
}
			 
	 
			