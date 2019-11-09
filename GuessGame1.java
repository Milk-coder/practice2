import java.util.Random;
import java.util.Scanner;
public class GuessGame{
	public static void main(String[] args){
		System.out.println("欢迎进入游戏");
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);//用户自己取
		int n = random.nextInt(100);
		int a = 4;
		System.out.println("您有"+ a +"次机会");
		int i = 0;
		for(i = 1; i<=a; i++){
			int x = scanner.nextInt();
			if(x == n){
				System.out.println("第"+ i +"次猜测，猜对了");
			  return;
			}
			   else if(x > n){
			    System.out.println("第"+ i +"次猜测，猜大了");
				}
				else{
				System.out.println("第"+ i +"次猜测，猜小了");
				}
		}
	}
}


					
					