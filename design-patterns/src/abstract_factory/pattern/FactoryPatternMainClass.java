package abstract_factory.pattern;

import java.util.Optional;

public class FactoryPatternMainClass {
	
	AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession(true);
	Profession engg=abstractFactory.getProfession("Engineer");
	
	
}