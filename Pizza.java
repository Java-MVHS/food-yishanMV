//Pizza.java
//Yishan Lin
//Period 5
//program overview and testing plan is in Food3

public class Pizza extends Food //make Pizza inherit Food
{
	
	public Pizza(String ingredientIn) //constructor for Pizza
	{
		super("baked", ingredientIn, "pizza"); //sends all of the new parameters to Food
	}
	
	public Pizza(String ingredientIn, String nameIn) //Constructor for DeepDishPizza to be able to send in parameters
	{
		super("baked", ingredientIn, nameIn); //sends all of the new parameters to Food
	}
}
		
	
