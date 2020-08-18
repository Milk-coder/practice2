import java.util.Arrays;

public class Bubblesort {
    public static void bubblesort(int[] arr){
        int temp =0;
        for(int i =0; i<arr.length -1;i++){
            int flag =0;
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                     temp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = temp;
                     flag = 1;
                }
            }
            System.out.println("第" + i+"排序");
            if(flag == 0){
                return;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,4,5,2,7,8};
        /*Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));*/
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));


    }


}
