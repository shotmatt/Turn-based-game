import java.util.ArrayList;

public class Creatures {

	
	String name;
	int totalMana;
	int totalHp;
	
	
	private ArrayList<Creatures> creatures = new ArrayList();
	  
	  public void addCreature(Creatures c){
	  	creatures.add(c);
	  }
	  
	  public void printCreatures() {
		  creatures.forEach(s -> {
			  System.out.println(creatures.indexOf(s) +1 + ". " + s.getClass().getName());
		  });
	  }
	  public ArrayList<Creatures> getCreatures(){//It's a behaviour
		  return creatures;  
	  }
	  
	  public Creatures getCreaturesFromId(int id) {
		  return this.creatures.get(id - 1);
	  }
}
