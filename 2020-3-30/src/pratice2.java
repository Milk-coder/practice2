import java.util.Arrays;
//寻找第K大
public class pratice2 {
    public int findKth(int[] a, int n, int K) {
        Arrays.sort(a);
        int flag = 0;
        int i = 0;
        for(i = n-1;i> 0;i--){
            if(a[i]==a[i-1]){
                continue;
            }
            else{
                flag+=1;
                if(flag == K){
                    break;
                }
            }
        }
        return  a[i];
    }
}
