//******************************************************************************************
// ImperialUnit.java
//
// Josh Radford T00745233
//
// COMP 1231 Assignment 1 Question 1
//
// This class initializes a ImperialUnit object containing a product ID, pounds, ounces, and
// volume details as an extension of Product. 
//
//******************************************************************************************

public class ImperialUnit extends Product
{
    private double pounds, ounces;

    // Default constructor for this ImperialUnit without parameters
    public ImperialUnit() {}

    // Constructor that initializes this ImperialUnit with product id, pounds, ounces, and volume parameters
    public ImperialUnit(String productID, double pounds, double ounces, double volume)
    {
        super(productID, volume);
        this.pounds = pounds;
        this.ounces = ounces;
    }

    // Coverts pounds into ounces, ounces into grams, and then invokes the parent method to calculate density
    @Override
    public void calculateDensity()
    {
        if (pounds > 0)
        {
            ounces += pounds * LB_TO_OZ;
        }
        grams = ounces * OZ_TO_G;
        super.calculateDensity();
    }

    // Mutator method for pounds
    public void setPounds(double pounds) 
    {
        this.pounds = pounds;
    }

    // Accessor method for pounds
    public double getPounds()
    {
        return pounds;
    }

    // Mutator method for ounces
    public void setOunces(double ounces)
    {
        this.ounces = ounces;
    }

    // Accessor method for ounces
    public double getOunces()
    {
        return ounces;
    }

    // Returns a description of this ImperialUnit as a String
    @Override
    public String toString()
    {
        return "ImperialUnit:   " +
               super.toString() +
               String.format("   Pounds=%.2f(lb)",pounds) +
               String.format("   Ounces=%.2f(oz)",ounces) +
               String.format("   Volume=%.2f(cubic_cm)",this.getVolume());
    }
}
