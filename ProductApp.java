//******************************************************************************************
// ProductApp.java
//
// Josh Radford T00745233
//
// COMP 1231 Assignment 1 Question 1
//
// A driver class that creates an array of ImperialUnit & MetricUnit Product and calculates
// each Product density. Prints a summary of each Product containing its ID, volume,
// density, and results analysis.
//
//******************************************************************************************

public class ProductApp
{
  public static void main(String[] args)
  {
    // Create an array of size 6 to store Metric and Imperial Objects
    Product[] productList = new Product[6];

    // Create and initialize three ImperialUnit objects with 4 parameters
    productList[0] = new ImperialUnit("A1122", 1.0, 4.0, 603.33);
    productList[1] = new ImperialUnit("B2468", 2.0, 0.0, 400.0);
    productList[2] = new ImperialUnit("C1234", 1.0, 3.0, 398.87);

    // Create and initialize three MetricUnit objects with 3 parameters
    productList[3] = new MetricUnit("X2345", 0.55, 411.0);
    productList[4] = new MetricUnit("Y6213", 0.90, 498.0);
    productList[5] = new MetricUnit("Z1098", 0.25, 234.50);

    // Prints out each Product details in the ProductList (ID, Volume, Mass, Density, Results Analysis)
    for (Product product : productList) {
      product.calculateDensity();
      System.out.println(product.getProductSummary());
    }
  }  
}
