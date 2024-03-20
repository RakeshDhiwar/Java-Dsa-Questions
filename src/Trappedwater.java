public class Trappedwater {
    public static  void trapWater(int[] height){
        int n = height.length;
        //left max boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < leftMax.length; i++) {
            leftMax[i] = Math.max(leftMax[i-1],height[i] );
        }

        //right max
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i = n-2; i >=0; i--) {
            rightMax[i] = Math.max(height[i],rightMax[i+1] );
        }
        int trappedWater = 0;

        //loop
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(rightMax[i],leftMax[i]);
            trappedWater += waterlevel - height[i];
        }
        System.out.println(trappedWater);
    }
    public static void main(String[] args) {
        int[] height = {4,2,0,6,3,2,5};
        trapWater(height);
    }
}
