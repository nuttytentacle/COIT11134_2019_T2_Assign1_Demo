// Car.java
//
// COIT11134 Week 2 Tutorial
// Question 1
//

public class Car extends Vehicle
{
	// instance fields
	private int maxPassengers;


	// constructor
	public Car(String newModel, String newYearMonth, double newFuelEcon, int newMaxPassengers)
	{
		super(newModel, newYearMonth, newFuelEcon);	// passing the required arguments to Vehicle's constructor
		maxPassengers = newMaxPassengers;
	}


	// get and set methods
	public int getMaxPassengers()
	{
		return maxPassengers;
	}

	public void setMaxPassengers(int newMaxPassengers)
	{
		maxPassengers = newMaxPassengers;
	}


	// toString method
	@Override
	public String toString()
	{
		return super.toString() +
					String.format("%-15s: %d\n",
						"Max Passengers", getMaxPassengers()
						);
	}// end toString


}// end class Car