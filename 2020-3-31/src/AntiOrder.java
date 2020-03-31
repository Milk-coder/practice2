import java.util.Scanner;
//数组中的逆序对  (还有归并排序方法）
public class AntiOrder {
    public int count(int[] A, int n) {
        int count = 0;;
        for (int i = 0; i < A.length; i++) {
            for (int j =i+1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    count += 1;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6,7,0};
        AntiOrder s = new AntiOrder();
        System.out.println(s.count(A,8));
    }
}

