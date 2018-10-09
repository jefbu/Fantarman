package main.graphics.battleScreen;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JPanel;
import javax.swing.JTextPane;

import main.utility.Colors;

public class InfoTextPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	public JTextPane textArea;
	
	public InfoTextPanel(Dimension dimension) {
		
		super();
		
		int width = (int) dimension.getWidth() - 4;
		int height = ((int) dimension.getHeight() - 4) * 85 / 100;
		
		setPreferredSize(new Dimension(width, height));
		setBackground(Colors.vlgrey);
		
		textArea = new JTextPane();
		textArea.setContentType("text/html");
		textArea.putClientProperty(JTextPane.HONOR_DISPLAY_PROPERTIES, Boolean.TRUE);
		textArea.setFont(new Font("garamond",Font.BOLD,20));
		textArea.setPreferredSize(new Dimension(width - 10, height - 10));
		textArea.setEditable(false);
		textArea.setBackground(Colors.dgrey);
		textArea.setMargin(new Insets(10,10,10,10));
		add(textArea);
		
	}
	
	

}
