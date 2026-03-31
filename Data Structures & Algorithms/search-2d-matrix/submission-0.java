class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int n = matrix[0].length;
        int high = matrix.length*n-1;
        
        while(low<=high){
            int mid = (low+high)/2;
            int row = mid/n;
            int col = mid%n;
            if(target==matrix[row][col]){
                return true;
            }
            else if(target<matrix[row][col]){
                high = mid-1;

            }
            else{
                low= mid+1;
            }
        }
        return false ;

        
    }
}
