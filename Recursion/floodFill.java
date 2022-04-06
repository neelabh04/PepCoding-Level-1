public class floodFill {
    public static void solution(int[][] maze, int row, int col, String asf, boolean[][] visited){
        if(row < 0 || col < 0 || row == maze.length || col == maze[0].length || maze[row][col] == 1 || visited[row][col] == true){
            return;
        }

        if(row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(asf);
            return;
        }

        visited[row][col] = true;
        // top
        solution(maze, row - 1, col, asf + "t", visited);
        // left 
        solution(maze, row, col - 1, asf + "l", visited);
        // right
        solution(maze, row, col + 1, asf + "r", visited);
        // down
        solution(maze, row - 1, col, asf + "d", visited);
        visited[row][col] = false;
    }
}
