import java.util.*;
public class SpellBook {

	private ArrayList<Spell> spells = new ArrayList();
	  
	  public void addSpell(Spell s){
	  	spells.add(s);
	  }
	  
	  
	  public void removeSpell(int a) {
		  spells.remove(a - 1);
	  }
	  
	  
	  public void printSpells() {
		  System.out.println("Here are your spells: ");
		  spells.forEach(s -> {
			  System.out.println(spells.indexOf(s) +1 + ". " + s.getClass().getName());
		  });
	  }
	  
	  public void printSpellsC() {
		  System.out.println("Here are your choices: ");
		  spells.forEach(s -> {
			  System.out.println(spells.indexOf(s) +1 + ". " + s.getClass().getName());
		  });
	  }
	  
	  public ArrayList<Spell> getSpells(){//It's a behaviour
		  return spells;  
	  }
	  
	  public Spell getSpellFromId(int id) {
		  return this.spells.get(id - 1);
	  }
	}
