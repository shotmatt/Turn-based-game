import java.util.ArrayList;

public class equipableItem {

	int totalHp;
	private ArrayList<equipableItem> EquipableItems = new ArrayList();
	
	public void addEQ(equipableItem c){
	  	EquipableItems.add(c);
	  }
	
	  public void printEquipableItems() {
		  EquipableItems.forEach(s -> {
			  System.out.println(EquipableItems.indexOf(s) +1 + ". " + s.getClass().getName());
		  });
	  }
	  public ArrayList<equipableItem> getEquipableItems(){//It's a behaviour
		  return EquipableItems;  
	  }
	  
	  public equipableItem getItemsFromId(int id) {
		  return this.EquipableItems.get(id - 1);
	  }
}
