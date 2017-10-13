package dsv.su.se.inte.group10;

public class ItemConsumable extends ItemWithStat {
	
	private int duration; // Use zero (0) for instant use.
	
	public ItemConsumable(String name, Stat... stats) {
		super(name, stats);
		this.duration = 0;
	}

	public ItemConsumable(String name, int weight, int value, Stat... stats) {
		this(name, weight, value, 0, stats);
	}
	
	public ItemConsumable(String name, int weight, int value, int duration, Stat... stats) {
		super(name, weight, value, stats);
		this.duration = duration;
	}
	
	public int getDuration() {
		return this.duration;
	}
	
}