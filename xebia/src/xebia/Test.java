package xebia;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		Pelouse pelouse = new Pelouse();
		pelouse.readFile("src/xebia/text.txt");
		List<Tondeuse> list = pelouse.getListTondeuse();
		
		for(Tondeuse t : list) {
			System.out.println(t.toString());
		}

	}

}
