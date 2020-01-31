import java.lang.Math; 
public class Util {

	public Util() {
	}
	
	public static double pair(int x, int y) {
		int xA = x;
		int yA = y;
		int AA = xA + yA;
		int AB = AA + 1;
		AB = AA * AB;
		AB = AB / 2;
		AB = AB + yA;
		System.out.println("cantor number is " + AB);
		return AB;
	}
	
	public static void Sep() {
		System.out.println("");
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println("");
	}
	
	public static int[] depair(int xy) {
		int[] arr = null;
		int xyA = xy;
		int BA = xyA * 8;
		BA = BA + 1;
		String SBA = Integer.toString(BA);
		double DBA = Double.parseDouble(SBA);
		DBA = Math.sqrt(DBA);
		DBA = DBA - 1;
		DBA = DBA / 2;
		BA = (int) Math.round(DBA);
		int W = BA;
		int BB = BA + 1;
		BB = BA * BB;
		BB = BB / 2;
		int T = BB;
		BB = xyA - T;
		int Y = BB;
		int X = W - Y;
		arr[0] = X;
		arr[1] = Y;
		return arr;
	}

}
		
		

