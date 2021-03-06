import java.awt.Component;
import java.util.ArrayList;
import java.util.Arrays;

//P8 Assignment
//Author: Hayden Lingle
//Date: Oct 19, 2017
//Class: CS164
//Email: hlingle@rams.colostate.edu

public class Cloud {
	private ArrayList<Point> points;	
    private boolean debug = false;
	

	/**
	 * Given Constructor
	 */
	public Cloud(){
		points = new ArrayList<Point>();
	}

	public void setDebug(Boolean debug){
		this.debug = debug;	
	}
	

	//TODO Implement Cloud.isEmpty
	/**
	 * @return whether cloud is empty or not
	 */
	public boolean isEmpty(){
		if(points.isEmpty()){
			return true;
		}else{
			return false;
		}
	}


	//TODO Implement Cloud.size
	/**
	 * @return number of points in the cloud
	 */
	public int size(){
		return points.size();
	}

	
	//TODO Implement Cloud.hasPoint
	/**
	 * 
	 * @param p a Point
	 * @return whether p in the cloud
	 */
	public boolean hasPoint(Point p){
		for(int i = 0; i < points.size(); i++){
			if(p.equals(points.get(i))){
				return true;
			}
		}
		return false;
	}

	//TODO Implement Cloud.addPoint
	/**
	 * 
	 * @param p
	 * if p not in points, add p ***at the end*** of points (to keep same order)

	 */
	public void addPoint(Point p){
		int i;
		for(i = 0; i < points.size(); i++){
			if(p.equals(points.get(i))){
				return;
			}
		}
		points.add(p);
	}

	//Given Cloud.toString
	public String toString(){
		return points.toString();
	}

	//TODO Implement Cloud.extremes
	/**
	 * 
	 * @return an array of doubles: left, right, top, and bottom of points, 
	 *         null for empty cloud
	 */
	public double[] extremes(){
		if(points.isEmpty()){
			return null;
		}else{
			Point lowestX = new Point(Double.MAX_VALUE, 0);
			Point highestX = new Point(Double.MIN_VALUE, 0);
			Point lowestY = new Point(0, Double.MAX_VALUE);
			Point highestY = new Point(0, Double.MIN_VALUE);
			
			for(int i = 0; i < points.size(); i++){
				if(points.get(i).getX() < lowestX.getX()){
					lowestX = points.get(i);
				}
				
				if(points.get(i).getX() > highestX.getX()){
					highestX = points.get(i);
				}
				
				if(points.get(i).getY() < lowestY.getY()){
					lowestY = points.get(i);
				}
				
				if(points.get(i).getY() > highestY.getY()){
					highestY = points.get(i);
				}				
				
			}//end for
			
			double[] newArray = {lowestX.getX(), highestX.getX(), highestY.getY(), lowestY.getY()};
			return newArray;
			
		}//end else
	}//end extremes
	
	//TODO Implement Cloud.centerP
	/**
	 * 
	 * @return: if (cloud not empty) create and return the center point
	 *          else null;
	 */
	public Point centerP(){
		if(points.isEmpty()){
			return null;
		}else{
			double avgX = 0.0, avgY = 0.0;
			for(int i = 0; i < points.size(); i++){
				avgX += points.get(i).getX();
				avgY += points.get(i).getY();
			}
			avgX /= points.size();
			avgY /= points.size();
			Point newPoint = new Point(avgX, avgY);
			return newPoint;
		}
	}


	//TODO Implement Cloud.minDist
	/**
	 * 
	 * @return minimal distance between 2 points in the cloud
	 *         0.0 for a cloud with less than 2 points
	 */
	public double minDist(){
		if(points.isEmpty() || points.size() == 1){
			return 0.0;
		}else{
			double minDistance = Double.MAX_VALUE;
			double testDistance = -1.0;
			for(int i = 0; i < points.size(); i++){
				for(int j = 0; j < points.size(); j++){
					testDistance = points.get(i).euclidDist(points.get(j));
					if(testDistance != 0.0 && testDistance < minDistance){//add epsilon
						minDistance = testDistance;
					}
				}//end inside for
			}//end outside for
			return minDistance;
		}//end else
	}

	//TODO Implement Cloud.crop
	/**
	 * 
	 * @param p1 
	 * @param p2
	 * 
	 * all Points outside the rectangle, line or point spanned
	 * by p1 and p2 are removed
	 *  
	 */
	public void crop(Point p1, Point p2){
		double maxX, minX, maxY, minY;
		maxX = (p1.getX() >= p2.getX()) ? p1.getX() : p2.getX();
		minX = (p1.getX() <= p2.getX()) ? p1.getX() : p2.getX();
		
		maxY = (p1.getY() >= p2.getY()) ? p1.getY() : p2.getY();
		minY = (p1.getY() <= p2.getY()) ? p1.getY() : p2.getY();
		
		//System.out.println("Min X: " + minX + ", Max X: " + maxX + ", Min Y: " + minY + ", Max Y: " + maxY);
		
		for(int i = points.size() - 1; i >= 0; i--){
			if(points.get(i).getX() > maxX || points.get(i).getX() < minX || points.get(i).getY() > maxY || points.get(i).getY() < minY){
				points.remove(i);
			}
		}//end for
		
 	}//end crop
 
	

	/**
	 * @param args:no args
	 */
	public static void main(String[] args) {

		Cloud cloud = new Cloud();
		
		cloud.setDebug(false);
		System.out.println("cloud.debug OFF");
		System.out.println("cloud: " + cloud);
		
		if(!cloud.isEmpty())
			System.out.println("Error: cloud should be empty!");
		
		if(cloud.extremes()!=null)
			System.out.println("Error: extremes should be null!");
		
		if(cloud.minDist()!=0.0)
			System.out.println("Error: minDist should return 0.0!");

			
		Point p31 = new Point(3.0,1.0);
		cloud.addPoint(p31);
		
		Point p22 = new Point(2.0,2.0);
		cloud.addPoint(p22);
			
		Point p42 = new Point(4.0,2.0);
		cloud.addPoint(p42);
		
		Point p33 = new Point(3.0,3.0);
		cloud.addPoint(p33);

		System.out.println("cloud 1: " + cloud);
		
		System.out.println("center point in cloud: " + cloud.centerP());

		System.out.println("cloud: " + cloud);
		System.out.println("cloud 2: " + cloud);
		

		Point p77 = new Point(7,7);
		if (cloud.hasPoint(p77))
			System.out.println("Error: point " + p77 + " should not be in cloud!");
		else
			System.out.println("OK: point " + p77 + " is not in cloud");

		double[] extrs = cloud.extremes();
		if(extrs!=null){
			System.out.println("left: " + extrs[0]);
		    System.out.println("right: " + extrs[1]);
		    System.out.println("top: " + extrs[2]);
		    System.out.println("bottom: " + extrs[3]);
		}
		double minD = cloud.minDist();			
		System.out.printf("min dist in cloud: %5.3f \n", minD);				
		
		System.out.println("Test cloud with 1 point");
		Cloud cloud1 = new Cloud();
		Point p = new Point();
		cloud1.addPoint(p);
	    minD = cloud1.minDist();
		System.out.printf("min dist in cloud1: %5.3f \n",  minD);
		
		System.out.println("_____________CUSTOM TESTING_____________");
		cloud.crop(p42, p33);
		System.out.println(cloud.toString());

	}

}
