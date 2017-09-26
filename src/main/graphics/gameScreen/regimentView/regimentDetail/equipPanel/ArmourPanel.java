package main.graphics.gameScreen.regimentView.regimentDetail.equipPanel;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.utility.Colors;

public class ArmourPanel extends JButton {
	
	private static final long serialVersionUID = 1L;
	
	public JPanel namePanel;
	public JPanel defencePanel;
	public JPanel moralePanel;
	public JPanel movePanel;
	public JPanel speedPanel;
	public JPanel costPanel;
	public JPanel upkeepPanel;
		
	public ArmourPanel(int width, int height) {
		
		super();
		
		setPreferredSize(new Dimension(width, height));
		setBackground(Colors.vlgreen);
		setBorder(null);
		setLayout(new FlowLayout(FlowLayout.LEFT, 1, 1));
		
		int individualWidth = (width / 8) - 1;
		int individualHeight = height - 1;
		
		namePanel = new JPanel();
		namePanel.setPreferredSize(new Dimension(individualWidth * 2, individualHeight));
		namePanel.setBackground(Colors.lred);
		add(namePanel);
		
		defencePanel = new JPanel();
		defencePanel.setPreferredSize(new Dimension(individualWidth, individualHeight));
		defencePanel.setBackground(Colors.lred);
		add(defencePanel);
		
		moralePanel = new JPanel();
		moralePanel.setPreferredSize(new Dimension(individualWidth, individualHeight));
		moralePanel.setBackground(Colors.lred);
		add(moralePanel);
		
		movePanel = new JPanel();
		movePanel.setPreferredSize(new Dimension(individualWidth, individualHeight));
		movePanel.setBackground(Colors.lred);
		add(movePanel);
		
		speedPanel = new JPanel();
		speedPanel.setPreferredSize(new Dimension(individualWidth, individualHeight));
		speedPanel.setBackground(Colors.lred);
		add(speedPanel);
		
		costPanel = new JPanel();
		costPanel.setPreferredSize(new Dimension(individualWidth, individualHeight));
		costPanel.setBackground(Colors.lred);
		add(costPanel);
		
		upkeepPanel = new JPanel();
		upkeepPanel.setPreferredSize(new Dimension(individualWidth, individualHeight));
		upkeepPanel.setBackground(Colors.lred);
		add(upkeepPanel);
		
		
		
		
	}

}
