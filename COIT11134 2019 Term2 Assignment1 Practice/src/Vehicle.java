// Vehicle.java
//
// COIT11134 Week 2 Tutorial
// Question 1
//

public abstract class Vehicle
{
	// instance fields
	private String model;
	private String buildYearMonth;
	private double fuelEconomy;


	// constructor
	public Vehicle(String newModel, String newYearMonth, double newFuelEcon)
	{
		model = newModel;
		buildYearMonth = newYearMonth;
		fuelEconomy = newFuelEcon;
	}


	// get and set methods
	public String getModel()
	{
		return model;
	}

	public String getBuildYearMonth()
	{
		return buildYearMonth;
	}

	public double getFuelEconomy()
	{
		return fuelEconomy;
	}

	public void setModel(String newModel)
	{
		model = newModel;
	}

	public void setBuildYearMonth(String newYearMonth)
	{
		buildYearMonth = newYearMonth;
	}

	public void setFuelEconomy(double newFuelEcon)
	{
		fuelEconomy = newFuelEcon;
	}


	// toString method
	@Override
	public String toString()
	{
		return String.format("%-15s: %s\n%-15s: %s\n%-15s: %s\n%-15s: %.2f\n",
						"Type", getClass().getName(),
						"Model", getModel(),
						"Build", getBuildYearMonth(),
						"Fuel Econ", getFuelEconomy()
						);
	}// end toString


}// end class Vehicle
