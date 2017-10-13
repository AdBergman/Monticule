package dsv.su.se.inte.group10;

import java.util.ArrayList;
import java.util.Arrays;

public class ItemWithStat extends Item {
	
	private ArrayList<Stat> statList;
	
	public ItemWithStat(String name, Stat... stats) {
		super(name);
		statList = new ArrayList<Stat>();
		statList.addAll(Arrays.asList(stats));
	}
	
	public ItemWithStat(String name, int weight, int value, Stat...stats) {
		super(name, weight, value);
		statList = new ArrayList<Stat>();
		statList.addAll(Arrays.asList(stats));
	}
	
	public ArrayList<Stat> getStats(){
		return new ArrayList<Stat>(statList);
	}

}
