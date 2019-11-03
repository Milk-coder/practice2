public class SwitchDemo{
	public static void main(String[] args){
		int today =  Integer.parseInt(args[0]);
		switch (today){
			case 0:
				System.out.println("周日");
			    break;
			case 1:
				System.out.println("周一");
			    break; 
			case 2:
				System.out.println("周二");
			    break;
			case 3:
				System.out.println("周三");
			    break;
			default:
				System.out.println("不认识的参数");
				break;
		}
		// int n = 1;
		// int sum = 0;
		// while(n <= 5){
		   // int factor = 1;
		   // int ret = 1;
		   // while(ret <= n){
			   // factor *= ret;
			   // ret++;
		   // }
		   // sum += factor;
		   // n++;
		// }
		// System.out.println("sum = " + sum);
	}
}
