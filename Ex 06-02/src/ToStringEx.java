class Point{
	int x,y;
	public Point(int x, int y ) {
		this.x = x; this.y = y;
	}
	public String toString() {
		return "Ponint(" + x +", " + y +")";
	}
}

public class ToStringEx {
	public static void main (String [] atgs) {
		Point a = new Point(2,3);
		System.out.println(a.toString());
		System.out.println(a); 	
	}
}
