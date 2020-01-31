import java.util.*;
public class Game {
	

	public static void main (String[] args){
		Scanner inp = new Scanner(System.in);
		String Dname = "Smaug";
		String Oname = "torken";
		String Tar = "nothing";
		int loop = 1;

		Void v = new Void();
		Fireball fb = new Fireball();
	    Repair r = new Repair();
	    Healing h = new Healing();
	    SpellBook sb = new SpellBook();
	    SpellBook Tsb = new SpellBook();
	    equipableItem EI = new equipableItem();
	    Creatures cl = new Creatures();
	    Locations Lo = new Locations();
	    System.out.println("Name your wizard: ");
		String Wname = inp.nextLine();
		wizard pc = new wizard(Wname, sb);
		Dragon bs = new Dragon(Dname);
		Orc oc = new Orc(Oname);
		Shield sh = new Shield();
		Sword sw = new Sword();
		Axe ax = new Axe();
		cl.addCreature(pc);
		cl.addCreature(bs);
		cl.addCreature(oc);
		EI.addEQ(sh);
		EI.addEQ(sw);
		EI.addEQ(ax);
		
		Util.Sep();
		
		Tsb.addSpell(fb);
	    Tsb.addSpell(r);
	    Tsb.addSpell(h);
	    Tsb.addSpell(v);
	    while (loop < 4) {
	    	if (loop < 2) {
	    		System.out.println("Your wizard can posess three of the spells presented before you. choose three to add to your spell book");
	    	}
	    	Tsb.printSpellsC();
		    String RSS = inp.nextLine();
		    int RS = Integer.parseInt(RSS);
		    Spell spell = Tsb.getSpellFromId(RS);
		    sb.addSpell(spell);
		    Tsb.removeSpell(RS);
		    loop = loop + 1;
	    }
	    
	    Util.Sep();
	    
	    
	    sb.printSpells();
	    
		
		System.out.println("");
		
		System.out.println("Which spell would you like to cast? 1, 2 or 3?");
		String castSpell = inp.nextLine();
		Spell spellCast = sb.getSpells().get(Integer.parseInt(castSpell)-1);
		System.out.println("You cast: " +spellCast);
		Object castspell = castSpell;
		int id = Integer.valueOf((String) castspell);
		Spell spell = sb.getSpellFromId(id);
		
		
		
		Util.Sep();
		
		

		ArrayList<? extends Object> targets = new ArrayList();
		
		if (spellCast instanceof targetCreature) {
			cl.printCreatures();
			targets = cl.getCreatures();
		}
		if (spellCast instanceof targetLocation) {
			Lo.printLocations();
		}
		if (spellCast instanceof targetItem) {
			EI.printEquipableItems();
			targets = EI.getEquipableItems();
		}
				
		
		
		
		System.out.println("You cast " + spellCast + " choose a target from the list: ");
		String Target = inp.nextLine();
		 
		
		
		Object o = targets.get(Integer.parseInt(Target)-1);
		

		System.out.println("You cast " + spellCast + " on " + o);
		
		

		
		
		inp.close();
		
		
		
	  }

	}

