public class ArrangeArray {
    public static void main(String[] args) {
        long[] arr = {1,2,3,4,5,6};
        rearrange(arr,6);
        for (long l : arr) {
            System.out.print(l + " ");
        }
    }
    public static void rearrange(long[] arr, int n){

        // Your code here
        int j=0;
        int k=n-1;
        long key = arr[n-1] +1;
        for(int i=0; i<n; i++){
            if(i%2==0){
                arr[i] = (arr[k]%key)*key+arr[i];
                k--;
            }
            else {
                arr[i] = (arr[j]%key)*key+arr[i];
                j++;
            }
        }
        for(int i=0;i<n;i++) {
            arr[i]=arr[i]/key;
        }

    }
}
