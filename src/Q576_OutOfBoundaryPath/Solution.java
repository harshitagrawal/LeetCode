package Q576_OutOfBoundaryPath;

import java.util.Arrays;

class Solution {

    //Recursion
    // public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
    //     if(startRow < 0 || startColumn < 0 || startRow == m || startColumn == n) return 1;
    //     if(maxMove == 0) return 0;
    //     if(startRow < 0 || startColumn < 0 || startRow == m || startColumn == n) return 1;
    //     return 
    //     findPaths(m,n,maxMove-1,startRow-1, startColumn)
    //     + findPaths(m,n,maxMove-1,startRow+1, startColumn)
    //     + findPaths(m,n,maxMove-1,startRow, startColumn-1)
    //     + findPaths(m,n,maxMove-1,startRow, startColumn+1);
    // }

    //Recursion with Memoization
    static int M = 1000000007;
    public static int findPaths(int m, int n, int maxMove, int startRow, int startColumn){
        int[][][] memo = new int[m][n][maxMove+1];
        for(int[][] arr: memo){
            for(int[] ar: arr){
                Arrays.fill(ar, -1);
            }
        }
        return findPaths(m,n,maxMove, startRow, startColumn, memo);
    }


     public static int findPaths(int m, int n, int maxMove, int startRow, int startColumn, int[][][] memo) {
        if(startRow < 0 || startColumn < 0 || startRow == m || startColumn == n) return 1;
        if(maxMove == 0) return 0;
        if(memo[startRow][startColumn][maxMove] >= 0 ) return memo[startRow][startColumn][maxMove];
        memo[startRow][startColumn][maxMove] =  (
        (findPaths(m,n,maxMove-1,startRow-1, startColumn,memo) 
        + findPaths(m,n,maxMove-1,startRow+1, startColumn, memo)) % M
        + (findPaths(m,n,maxMove-1,startRow, startColumn-1, memo)
        + findPaths(m,n,maxMove-1,startRow, startColumn+1,memo)) % M
        ) % M;
        return memo[startRow][startColumn][maxMove];
    }

    public static void main(String[] args) {
        System.out.println(findPaths(2,2,2,0,0));
    }


}