
public class Animal {
	
	private String name;
	private int topSpeed;		
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setTopSpeed(int topSpeed){
		if(topSpeed > 70 || topSpeed < 0){
			System.out.println("Invalid Speed");
		}else{
			this.topSpeed = topSpeed;
		}		
	}
	public int getTopSpeed(){
		return this.topSpeed;
	}
	
	public boolean equals(Object other){
		if (((Animal)other).getTopSpeed() >= this.topSpeed - 2 && ((Animal) other).getTopSpeed() <= this.topSpeed + 2){
			return true;
		}else{
			return false;
		}		
	}
	
	public String toString(){
		return ("Name: " + this.name + " Top Speed: " + this.topSpeed);
	}
	
	
	public Animal(String name, int topSpeed){
		setName(name);
		setTopSpeed(topSpeed);
	}
	// For the setter associated with topSpeed make sure the values are between 0 and 70
        // Print "Invalid Speed" if it is not within these values and leave
        // the speed unchanged.
	
	//create a constructor that takes in a String for the name and an int for the topSpeed
	//use only the setters initialize the instance variables


        //create an equals(Object other) method that returns True if the two Animal objects have 
	//top speeds that are within 2 mph of each other
	
	// Create a toString method
	// Formatting of the returned String should follow this example:
	// Name: elephant     Top Speed: 25
	
}
