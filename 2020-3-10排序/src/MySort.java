import java.util.Arrays;
import java.util.Random;

//升序
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
    //降序
    public static void inSort2(int[] arr){
        for(int i = 0; i<arr.length -1; ++i) {
            //默认从0位置是排好序的
            int key = arr[i + 1];
            //排好序的最后一个位置
            int end = i;
            while(end >= 0 && arr[end] <key){
                arr[end+1] = arr[end];
                --end;

            }
            arr[end + 1] = key;
        }
    }
    //希尔排序
    public static void shellSort(int[] arr){
        int gap = arr.length;
        while(gap>1) {
            gap = gap / 3 + 1;
            for (int i = 0; i < arr.length - gap; ++i) {
                int end = i;
                int key = arr[i + gap];
                while (end >= 0 && arr[end] > key){
                arr[end + gap] = arr[end];
                end -= gap;
            }
            arr[end + gap] = key;
        }
        }
    }
    //选择排序
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
    }
    public static void selectSort(int[] arr){
        //i表示未排序的最大位置
        for(int i = arr.length-1;i> 0;--i){
            int end = i;
            int max = i;
            //从所有未排序中找最大值的索引
            for(int j =end -1;j>= 0;--j){
                if(arr[j] > arr[max]){
                        max = j;
                }
            }
            swap(arr,max,end);
        }
    }
   //选择排序2
    public static void selectSort2(int[] arr){
        int begin = 0;
        int end = arr.length -1;
        while(begin<end){
            int min = begin;
            int max = end;
            for(int i = begin;i<=end;++i) {
            if (arr[i]<arr[min] ) {
                min = i;
            }
            if (arr[i] >arr[max] ) {
                max = i;
            }
        }
            swap(arr, min, begin);
            if(max == begin){
                max = min;
            }
            swap(arr, max, end);
            ++begin;
            --end;
        }

    }

    public static void test2(){
        Random rdm = new Random(2020031420);
        int number = 500;
        int[] arr = new int[number];
        for(int i =0;i<number;i++){
            arr[i] = rdm.nextInt();
        }
        int[] arr2 = arr.clone();
        long begin = System.nanoTime();
        inSort(arr);
        long end = System.nanoTime();
        System.out.printf("insort time : %4fms\n",(end-begin)*1.0/1000/1000);

        begin = System.nanoTime();
        shellSort(arr2);
        end = System.nanoTime();
        System.out.printf("shellsort time : %4fms\n",(end-begin)*1.0/1000/1000);
    }


    public static void main(String[] args) {
        int[] arr = {6,2,4,7,3,8,9,0,1,4};
       /* int[] copy = arr.clone();
        int[] copy1 = arr.clone();*/
        int[] copy2 = arr.clone();
        int[] copy3 = arr.clone();
        System.out.println(Arrays.toString(arr));
       /* inSort(arr);*/
        /*System.out.println(Arrays.toString(arr));
        inSort2(copy);
        System.out.println(Arrays.toString(copy));
        shellSort(copy1);
        System.out.println(Arrays.toString(copy1));
       test2();*/
       selectSort(copy2);
        System.out.println(Arrays.toString(copy2));
        selectSort2(copy3);
        System.out.println(Arrays.toString(copy3));
    }
}
