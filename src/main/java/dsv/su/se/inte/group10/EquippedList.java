//package dsv.su.se.inte.group10;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class EquippedList {
//
//public ArrayList<ItemEquippable> equipmentList;
//	
//	protected EquippedList() {
//		equipmentList = new ArrayList();
//	}
//	
//	public void equipItem(ItemEquippable item, Backpack bp) {
//		ItemEquippable temp = null;
//		for(ItemEquippable i: equipmentList) {
//			if(i.getEquipmentType().equals(item.getEquipmentType()));
//				temp = i;
//		}
//		equipmentList.add(item);
//		bp.removeItem(item);
//		if (temp!=null) {
//			unequipItem(temp, bp);
//		}
//	}
//	
//	public void unequipItem(Item item, Backpack bp) {
//		equipmentList.remove(item);
//		bp.addItem(item);
//	}
//	
//	public ArrayList<Item> getItems(){
//		return new ArrayList<Item>(equipmentList);
//	}
//	
//}
