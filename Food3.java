/* Food3.java
 * Yishan Lin
 * Period 5
  
  This program utilizes subclasses, different classes,
  and methods to print out the prices of food in a bake sale, with 
  the main method(used to input paramters and print out different foods by sending in values)
  located in FoodTester3 then from which the methods in Food3 or 
  Pizza3 (which inherits Food3) are called.
 
  Testing plan: send in different numbers to see if the revenue changes,
  test if the subclass actually inherits the methods from the parent class
*/


public class Food3
{
	protected String str;
	protected String revenue; //creates a new variable to store the string, revenue
	
	public Food3 () //default constructor
	{
		str = new String("");
		revenue = new String("");
	}
	
	public Food3 (String prepMethod, String ingredient, String name, int costIn, int amountIn) //overloaded constructor, takes in inputs
	{	
		revenue = String.format("$%.2f", (double)costIn * amountIn / 100.0); //Uses the cost and amount to calculate the revenue, stored in a string
		str = "At the sale: " + name + " " + prepMethod + " with " + ingredient
		+ " will be sold for " + costIn + " cents each. " + "With " + 
		amountIn + " " + name + "(s), " + revenue + " can be made."; //sets str as what is needed to print (str is printed in printForSale)
	}

	public void printForSale() //method used to print, inherited by subclasses too
	{
		System.out.println(str);
	}
}


