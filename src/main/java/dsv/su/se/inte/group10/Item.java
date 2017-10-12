package dsv.su.se.inte.group10;

public /* abstract */ class Item {
	
	private int weight;
	private int value;

	public Item() {
		this(0, 0);
	}
	
	public Item(int weight, int value) {
		if(weight < 0 || value < 0) {
			throw new IllegalArgumentException();
		}
		this.weight = weight;
		this.value = value;
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
