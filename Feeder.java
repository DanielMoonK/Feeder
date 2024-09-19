public class Feeder {

    /**
     * The amount of food, in grams, currently in the bird feeder; initialized
     * in the constructor and always greater than or equal to zero
     */
    private int currentFood;

    /**
     * Simulates one day with numBirds birds or possibly a bear at the bird
     * feeder, as described in part (a) Precondition: numBirds > 0
     */
    public void simulateOneDay(int numBirds)
    {
        int amountOfFood = (int) ((Math.random() * 40) + 10);
        System.out.println("Birds will eat " + amountOfFood + " grams of food today.");
        double chance = Math.random();
        if (chance < 0.05){
            currentFood = 0;
            System.out.println("A bear has eaten the food! There is no food left.");
        }
        else{
            currentFood = currentFood - (amountOfFood * numBirds);
            if (currentFood < 0){
                currentFood = 0;
            }
            System.out.println("There are " + currentFood + " grams of food left.");
        }
    }

    /**
     * Returns the number of days birds or a bear found food to eat at the
     * feeder in this simulation, as described in part (b) Preconditions:
     * numBirds > 0, numDays > 0
     */
    public int simulateManyDays(int numBirds, int numDays) 
    {
        int countDays = 0;
        for (int days = 0; days < numDays; days++){
            if (currentFood > 0){
                System.out.println("Day " + (days + 1) + ": ");
                simulateOneDay(numBirds);
                System.out.println();
                countDays++;
            }
        }
        return countDays;
    }

    public int getCurrentFood()
    {
        return currentFood;
    }

    public Feeder () {}
    
    public Feeder(int c)
    {
        currentFood = c;
    }
}