// CoffeeDrink object class

class CoffeeDrink {

   private int numberOfCups;
   private String flavor;
   private boolean hasWhippedCream;

    // Constructor for CoffeeDrink class
    public CoffeeDrink(int numberOfCups, String flavor, boolean hasWhippedCream) {
        // TODO
        // Edit this constructor to accept three parameters,
        // one for each CoffeeDrink variable.
        // Assign those parameter values to the class-wide variables.
        this.numberOfCups = numberOfCups;
        this.flavor = flavor;
        // java defaults to the variable with the smallest scope
        this.hasWhippedCream = hasWhippedCream;
    }

    // Method to print information about the CoffeeDrink
    public void printInfo() {
        // TODO
        // Make this method print order details.
        // Include information stored in each variable.
        System.out.print("You ordered " + numberOfCups + " of " + flavor +
                " coffee ");
        if (hasWhippedCream) {
            System.out.println("with whipped cream.");
        } else {
            System.out.println("without whipped cream.");
        }

    }

    public int getNumberOfCups() {
        return numberOfCups;
    }
    public void setNumberOfCups(int numberOfCups) {
        this.numberOfCups = numberOfCups;
    }

    // Getter and setter for flavor
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String newFlavor) {
        this.flavor = newFlavor;
    }

    // Getter and setter for hasWhippedCream
    public boolean getHasWhippedCream() {
        return hasWhippedCream;
    }

    public void setHasWhippedCream(boolean hasWhippedCream) {
        this.hasWhippedCream = hasWhippedCream;
    }
}
