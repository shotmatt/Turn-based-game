
public class wizard extends Creatures{
	//player creature
	String name;
	
	@Override
	public String toString() {
		return name + " the Wizard";
	}
	
	
	private SpellBook sb;
	public wizard(String n, SpellBook sb){
		System.out.println("A wizard has been created!");
		this.name = n;
		this.totalHp = 100;
		this.totalMana = 250;
		this.sb = sb;
	}
	
	public SpellBook readSpellBook(){
	return sb;
	}
	
}