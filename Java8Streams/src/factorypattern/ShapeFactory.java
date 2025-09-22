package factorypattern;

public class ShapeFactory {
	public Shape getObjectInstance(String shape) {
		if(shape.equals("Circle")) {
			return new Circle();
		}else if(shape.equals("Rectangle")) {
			return new Rectangle();
		}else if( shape.equals("Square")) {
			return new Square();
		}
		return null;
	}
}
