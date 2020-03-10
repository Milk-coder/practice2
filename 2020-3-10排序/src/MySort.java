import java.util.Arrays;

public class MySort {
    public static void inSort(int[] arr){
        for(int i = 0; i<arr.length -1; ++i) {
            //默认从0位置是排好序的
            int key = arr[i + 1];
            //排好序的最后一个位置
            int end = i;
            while(end >= 0 && arr[end] >key){
                arr[end+1] = arr[end];
                --end;

            }
            arr[end + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {6,2,4,7,3,8,9,0,1,4};
        System.out.println(Arrays.toString(arr));
        inSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
