package worldofzuul;

public class Item {
	
	private String name;
	private int effect;
	
	Item(String _name, int effect) {
		this.name = _name;	
		this.effect = effect;
	}
	
	public String getName() {
		return name;
	}
	
	public int getEffect() {
		return this.effect;
	}

}
