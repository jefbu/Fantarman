package main.graphics.gameScreen.regimentView.captainDetail;

import java.awt.FlowLayout;

import main.components.Colour;
import main.components.ContentPanel;
import main.components.DoubleLabeledPanel;
import main.entity.regiments.Regiment;

public class CaptainBaseInfoPanel extends ContentPanel {

		private static final long serialVersionUID = 1L;
		
		public DoubleLabeledPanel namePanel;
		public DoubleLabeledPanel genderPanel;
		public DoubleLabeledPanel prestigePanel;
		public DoubleLabeledPanel ordersPanel;
		public DoubleLabeledPanel skill1Panel;
		public DoubleLabeledPanel skill2Panel;
		
		public CaptainBaseInfoPanel(int width, int height, Colour colour, FlowLayout flowLayout) {
			
			super(width, height, colour, flowLayout);
			
			namePanel = new DoubleLabeledPanel(width - 10, (height - 18) / 6, 40, Colour.LBLUE);
			namePanel.titleLabel.setText("Name");
			insidePanel.add(namePanel);
			
			genderPanel = new DoubleLabeledPanel(width - 10, (height - 18) / 6, 60, Colour.LBLUE);
			genderPanel.titleLabel.setText("Gender");
			insidePanel.add(genderPanel);
			
			prestigePanel = new DoubleLabeledPanel(width - 10, (height - 18) / 6, 60, Colour.LBLUE);
			prestigePanel.titleLabel.setText("Prestige");
			insidePanel.add(prestigePanel);
			
			ordersPanel = new DoubleLabeledPanel(width - 10, (height - 18) / 6, 70, Colour.LBLUE);
			ordersPanel.titleLabel.setText("Orders");
			insidePanel.add(ordersPanel);
			
			skill1Panel = new DoubleLabeledPanel(width - 10, (height - 18) / 6, 30, Colour.LBLUE);
			skill1Panel.titleLabel.setText("Skill 1");
			insidePanel.add(skill1Panel);
			
			skill2Panel = new DoubleLabeledPanel(width - 10, (height - 18) / 6, 30, Colour.LBLUE);
			skill2Panel.titleLabel.setText("Skill 2");
			insidePanel.add(skill2Panel);
			
	
		}
	
		public void fillCaptainBaseInfoPanel(Regiment regiment) {
			
			namePanel.contentLabel.setText(regiment.captain.name);
			genderPanel.contentLabel.setText(regiment.captain.gender);
			prestigePanel.contentLabel.setText(Integer.toString(regiment.captain.prestige));
			ordersPanel.contentLabel.setText(Integer.toString(regiment.captain.orders));
			try {
				skill1Panel.contentLabel.setText(regiment.captain.skill1.toString());
			} catch (Exception e) {
				skill1Panel.contentLabel.setText("---");
			}
			try {
				skill2Panel.contentLabel.setText(regiment.captain.skill2.toString());
			} catch (Exception e) {
				skill2Panel.contentLabel.setText("---");
			}
			
		}
		
		
}
