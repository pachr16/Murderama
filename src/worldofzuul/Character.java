package worldofzuul;

public class Character {
	
	private String name;
	private int hp;
	private Item[] inventory;
	private int dmg;
	
	Character() {
		this.name = "Player";
		this.hp = 100;
		this.inventory = new Item[10];
		this.dmg = 11;
	}
	
	Character(String name, int hp, int inventory) {
		this.name = name;
		this.hp = hp;
		this.inventory = new Item[inventory];
	}
	
	public void setHp(int damageTaken) 
    {
    	this.hp = hp - damageTaken;
    }
	
	public void useItem(int numberInInventory) {
		Item item = inventory[numberInInventory];
		if(item.getName() == "Potion") {
			this.dmg = dmg + item.getEffect();
			System.out.println("You have gained " + item.getEffect() + " damage, putting you at " + dmg);
			inventory[numberInInventory] = null;
		} else {
			System.out.println("Does not work");
		}
	}
    
    public int getHp() {
        return hp;
    }
    
    
    public String getName() {
        return name;
    }
    
    
    public void lootItem(Item item) {
    	if(! isInventoryFull()){
    		for(int i = 0; i<inventory.length; i++) {
    			if(inventory[i] == null) {
    				inventory[i] = item;
    				System.out.println(item.getName() + " has been added to inventory.");
    				break;
    			}
    		}
    	} else {
    		System.out.println("Inventory is full");
    	}
    	
    }
    public boolean isInventoryFull() {
    	for(int i = 0; i<inventory.length; i++) {
    		if(inventory[i] == null) {
    			return false;
    		}
    	}
    	return true;
    }
    
    public void showInventory() {
    	for(int i = 0; i < inventory.length; i++) {
    		if(inventory[i] != null) {
    			System.out.println(inventory[i].getName());
    		}
    	}
    }
    
    
    //Mangler throws, returner 0 i stedet for error
    public int getItemFromInventory(int spaceInInventory) {
		if(inventory[spaceInInventory] != null) {
			return spaceInInventory;
		} 
		System.out.println("No item in that space");
		return 0;
    }
    
    public void attack(Monster monster) {
        monster.setHp(this.dmg);
    }
    
//    public void healCharacter(int heal) {
//    	this.hp = hp + heal;
//    }

}
