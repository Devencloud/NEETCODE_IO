class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = speed.length;
        int[][] arr = new int[n][2];
        for(int i = 0;i<n;i++){
            arr[i][0] = position[i];
            arr[i][1] = speed[i];
        }
        Arrays.sort(arr,(a,b)->b[0]-a[0]);
        int fleets  = 0;
        double lasttime =0;
        for(int car[]:arr){
            double curr =(double)(target-car[0])/car[1];
           if(curr> lasttime){
            fleets++;
            lasttime = curr;

           }
        }
        return fleets;


        
    }
}
