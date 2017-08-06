package main.entity.regiments;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;

import main.entity.captains.Captain;
import main.entity.tactics.Tactic;
import main.graphics.battleScreen.BattleScreen;
import main.graphics.battleScreen.RightAggregatePanel;
import main.utility.ImageLoader;

public abstract class Regiment {
	
	public Captain captain;
	public ArrayList<Tactic> instructions;
	
	public int attack;
	public int defence;
	public int move;
	public int charge;
	public int run;
	public int range;
	public int missile;
	public int morale;
	public int speed;
	public int speedVariation;
	
	public int battleAttack;
	public int battleDefence;
	public int battleMove;
	public int battleCharge;
	public int battleRun;
	public int battleRange;
	public int battleMissile;
	public int battleMorale;
	public int battleSpeed;
	public int battleSpeedVariation;
	
	
	public String name;
	public RegimentType type;
	
	public int rows;
	public int columns;
	
	public int x;
	public int y;
	
	public int[] panels;
	
	protected ImageLoader imageLoader = new ImageLoader();
	public ImageIcon icon;
	
	protected int width = BattleScreen.battleScene.roundedWidth / 48 - 8;
	protected int height = BattleScreen.battleScene.roundedHeight / 32 - 8;
	
	public Regiment() {		
		
	}
	
	public void setIndices(int upperLeftIndex) {
		
		for(int yCoordinate = 0; yCoordinate < rows; yCoordinate++) {
			
			for (int xCoordinate = 0; xCoordinate < columns; xCoordinate++) {
			
				panels[xCoordinate + yCoordinate * columns] = upperLeftIndex + xCoordinate + yCoordinate * 48;	
			}	
		}		
	}
	
	public int rollSpeedVariation() {
		
		Random random = new Random();
		return random.nextInt(speedVariation);
		
	}
	
	public void attributeBattleSpeed() {
		battleSpeed = speed + rollSpeedVariation();
	}
	
	public void attributeBattleStats() {
		
		this.battleAttack = attack;
		this.battleCharge = charge;
		this.battleDefence = defence;
		this.battleMissile = missile;
		this.battleMorale = morale;
		this.battleSpeed = speed;
		this.battleSpeedVariation = speedVariation;
		this.battleMove = move;
		this.battleRange = range;
		this.battleRun = run;
		
	}
	
	
	public void haveTurn(Regiment activeRegiment) {
		RightAggregatePanel.infoTextPanel.textArea.setText("<font color = 'rgb(220, 220, 220)'>"
				+ activeRegiment.name + " is having their turn (" + activeRegiment.battleSpeed + ").");
		
	}
	
	

}
