package Decorator.design.pattern;

public class Mashroom extends ToppingDecorator {

	BasePizza basePizza;

	public Mashroom(BasePizza basePizza) {
		this.basePizza = basePizza;
	}

	@Override
	public int cost() {
		return basePizza.cost() + 15;
	}

}
