public class diag 
{
    public static void main(String[] args) 
    {
        int[][] grid = {
                        {1,1,1,1,0}, 
                        {1,0,1,1,0},
                        {1,0,0,1,0},
                        {0,1,0,0,1}
                       };
                       
        System.out.println("Number of islands: "+countIslands(grid));               
    }
    
    public static int countIslands(int[][]grid)
    {
        int count = 0;
        for (int i=0; i<grid.length; i++)
        {
            for (int j=0; j<grid[0].length; j++)
            {
                if (grid[i][j]==1)
                {
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    public static void dfs(int[][] grid, int i, int j)
    {
        if ((i<0) || (i>=grid.length) || (j<0) || (j>=grid[0].length) || (grid[i][j] == 0)) return;

        // DULR - Search element 1 in DOWN, UP, LEFT, RIGHT => if found, make it 0, then continue DULR (including diagonal)
        grid[i][j] = 0;
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j-1);
        dfs(grid, i, j+1);
        dfs(grid, i-1, j-1); // Down diagonal
        dfs(grid, i+1, j+1); // Up diagonal
    }
}