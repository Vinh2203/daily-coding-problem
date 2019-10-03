package xebia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class Pelouse {
	List<Tondeuse> listTondeuse = new LinkedList<Tondeuse>();
	
	public Pelouse() {
		super();
	}
	
	public void readFile(String nameFile) {
		try (FileReader reader = new FileReader(nameFile);
	             BufferedReader br = new BufferedReader(reader)) {

            // read line by line
            String line;
            int cpt = 0;
            int xMax = 0;
            int yMax = 0;
            String[] infoTondeuse = new String[3];
            
            while ((line = br.readLine()) != null) {
            	
            	
                if(cpt == 0) { //read 1er line
                	String[] lineTab = line.split(" ");
                	if(lineTab.length == 2) {
                		xMax = Integer.parseInt(lineTab[0]);
                		yMax =  Integer.parseInt(lineTab[1]);
                	}	
                }else if(cpt % 2 ==0 ){ //read commande and init tondeuse
                	String[] lineTab = line.split("");
                	//get info tondeuse
            		int x = Integer.parseInt(infoTondeuse[0]);
            		int y = Integer.parseInt(infoTondeuse[1]);
            		String orientation = infoTondeuse[2];
            		Tondeuse  tondeuse = new Tondeuse(x, y, orientation);
            		tondeuse.setxMax(xMax);
            		tondeuse.setyMax(yMax);
            		
            		//exec commande
            		for(String s : lineTab) {
            			tondeuse.execute(s);
            		}
            		
            		listTondeuse.add(tondeuse);
            		infoTondeuse = new String[3];
            	}else { // stock info of tondeuse
            		infoTondeuse = line.split(" ");
            	}
                
                cpt++;
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
	}

	public List<Tondeuse> getListTondeuse() {
		return listTondeuse;
	}
}
