class Solution {
    // public int countNegatives(int[][] grid) {
    //     int count=0;
    //     for(int i=0;i<grid.length;i++){
    //         for(int j=grid[i].length-1;j>=0;j--){
    //             if(grid[i][j]<0){
    //                 count++;
    //             }
    //             if(grid[i][j]>0){
    //                 break;
    //             }
    //         }
    //     }
    //     return count;
    // }
     public int countNegatives(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length-1;
        int count=0;
        int col=0;
        int row=m-1;
        while(row>=0 && col<=n){
            if(grid[row][col]>=0){
                col++;
            }else{
                count+=n-col+1;
                row--;
            }
        }
        return count;
    }
}