import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
          insertion(arr);
//        bubble(arr);
//        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    // INSERTION SORT

    static void insertion(int[] arr){
        for (int i =0; i < arr.length - 1; i++) {
            for (int j=i+1; j>0;j--){
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                }
            }
        }
    }
    //SELECTION SORT
    static void selectionSort(int[] arr){
        for (int i=0; i< arr.length;i++){
            int last = arr.length - i -1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    static void swap(int[] arr, int start, int end){
        int temp = start;
        start = end;
        end = temp;
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i=start; i<=end; i++){
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    //BUBBLE SORT
    static void bubble(int[] arr) {
        boolean swap;
        for (int i=0; i<arr.length; i++){
            swap = false;
            for(int j=1; j< arr.length-1;j++){
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swap = true;
                }

            }
            if (!swap) {
                break;
            }
        }

    }
}
