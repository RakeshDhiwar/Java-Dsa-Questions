public class leetcode832 {

//    832 - Flipping an image
//    Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

//    To flip an image horizontally means that each row of the image is reversed.
//
//    For example, flipping [1,1,0] horizontally results in [0,1,1].
//    To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
//
//    For example, inverting [0,1,1] results in [1,0,0].

    //Solution
    public static void main(String[] args) {
        int[][] image = { {1,0,0,0}, {0,1,0,0} , {0,0,3,0} , {0,0,0,4} } ;

        //Reverse each row
        for(int i=0; i<image.length; i++){
            int s = 0;
            int e = image[i].length-1;
            while(s < e){
                //swap
                int temp = image[i][s];
                image[i][s] = image[i][e];
                image[i][e] = temp;
                s++;
                e--;
            }
        }



        // 0 to 1 & 1 to 0
        for(int i=0; i<image.length; i++){
            for(int j=0; j < image[i].length; j++){
                if(image[i][j] == 0){
                    image[i][j] = 1;
                } else{
                    image[i][j] = 0;
                }
            }
        }
        //print
        for (int[] ints : image) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

    }
}
