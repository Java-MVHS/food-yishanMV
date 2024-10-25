//FoodTester3.java
//Yishan Lin
//Period 5
//program overview and testing plan is in Food3

public class FoodTester3
{
	public static void main(String[] args) //main method, calls methods from Food3
	{
		System.out.println("\n\n\n"); //three blank lines
		
		Food3 food1 = new Food3 ("baked", "banana", "muffins", 50, 12); //calls constructor from Food3, creates new instance of Food3
		food1.printForSale(); //calls method in Food3 that prints out the new food1 instance
		
		Food3 food2 = new Food3 ("fried", "yam", "fritters", 100, 3); //calls constructor from Food3, creates new instance of Food3
		food2.printForSale(); //calls method in Food3 that prints out the new food2 instance
		
		Pizza3 pizza = new Pizza3 ("pepperoni", 250, 8); //calls constructor from Pizza3, creates new instance of Pizza3 (which inherits Food3)
		pizza.printForSale(); //calls method in Pizza3, which can print out information about the new instance, pizza(printForSale() inherited from Food3)
		
		System.out.println("\n\n\n"); //three blank lines
	}
}
