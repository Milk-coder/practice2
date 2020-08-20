import java.util.Arrays;

public class quickSort {
    public static void swap(int[] arr, int i, int j){
        int temp  = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partion(int[] arr,int left,int right){
        int key = arr[left];
        int start = left;
        while(left < right){
            //一定要从后往前找第一个小于key的值
            while(left < right && arr[right] >= key) {
                --right;
            }
            //从前往后找第一个大于key的值
            while(left < right && arr[left] <= key) {
                ++left;
            }
            swap(arr,left,right);
        }
    //把基准值放在相遇的位置
        swap(arr,left,start);
        return  left;
    }
    public static void quickSort(int[] arr,int left,int right){
        if(left <right){
            int mid = partion(arr,left,right);
            //进行分组
            quickSort(arr,left,mid-1);
            quickSort(arr,mid+1,right);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 8, 5, 3, 10, 4, 7};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
