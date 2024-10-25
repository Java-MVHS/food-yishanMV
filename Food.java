/* Food.java
 * Yishan Lin
 * Period 5
  
  This program utilizes subclasses, different classes,
  and methods to print out the prices of food in a bake sale, with 
  the main method(used to input paramters and print out different foods by sending in values)
  located in FoodTester then from which the methods in Food or 
  Pizza (which inherits Food) are called.
 
  Testing plan: send in different numbers to see if the revenue changes,
  test if the subclass actually inherits the methods from the parent class
*/


public class Food
{
	protected String str;
	
	public Food () //default constructor
	{
		str = new String("");
	}
	
	public Food (String prepMethod, String ingredient, String name) //overloaded constructor that accepts inputs
	{	
		str = "At the sale: " + name + " " + prepMethod + " with " + ingredient; //sets str to what is needed to be printed
	}

	public void printForSale() //method used to print, inherited by subclasses too
	{
		System.out.println(str); //prints out str
	}
}


