package graphics.battleScreen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JPanel;

import components.IndexedPanel;
import main.Main;

public class BattleScene extends JPanel {


	private static final long serialVersionUID = 1L;
	public Dimension individualPanelSize;
	
	public BattleScene(int width, int height) {
		
		super();
		
		int unroundedHeight = height * 8 / 10;
		int unroundedWidth = height * 8 / 10;
		
		int roundedHeight = unroundedHeight - (unroundedHeight%32);
		int roundedWidth = unroundedWidth - (unroundedWidth%32);

		Dimension battleSceneSize = new Dimension(roundedHeight, roundedWidth);
		setPreferredSize(battleSceneSize);
		setBackground (new Color(150, 200, 150));
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		
		individualPanelSize = new Dimension((roundedWidth / 32), (roundedHeight / 32));
		
		for (int i = 0; i < 32 * 32; i++) {
			
			for (IndexedPanel panel: Main.fireMages.panels) {
			if (panel.index == i) {
				JPanel indexedPanel = new JPanel();
				indexedPanel.setPreferredSize(individualPanelSize);
				indexedPanel.setBackground(new Color(255, 255, 255));
				add(indexedPanel);
			} else {
				
				JPanel panel2 = new JPanel();
				panel2.setPreferredSize(individualPanelSize);
				Random random = new Random();
				panel2.setBackground(new Color(random.nextInt(256), (i/4), (i/4)));
				add(panel2);
			}
				
			
			}
			
			
		}
		


	}

}
