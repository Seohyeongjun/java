package FactoryMethod;

import chickenType.ChickenType;
import recipe.Fried;
import recipe.Garlic;
import recipe.Making;
import recipe.SoySauce;

public class ChainChicken extends MainChicken {

	public Making create(ChickenType type) {		
		switch(type) {
			case Fried : return new Fried();
			case Garlic : return new Garlic();
			case SoySauce : return new SoySauce();
		}
		return null;		
	}
	
	public String getChainName() {
		return "DW≈Î¥ﬂ º±»≠¡°";		
	}
	
}