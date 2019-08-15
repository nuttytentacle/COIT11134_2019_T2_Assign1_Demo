// Truck.java
//
// COIT11134 Week 2 Tutorial
// Question 1
//

public class Truck extends Vehicle
{
	// instance fields
	private double tonnage;


	// constructor
	public Truck(String newModel, String newYearMonth, double newFuelEcon, double newTonnage)
	{
		super(newModel, newYearMonth, newFuelEcon);
		tonnage = newTonnage;
	}


	// get and set methods
	public double getTonnage()
	{
		return tonnage;
	}

	public void setTonnage(double newTonnage)
	{
		tonnage = newTonnage;
	}


	// toString method
	@Override
	public String toString()
	{
		return super.toString() +
					String.format("%-15s: %.2f\n",
						"Tonnage", getTonnage()
						);
	}// end toString


}// end class Truck