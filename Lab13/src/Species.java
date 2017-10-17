public class Species {	
	
	private String speciesName;
	private int speciesPopulation, speciesGrowthRate;
	
    public Species(String name, int population, int growthRate){
    	speciesName = name;
    	speciesPopulation = population;
    	speciesGrowthRate = growthRate;
    }
	// Put the instance variable here.

    // ....

    // Create a Species constructor that takes in a String for its name, an int for
    // its population, and an int for its growth rate per year as a percent.

    // ....
    
    // mergeSpecies adds the populations of the two species, changes the name
    // of the species to the concatenation of the two names, and the growth
    // rate to the maximum of the two growth rates.

    public void mergeSpecies(Species other) {
        
    	// ....
        System.out.println("mergeSpecies NOT IMPLEMENTED YET");
    }

    public String toString(){
        // ....
        System.out.println("toString NOT IMPLEMENTED YET");
        return "";
    }

    // Increases the population according to the growth rate of the species, i.e.
    // updates the population instance variable by adding to it the growth rate/100 times the current population.

    public void grow() {
        // ....
        System.out.println("grow NOT IMPLEMENTED YET");
    }

    // Returns the population of the species in x years according to its growth rate.

    public int populationInXYears(int x){
        // ....
        System.out.println("getPoplulationInXYears NOT IMPLEMENTED YET");
        return 1;
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
