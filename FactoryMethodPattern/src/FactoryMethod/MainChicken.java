package FactoryMethod;
import chickenType.ChickenType;
import recipe.Making;

public abstract class MainChicken {

	public abstract Making create(ChickenType type);
	public abstract String getChainName();
	
}
