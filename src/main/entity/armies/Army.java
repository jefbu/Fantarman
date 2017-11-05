package main.entity.armies;

import java.io.Serializable;
import java.util.ArrayList;

import main.entity.regiments.Regiment;

public class Army implements Serializable {
	
	private static final long serialVersionUID = 1L;
	public ArrayList<Regiment> roster;
	public int value;
	
	public Army() {
		
		roster = new ArrayList<Regiment>();
		calculateValue();
		
		
	}
	
	public void calculateValue() {
		
		for (Regiment regiment: roster) {
		value = value + regiment.value; 
		}
	}

}
