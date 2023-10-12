//******************************************************************************************
// MetricUnit.java
//
// Josh Radford T00745233
//
// COMP 1231 Assignment 1 Question 1
//
// This class initializes a MetricUnit object containing a product ID, kilograms, and volume
// details as an extension of Product. 
//
//******************************************************************************************

public class MetricUnit extends Product
{

    private double kilograms;

    // Default constructor for this MetricUnit without parameters
    public MetricUnit() {}

    // Constructor that initializes this MetricUnit with product id, kilograms, and volume parameters
    public MetricUnit(String productID, double kilograms, double volume)
    {
        super(productID, volume);
        this.kilograms = kilograms;
    }

    // Accessor method for kilograms
    public double getKilograms() 
    {
        return kilograms;
    }

    // Mutator method for kilograms
    public void setKilograms(double kilograms) 
    {
        this.kilograms = kilograms;
    }

    // Coverts kilograms into grams and then invokes its parent method to calculate its density in cubic centimeters
    @Override
    public void calculateDensity()
    {
        grams = kilograms * KG_TO_G;
        super.calculateDensity();
    }

    // Returns a description of this MetricUnit as a String
    @Override
    public String toString()
    {
        return "MetricUnit:   " +
               super.toString() +
               String.format("   Kilograms=%.2f(kg)",kilograms) +
               String.format("   Volume=%.2f(cubic_cm)",this.getVolume());
    }
    


}
