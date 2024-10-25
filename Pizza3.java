//Pizza3.java
//Yishan Lin
//Period 5
//program overview and testing plan is in Food3

public class Pizza3 extends Food3 //make Pizza3 inherit Food3
{
	
	public Pizza3(String ingredientIn, int costIn, int amountIn) //constructor for Pizza3
	{
		super("baked", ingredientIn, "pizza", costIn, amountIn); //sends all of the new parameters to Food3
	}
	
	public Pizza3(String ingredientIn, String nameIn, int costIn, int amountIn) //Constructor for DeepDishPizza3 to be able to send in parameters
	{
		super("baked", ingredientIn, nameIn, costIn, amountIn); //sends all of the new parameters to Food3
	}
}
		
	
