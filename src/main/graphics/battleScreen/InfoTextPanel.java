package main.graphics.battleScreen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class InfoTextPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	public JTextArea textArea;
	
	public InfoTextPanel(Dimension dimension) {
		
		super();
		
		int width = (int) dimension.getWidth() - 4;
		int height = ((int) dimension.getHeight() - 4) * 85 / 100;
		
		setPreferredSize(new Dimension(width, height));
		setBackground(new Color(10, 10, 10));
		
		textArea = new JTextArea();
		textArea.setPreferredSize(new Dimension(width - 10, height - 10));
		textArea.setEditable(false);
		textArea.setBackground(new Color(40,70,50));
		textArea.setFont(new Font("garamond", Font.BOLD, 20));
		textArea.setForeground(new Color (240, 230, 230));
		textArea.setMargin(new Insets(10,10,10,10));
		textArea.setText("Hello World");
		add(textArea);
		
	}
	
	

}
