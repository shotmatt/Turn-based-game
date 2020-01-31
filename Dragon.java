public class Dragon extends Creatures{

	//enemy creature
	
	
	@Override
	public String toString() {
		return "Dragon";
	}
	
	public Dragon(String n){
		this.name = n;
		this.totalHp = 1000;
		this.totalMana = 200;
		//Create a system where an enemy dragon can use an attack one every 3 turns (dragon class is too OP)
	}
	

}
