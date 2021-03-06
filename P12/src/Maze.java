import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//P12 Assignment
//Author: Hayden Lingle
//Date: Nov 26, 2017
//Class: CS164
//Email: hlingle@rams.colostate.edu
public class Maze implements IMaze{
	
	int mazeHeight = 0;
	int mazeWidth = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = args[0];
		Maze testClass = new Maze();
		
		char[][] mazeArray = testClass.readFile(filename);
		//System.out.println(Arrays.deepToString(mazeArray));
		int[] startPosition = testClass.findStart(mazeArray);
		
		System.out.println(testClass.findPath(mazeArray, startPosition));
		//System.out.println(Arrays.deepToString(mazeArray));
		

	}

	@Override
	public char[][] readFile(String filename) {
		
		/* Precondition - filename set to file containing map of the maze.
		 * Postcondition - two dimensional char array holding a map of the maze
		 * Postcondition - returns null if file not found
		 */
		
		try {
			File file = new File(filename);
			if(!file.exists()){//#1
				return null;
			}
			
			
			Scanner scan = new Scanner(file);//#2
			
			String firstLine = scan.nextLine();//Read first line in
			Scanner firstLineScan = new Scanner(firstLine);//put first line into scanner
			mazeHeight = firstLineScan.nextInt();//set height
			mazeWidth = firstLineScan.nextInt();//set width
			
			char[][] newArray = new char[mazeHeight][mazeWidth];
			
			int heightCounter = 0;
			
			while (scan.hasNextLine()) {//2nd line and beyond
				String line = scan.nextLine();
				Scanner lineScan = new Scanner(line);
				
				for(int i = 0; i < mazeWidth; i++){
					lineScan.useDelimiter("");
					char newChar = lineScan.next().charAt(0);
					newArray[heightCounter][i] = newChar;
				}
				//System.out.println("Finished line: " + heightCounter);
				heightCounter++;
			}//end while
			return newArray;
		} catch (IOException e) {
			System.out.println("Unable to open file");
			System.exit(-1);
		}
		return null;
	}

	@Override
	public int[] findStart(char[][] maze) {
		for(int i = 0; i < maze.length; i++){
			for(int j = 0; j < maze[i].length; j++){
				if(maze[i][j] == 'S'){
					int[] returnArray = {i, j};
					return returnArray;
				}
			}
		}
		return null;
	}
	private String recPath(char[][] maze, int r, int c){
    
		if(r > maze.length - 1 || r < 0 || c < 0 || c > mazeWidth){
			return "";
		}else if(maze[r][c] == '#' || maze[r][c] == '.'){
			return "";
		}else if(maze[r][c] == 'G'){
			//System.out.println("FOUND G");
			return "G";
		}else{
			
			maze[r][c] = '.';
			
			String newStr1 = recPath(maze, r-1, c);
			if(newStr1 != ""){				
				return "U" + newStr1;				
			}
			
			String newStr2 = recPath(maze, r, c+1);			
			if( newStr2 != ""){				
				//System.out.println("R");
				return "R" + newStr2;
			}
			
			String newStr3 = recPath(maze, r+1, c);
			if( newStr3 != ""){				
				//System.out.println("D");
				return "D" + newStr3;
			}
			
			String newStr = recPath(maze, r, c-1);
			if(newStr != ""){
				//System.out.println("L");
				return "L" + newStr;
			}
			
			//System.out.println("testing");
			maze[r][c] = ' ';
			return "";
//			
//			Try to find a path to the goal from position (row-1,col). If found, add 'U' to the returned path and return it.
//			Try to find a path to the goal from position (row,col+1). If found, add 'R' to the returned path and return it.
//			Try to find a path to the goal from position (row+1,col). If found, add 'D' to the returned path and return it.
//			Try to find a path to the goal from position (row,col-1). If found, add 'L' to the returned path and return it.
//			If you reach here, no path to the goal from (row,col) was found. Remove the mark '.' at map position (row,col), by replacing with a blank, and return "".
		}
		
	/*
     * Precondition - maze array initialized to a valid maze
     * Postcondition - returns the path from the location r,c to the goal
     * Postcondition - '.' set from location r,c in the maze to the goal
     * Requirement - Implemented as a recursive method that finds a path
     *               from position (row,col) to the goal position,
     *               marked by 'G'
     */
	}

	@Override
	public String findPath(char[][] maze, int[] startPosition) {
		String newString = recPath(maze, startPosition[0], startPosition[1]);
		maze[startPosition[0]][startPosition[1]] = 'S';
		
		return newString;
	}

	@Override
	public String printMaze(char[][] maze) {
		String finalString = "";
		for(int i = 0; i < maze.length; i++){
			for(int j = 0; j < maze[i].length; j++){
				finalString += maze[i][j];
			}
			finalString += "\n";
		}
		return finalString;
	}

}
