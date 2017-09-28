//P6 Assignment
//Author: Hayden Lingle
//Date: Sep 26, 2017
//Class: CS164
//Email: hlingle@rams.colostate.edu



public class P6 {

    // Class variables
    public static Maze maze;
    public static int mazeWidth;
    public static int mazeHeight;

    public static void main(String[] args) {

        // Create maze
        String fileName = args[0];
        System.out.println(fileName);
        System.err.println("Maze name: " + fileName);

        // Get dimensions
        maze = new Maze(fileName);
        mazeWidth = maze.getWidth();
        mazeHeight = maze.getHeight();
        System.err.println("Maze width: " + mazeWidth);
        System.err.println("Maze height: " + mazeHeight);

        // Add code to move around maze
    }
}   