//******************************************************************************************
// Product.java
//
// Josh Radford T00745233
//
// COMP 1231 Assignment 1 Question 1
// 
// This class initializes a Product object and performs a density check for various chemical
// products manufactured by a chemical company.
//
//******************************************************************************************

public abstract class Product
{
    private String productID, densityAnalysis;
    private double volume;
    protected double grams, density;
    protected final double MIN_DENSITY = 1.25, MAX_DENSITY = 1.55, OZ_TO_G = 28.35;
    protected final int LB_TO_OZ = 16, KG_TO_G = 1000;

    // Default constructor for this Product without parameters
    public Product() {}

    // Constructor that initializes this Product with product id and volume parameters
    public Product(String productID, double volume)
    {
        this.productID = productID;
        this.volume = volume;
    }

    // Calculates the density of this object by dividing its grams by its volume
    protected void calculateDensity()
    {
        density = grams/volume;

        // Determines what category the density analysis will fall into
        if (density >= MIN_DENSITY && density <= MAX_DENSITY)
        {
            densityAnalysis = "Acceptable";
        }
        else if (density < MIN_DENSITY)
        {
            densityAnalysis = "Too thin"; 
        }
        else if (density > MAX_DENSITY) {
            densityAnalysis = "Too thick";
        }
        else
        {
            densityAnalysis = "Undetermined";
        }
    }

    // Accessor method for density analysis
    public String getDensityAnalysis()
    {
        return densityAnalysis;
    }

    // Returns a Product density 
    public double getDensity()
    {
        this.calculateDensity();
        return density;
    }

    // Mutator method for product ID
    public void setProductID(String productID)
    {
        this.productID = productID;
    }

    // Accessor method for product ID
    public String getProductID()
    {
        return productID;
    }

    // Mutator method for volume
    public void setVolume(double volume)
    {
        this.volume = volume;
    }

    // Accessor method for volume
    public double getVolume()
    {
        return volume;
    }

    // Returns a description of this Product details as a String
    public String toString()
    {
        return String.format("ID=%s",this.getProductID());
    }

    // Returns a detailed summary of the product, including its ID, volume, mass, density, and density analysis
    public String getProductSummary()
    {
        return String.format("ID=%s",productID) +
               String.format("   Volume=%.2f(cubic_cm)", volume) +
               String.format("   Mass=%.2f(g)", grams) +
               String.format("   Density=%.2f", density) +
               String.format("   Result of analysis=%s",densityAnalysis);
    }


}