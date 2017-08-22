package main.battle;

import main.components.Colour;
import main.components.Popup;
import main.graphics.battleScreen.BattleScreen;

public class BattleConclusion extends Popup {

	private static final long serialVersionUID = 1L;

	public BattleConclusion(Colour colour) {
		
		super(BattleScreen.battleScene.roundedWidth, BattleScreen.battleScene.roundedHeight, colour);		
		
		
	}
	
}
