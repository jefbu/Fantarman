package main.battle;

import main.Main;
import main.components.Colour;
import main.components.TextPopup;
import main.entity.armies.Army;
import main.entity.regiments.Regiment;
import main.graphics.battleScreen.BattleScreen;
import main.strings.Adjectives;

public class BattleConclusion extends TextPopup {

	private static final long serialVersionUID = 1L;

	public BattleConclusion(Colour colour, Army yourBattleArmy, Army opponentBattleArmy) {
		
		super(BattleScreen.battleScene.roundedWidth / 3, BattleScreen.battleScene.roundedHeight / 4, colour, true);
		
		int yourInitialValue = yourBattleArmy.value;
		int enemyInitialValue = opponentBattleArmy.value;
		
		int yourFinalValue = 0;
		for (Regiment regiment: yourBattleArmy.roster) {
			yourFinalValue = yourFinalValue + regiment.value;
		}
		
		int enemyFinalValue = 0;
		for (Regiment regiment: opponentBattleArmy.roster) {
			enemyFinalValue = enemyFinalValue + regiment.value;
		}
		
		int yourPercentage = yourFinalValue * 100 / yourInitialValue;
		int enemyPercentage = enemyFinalValue * 100 / enemyInitialValue;
		
		if (yourPercentage > enemyPercentage * 15 / 10) {
			Adjectives adjectives = new Adjectives();
			String adjective = adjectives.choosePositiveAdjective();
			writeText (adjective + " victory"); }
		else if (yourPercentage > enemyPercentage * 12 / 10) { writeText ("minor victory"); }
		else if (yourPercentage > enemyPercentage * 8 / 10) { writeText ("draw"); }
		else if (yourPercentage > enemyPercentage * 6 / 10) { writeText ("minor loss"); }
		else { writeText ("major loss"); }

		yourBattleArmy.roster.clear();
		opponentBattleArmy.roster.clear();
		
		for (Regiment regiment: Main.yourArmy.roster) {
			for (int i = 0; i < regiment.panels.length; i++) {
				regiment.panels[i] = 0;  
			}
		}
		
		Main.league.calendarDay++;
		
	}
	
}
