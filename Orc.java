
public class Orc extends Creatures{

	@Override
	public String toString() {
		return "Orc";
	}
	
	public Orc(String n){
		this.name = n;
		this.totalHp = 200;
		this.totalMana = 0;
	}
}
