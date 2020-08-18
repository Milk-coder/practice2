import java.util.Arrays;
public class selectsort {
    //交换
    public static void swap(int[] arr, int i, int j){
        int temp  = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    //折半寻找
    public static void selectSort1(int[] arr){
            int begin = 0;
            int end = arr.length-1;
            while(begin < end){
            int minInd = begin;
            int maxInd = end;
            for(int i = begin; i <= end;i++) {
                if (arr[i] > arr[maxInd])
                    maxInd = i;
                if (arr[i] < arr[minInd])
                    minInd = i;
            }
                swap(arr,begin,minInd);
                if(maxInd == begin){
                    maxInd = minInd;
                }
                swap(arr,end,maxInd);
                ++begin;
                --end;
            }
        }
        //找最大的
        public static void selectSort2(int[] arr){
            int end = arr.length-1;
            int maxInd = end;
            for(int i = end;i >= 0;i--){
                if(arr[i] > arr[maxInd]){
                    maxInd = i;
                }
            }
            swap(arr,end,maxInd);
            --end;
        }


    public static void main(String[] args) {
        int[] arr = {1,4,2,8,4,6,3};
        selectSort1(arr);
        System.out.println(Arrays.toString(arr));
        selectSort2(arr);
        System.out.println(Arrays.toString(arr));
    }
}
