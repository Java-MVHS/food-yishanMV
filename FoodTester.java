//FoodTester.java
//Yishan Lin
//Period 5
//program overview and testing plan is in Food

public class FoodTester //main method, calls methods from Food
{
	public static void main(String[] args)
	{
		System.out.println("\n\n\n"); //three blank lines
		
		Food food1 = new Food ("baked", "banana", "muffins"); //calls constructor from Food, creates new instance of Food
		food1.printForSale();//calls method in Food that prints out the new food1 instance
		
		Food food2 = new Food ("fried", "yam", "fritters"); //calls constructor from Food, creates new instance of Food
		food2.printForSale(); //calls method in Food that prints out the new food2 instance
		
		Pizza pizza = new Pizza ("pepperoni"); //calls constructor from Pizza, creates new instance of Pizza (which inherits Food3)
		pizza.printForSale();//calls method in Pizza3, which can print out information about the new instance, pizza(printForSale() inherited from Food3)
		
		System.out.println("\n\n\n"); //three blank lines
		
	}
}
