package main.battle;

import main.graphics.battleScreen.BattleScreen;

public class Battle {
	
	
	public Deployment deployment;
	public BattleOrchestrator battleOrchestrator;
	public BattleConclusion battleConclusion;
		
	public Battle() {
		
		BattleScreen.battleScene.createMap();
		
		battleOrchestrator = new BattleOrchestrator();
		deployment = new Deployment(battleOrchestrator);
		battleConclusion = new BattleConclusion();
		
	}

}
