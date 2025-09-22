package factorypattern;

public class Main {

	public static void main(String[] args) {
		ShapeFactory sf=new ShapeFactory();
		Shape sp=sf.getObjectInstance("Square");
		sp.draw();
	}

}
