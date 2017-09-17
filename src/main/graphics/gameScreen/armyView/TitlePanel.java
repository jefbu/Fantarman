package main.graphics.gameScreen.armyView;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TitlePanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	public static ArrayList<String> statview;
	ArrayList<JPanel> panelList;

	public TitlePanel(int width, int height) {
		
		super();
		setPreferredSize(new Dimension(width, height));
		setBackground(new Color(45, 90, 135));
		setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));
		
		statview = new ArrayList<String>();
		panelList = new ArrayList<JPanel>();
		createArrayLists();
		
		JPanel namePanel = new JPanel();
		namePanel.setPreferredSize(new Dimension(width / 6, height));
		namePanel.setBackground(new Color(45, 90, 135));
		panelList.add(namePanel);
		
		for (int i = 0; i < 10; i++) {
			JPanel panel = new JPanel();
			panel.setPreferredSize(new Dimension(width / 12, height));
			panel.setBackground(new Color(45, 90, 135));
			panelList.add(panel);
		}
		
		for (JPanel panel: panelList) {
			add(panel);
		}
		
	}
	
	public void createArrayLists() {
				
		statview.add("Name");
		statview.add("Life");
		statview.add("Move");
		statview.add("Run");
		statview.add("Speed");
		statview.add("Attack");
		statview.add("Charge");
		statview.add("Defence");
		statview.add("Range");
		statview.add("Missile");
		statview.add("Morale");
		
	}
	
	public void applyView(ArrayList<String> list) {
		
		for (int i = 0; i < panelList.size(); i++) {
			
			JLabel label = new JLabel();
			label.setForeground(new Color(200, 230, 255));
			label.setText(list.get(i));
			panelList.get(i).setLayout(new FlowLayout(FlowLayout.CENTER, 0, 15));
			panelList.get(i).add(label);
			
		}
		
	}

}
