
public class Location extends Locations{

	public Location(){
	}
	
	
	public double pair(int x, int y){
	    double AB = Util.pair(x,y);
		System.out.println(AB);
		return AB;
	}
	
	public int depair(int xy, boolean xyc) {
		int[] arr = Util.depair(xy);
		if (xyc == true){
			System.out.println(arr[0]);
			return arr[0];
		}
		else {
			System.out.println(arr[1]);
			return arr[1];
		}
	}
	
	
}
