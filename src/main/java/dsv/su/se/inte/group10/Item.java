package dsv.su.se.inte.group10;

public /* abstract */ class Item {
	
	private int weight;
	private int value;
	private String name;

	public Item(String name) {
		this(name, 0, 0);
	}
	
	public Item(String name, int weight, int value) {
		if(weight < 0 || value < 0) {
			throw new IllegalArgumentException("Weight and value must be greater than zero (0).");
		}
		if(name.length() < 1 || name.length() > 64) {
			throw new IllegalArgumentException("Name must be between 1 and 64 characters long.");
		}
		if(name.contains(".")) {
			throw new IllegalArgumentException("Illegal character in name.");
		}
		this.weight = weight;
		this.value = value;
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

    public int getWeight(){
        return this.weight;
    }

    public int getValue(){
        return this.value;
    }
    
    public void setWeight(int weight) {
    	if(weight < 0) {
    		throw new IllegalArgumentException("Argument cannot be lower than zero (0).");
    	}
    	this.weight = weight;
    }
    
    public void setValue(int value) {
    	if(value < 0) {
    		throw new IllegalArgumentException("Argument cannot be lower than zero (0).");
    	}
    	this.value = value;
    }
    
}
