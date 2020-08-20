import java.util.Arrays;

public class Bubblesort {
    public static void swap(int[] arr, int i, int j){
        int temp  = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubblesort1(int[] arr){
        int temp =0;
        for(int i =0; i<arr.length -1;i++){
            int flag =0;
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                     flag = 1;
                }
            }
            System.out.println("第" + i+"排序");
            if(flag == 0){
                return;
            }
        }
    }
    public static void bubbleSort2(int[] arr){
        int len = arr.length;
        while(len > 0){
            int flag = 0;
            //一轮冒泡排序，排好一个元素位置
            for(int i = 0;i<arr.length-1;i++){
                if(arr[i] > arr[i+1]){
                    swap(arr,i,i+1);
                    flag = 1;
                }
            }
            if(flag == 0)
                break;
                --len;

        }
    }


    public static void main(String[] args){
        int[] arr = {1,2,4,5,2,7,8};
        /*Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));*/
       /* bubblesort1(arr);
        System.out.println(Arrays.toString(arr));*/
        bubbleSort2(arr);
        System.out.println(Arrays.toString(arr));


    }


}
