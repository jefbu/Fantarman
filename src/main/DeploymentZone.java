package main;

import java.awt.Color;

import javax.swing.border.LineBorder;

import main.graphics.battleScreen.BattleScreen;

public class DeploymentZone {
	
	public int[] panels;
	
	public DeploymentZone() {
		
		panels = new int[256];
		
		for (int height = 24; height < 32; height ++) {
			for (int width = 8; width < 40; width ++) {
				panels[((height - 24) * 32) + (width - 8)] = height * 48 + width;				
				}			
		}
		
		for (int i = 0; i < panels.length; i++) {
			BattleScreen.battleScene.indexedPanels.get(panels[i])
					.setBorder(new LineBorder(new Color(255, 0, 255), 1));
		}
		
		
		
	}
	
	public void removeDeploymentZone() {
		
		for (int i = 0; i < panels.length; i++) {
			BattleScreen.battleScene.indexedPanels.get(panels[i])
					.setBorder(null);
		}
		
	}

}
