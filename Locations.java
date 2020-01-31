public class Locations {
	
	String[] arr = new String[25];

	 public Locations() {
		 int loop1 = 0;
		 int loop2 = 1;
		 int arrloop1 = 1;
		 while (loop1 < 6){
			 loop1++;
			 int X = loop1;
			 int Xa = X + 64;
			 char XC= ((char)Xa);
			 String xC=String.valueOf(XC);
			 while (loop2 < 6){
				 int Y = loop2;
				 String yC = Integer.toString(Y);
				 String ArrU = (xC + yC);
				 int arrloop = (loop1 + loop2);
				 arrloop1 = (arrloop - 2);
				 arr[arrloop1] = ArrU;
				 loop2++;
			 }
		 }
	 }
	 
	 public void printLocations() {
		 int loopP = 0;
		 while (loopP < 25){
			 System.out.println(arr[loopP]);
			 loopP ++;
			 }
		 }
	 }

