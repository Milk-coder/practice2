import java.util.Arrays;

public class shellsort {
    public static void shellSort(int[] arr) {
       int gap = arr.length;
        while (gap > 1) {
             gap = gap / 3 + 1;
            for (int i = 0; i < arr.length - gap; i++) {
                int end = i;
                int key = arr[end + gap];
                while (end >= 0 && arr[end] > key) {
                    arr[end + gap] = arr[end];
                    end -= gap;
                }
                arr[end + gap] = key;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr ={1,2,5,2,6,3,8};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}