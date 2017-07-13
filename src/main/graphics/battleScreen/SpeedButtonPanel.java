package main.graphics.battleScreen;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;

public class SpeedButtonPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	public JButton slowestSpeedButton;
	public JButton slowerSpeedButton;
	public JButton startStopButton;
	public JButton fasterSpeedButton;
	public JButton fastestSpeedButton;
	
	public SpeedButtonPanel(Dimension dimension) {
		
		super();
		
		int width = (int) dimension.getWidth() - 4;
		int height = ((int) dimension.getHeight() - 4) * 15 / 100;
		
		setPreferredSize(new Dimension(width, height));
		setBackground(new Color(10, 10, 10));
		
		slowestSpeedButton = new JButton();
		slowestSpeedButton.setPreferredSize(new Dimension(width * 20 / 100, height - 10));
		add(slowestSpeedButton);
		
		slowerSpeedButton = new JButton();
		slowerSpeedButton.setPreferredSize(new Dimension(width * 20 / 100, height - 10));
		add(slowerSpeedButton);

		startStopButton = new JButton();
		startStopButton.setPreferredSize(new Dimension(width * 15 / 100, height - 10));
		add(startStopButton);

		fasterSpeedButton = new JButton();
		fasterSpeedButton.setPreferredSize(new Dimension(width * 20 / 100, height - 10));
		add(fasterSpeedButton);
		
		fastestSpeedButton = new JButton();
		fastestSpeedButton.setPreferredSize(new Dimension(width * 20 / 100, height - 10));
		add(fastestSpeedButton);
		
		
		
		
	}
	
	

}
