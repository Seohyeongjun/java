package java_0717_1;

public class FruitBox<T extends Fruit> {

	private T fruit;
//	private Banana fruit1;
	
	public void setFruit(T fruit)
	{
		this.fruit=fruit;
	}
	
	public T getFruit()
	{
		return this.fruit;
	}
	
//	public void setFruit(Banana fruit)
//	{
//		this.fruit1=fruit;
//	}
	
}
