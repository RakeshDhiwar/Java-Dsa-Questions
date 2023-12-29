import java.util.Arrays;
public class Bubble_Sort{
    public static void main(String[] args) {
        int [] arr = {3,4,2,5,6};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        boolean swap = false;
        for(int i =0; i < arr.length; i++){
            for(int j=1; j< arr.length - i; j++ ){
                //swap
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swap = true;
                }
            }

            if(!swap){
                break;
            }
        }
    }
}