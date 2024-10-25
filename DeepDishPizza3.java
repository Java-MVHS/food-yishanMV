//DeepDishPizza3.java
//Yishan Lin
//Period 5
//program overview and testing plan is in Food3

public class DeepDishPizza3 extends Pizza3 //make DeepDishPizza3 inherit Pizza3
{
	public DeepDishPizza3(String ingredientIn, int costIn, int amountIn) // constructor, to send in values to Pizza3
	{
		super(ingredientIn, "deep dish pizza", costIn, amountIn); //need name input so that you can send a new name to Pizza3.java
	}
}
