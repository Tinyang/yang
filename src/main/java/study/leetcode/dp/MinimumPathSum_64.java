package study.leetcode.dp;

public class MinimumPathSum_64 {
    public int minPathSum(int[][] grid) {
        //routes[i] = min(routes[i-1], routes[i-2], ... , routes[i-k]) + cost[i]
        int height = grid[0].length;
        int width = grid.length;
        return min(height, width, grid);
    }

    private int min(int height, int width, int[][] grid) {
        if (height == 1 && width == 1) { return grid[0][0];}
        if (height == 1) {return min(1, width - 1 , grid) + grid[width - 1][0];}
        if (width == 1) {return min(height - 1, 1, grid) + grid[0][height - 1];}
        return Math.min(min(height,width - 1, grid), min(height - 1, width, grid)) + grid[width - 1][height - 1];
    }


    public int minPathSum2(int[][] grid) {
        int height = grid[0].length;
        int width = grid.length;
        for(int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (i == 0 && j == 0) {grid[i][j] = grid[0][0];}
                else if (j == 0) {grid[i][j] = grid[i][0] + grid[i - 1][0];}
                else if (i == 0) {grid[i][j] = grid[0][j] + grid[0][j - 1];}
                else grid[i][j] = grid[i][j] + Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[width - 1][height - 1];
    }



    public static void main(String[] args) {
        //int[][] arrays = {{1,3,1},{1,5,1},{4,2,1}};
        int[][] arrays = {{1,2,3},{4,5,6}};
        System.out.println(new MinimumPathSum_64().minPathSum(arrays));
        System.out.println(new MinimumPathSum_64().minPathSum2(arrays));


    }

}
