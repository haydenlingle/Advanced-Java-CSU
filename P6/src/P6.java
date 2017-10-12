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
    
    public static void evasiveRight(){
    	maze.moveDown();
    	maze.moveRight();
    	maze.moveRight();
    	maze.moveUp();
    }
    
    public static void evasiveLeft(){
    	maze.moveDown();
    	maze.moveLeft();
    	maze.moveLeft();
    	maze.moveUp();
    }

    public static void main(String[] args) {

        // Create maze
        String fileName = args[0];
        System.out.println("Maze name: " + fileName);


        // Get dimensions
        maze = new Maze(fileName);
        mazeWidth = maze.getWidth();
        mazeHeight = maze.getHeight();
        System.err.println("Maze width: " + mazeWidth);
        System.err.println("Maze height: " + mazeHeight);
        
        int evenOrOdd = -99;
        
        for(int i = 0; i <= mazeHeight; i++){
        	evenOrOdd = i%2;
        	for(int j = 0; j < mazeWidth - 1; j++){
        		if(evenOrOdd == 0){//even row
        			if(!maze.moveRight()){//hits Yabuba
        				evasiveRight();
        				j++;
        			}
        		}
        		else{//odd row
        			if(!maze.moveLeft()){//hits Yabuba
        				evasiveLeft();
        				j++;
        			}
        		}
        	}//end for loop
        	maze.moveDown();
        }
        
        

        // Add code to move around maze
    }
}   