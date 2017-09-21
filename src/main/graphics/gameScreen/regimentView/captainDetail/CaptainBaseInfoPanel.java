package main.graphics.gameScreen.regimentView.captainDetail;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

import main.components.Colour;
import main.components.ContentPanel;

public class CaptainBaseInfoPanel extends ContentPanel {

		private static final long serialVersionUID = 1L;
		ArrayList<JPanel> panelList;
		
		public CaptainBaseInfoPanel(int width, int height, Colour colour, FlowLayout flowLayout) {
			
			super(width, height, colour, flowLayout);
			panelList = new ArrayList<JPanel>();
			
			for (int i = 0; i < 5; i++) {
				JPanel panel = new JPanel();
				panel.setPreferredSize(new Dimension(width, height / 5 - 1));
				panel.setOpaque(false);
				panelList.add(panel);
			}
			
			addPanels();		
			
		}
		
		private void addPanels() {
			for (int i = 0; i < panelList.size(); i++) {
				insidePanel.add(panelList.get(i));
			}
		}
	
}
