package Decorator.design.pattern;

public class Test {

	public static void main(String[] args) {
		BasePizza pizza = new ExtraCheese(new Mashroom(new ExtraCheese(new FormHouse())));
		System.out.println("Cost of pizza is: " + pizza.cost());
		
	}
}
