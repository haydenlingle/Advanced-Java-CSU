public class Species {	
	
	public String speciesName;
	public int speciesPopulation, speciesGrowthRate;
	
    public Species(String name, int population, int growthRate){
    	this.speciesName = name;
    	
    	if(population < 1){
    		this.speciesPopulation = 1;
    	}else if(population > 1500){
    		this.speciesPopulation = 1500;
    	}else{
    		this.speciesPopulation = population;
    	}
    	
    	if(growthRate < 1){
    		this.speciesGrowthRate = 1;
    	}else if(growthRate > 20){
    		this.speciesGrowthRate = 20;
    	}else{
    		this.speciesGrowthRate = growthRate;
    	}
    	
    }
    
    // mergeSpecies adds the populations of the two species, changes the name
    // of the species to the concatenation of the two names, and the growth
    // rate to the maximum of the two growth rates.

    public void mergeSpecies(Species other) {
        String newName = this.speciesName + other.speciesName;
        int newPop = other.speciesPopulation + this.speciesPopulation;
        int newGrowth = Math.max(other.speciesGrowthRate, this.speciesGrowthRate);
        
        System.out.println("New name: " + newName);
        System.out.println("New population: " + newPop);
        System.out.println("New growth rate: " + newGrowth);
        
    }

    public String toString(){
        return ("Name of species: " + this.speciesName + "\nPopulation: " + this.speciesPopulation + "\nGrowth Rate: " + this.speciesGrowthRate + "%");
    }

    // Increases the population according to the growth rate of the species, i.e.
    // updates the population instance variable by adding to it the growth rate/100 times the current population.

    public void grow() {
        this.speciesPopulation += (this.speciesGrowthRate/100.0 * this.speciesPopulation);
        System.out.println("New population: " + this.speciesPopulation);
    }

    // Returns the population of the species in x years according to its growth rate.

    public int populationInXYears(int x){
    	double newTotal = (double)this.speciesPopulation;
    	double smallPercent = (double)this.speciesGrowthRate / 100.0;
    	double multiplyNumber = smallPercent + 1.0;
    	for(int i = 0; i < x; i++){
    		newTotal *= multiplyNumber;
    	}
        return (int)newTotal;
    }

    public static void main(String[] args) {

        // Put simple code here to test the Species class.  It is always a good idea to include
        // a main method in any class you define.

        Species a = new Species("Frog", 100, 10);
        System.out.println(a);

        a.grow();
        System.out.println(a);

        System.out.println("a.populationInXYears(10) returns " + a.populationInXYears(10));

        Species b = new Species("Rabbit", 10, 23);
        a.mergeSpecies(b);
        System.out.println("a.mergeSpecies(b) is " + a);
        
    }
}
