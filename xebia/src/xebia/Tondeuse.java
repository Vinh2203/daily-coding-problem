package xebia;

import java.util.Arrays;
import java.util.List;

public class Tondeuse {
	private int x;
	private int y;
	private int xMax;
	private int yMax;
	private String orientation;
	List<String> listOrientation = Arrays.asList("N","E","S","W");
	public Tondeuse(int x, int y, String orientation) {
		super();
		this.x = x;
		this.y = y;
		this.orientation = orientation;
	}
	
	public void execute(String commande) {
		if(commande.equals("A")) {
			if(this.orientation.equals("N") && this.y+1 <= this.getyMax()) {
				this.y = this.y+1;
			}
			if(this.orientation.equals("S") && this.y-1 >= 0) {
				this.y = this.y-1;
			}
			if(this.orientation.equals("E") && this.x+1 <= this.getxMax()) {
				this.x = this.x+1;
			}
			if(this.orientation.equals("W") && this.x-1 >= 0) {
				this.x = this.x-1;
			}
		}else {
			this.pivoter(commande);
		}
	}
	
	private void pivoter(String commande) {
		int index = listOrientation.indexOf(this.orientation);
		if(commande.equals("D")) {
			if(index == listOrientation.size()-1) {
				this.orientation = listOrientation.get(0);
			}else {
				this.orientation = listOrientation.get(index+1);
			}
		}
		if(commande.equals("G")) {
			if(index == 0) {
				this.orientation = listOrientation.get(listOrientation.size()-1);
			}else {
				this.orientation = listOrientation.get(index-1);
			}
		}
	}
	
	
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public int getxMax() {
		return xMax;
	}


	public void setxMax(int xMax) {
		this.xMax = xMax;
	}


	public int getyMax() {
		return yMax;
	}


	public void setyMax(int yMax) {
		this.yMax = yMax;
	}


	public String getOrientation() {
		return orientation;
	}


	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}

	@Override
	public String toString() {
		return "Tondeuse [x=" + x + ", y=" + y + ", orientation=" + orientation + "]";
	}
	
	
}
