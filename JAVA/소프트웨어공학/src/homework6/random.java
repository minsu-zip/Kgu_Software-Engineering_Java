package homework6;

public class random {

	boolean Dice(int x, int y) {
		boolean check;
		
		if (x > 0 && y > 0) {
			check = true;
		}
		else if(x==y) {
			check = true;
		}
		else {
			check =false;
		}
		return check;
	}

}
