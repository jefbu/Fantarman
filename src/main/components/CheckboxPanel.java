package main.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.utility.Colors;
import main.utility.ImageLoader;

public class CheckboxPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	JButton iconButton;
	JLabel textLabel;
	ImageLoader imageLoader;

	public CheckboxPanel(int width, int height, Color colour) {
		
		super();
		setPreferredSize(new Dimension(width, height));
		setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));
		setBackground(colour);
		
		JPanel emptyTopPanel = new JPanel();
		emptyTopPanel.setPreferredSize(new Dimension(width, height / 10));
		emptyTopPanel.setBackground(Colors.orange);
		add(emptyTopPanel);
		
		JPanel emptyLeftPanel = new JPanel();
		emptyLeftPanel.setPreferredSize(new Dimension(width * 5 / 100, height * 8 / 10));
		emptyLeftPanel.setBackground(Colors.lorange);
		add(emptyLeftPanel);
		
		JPanel centrePanel = new JPanel();
		centrePanel.setPreferredSize(new Dimension(width * 9 / 10, height * 8 / 10));
		centrePanel.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));
		centrePanel.setBackground(Colors.textyellow);
		add(centrePanel);	
		
		JPanel checkboxPanel = new JPanel();
		checkboxPanel.setPreferredSize(new Dimension(width * 3 / 10, height * 8 / 10));
		checkboxPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		checkboxPanel.setBackground(Colors.lblue);
		centrePanel.add(checkboxPanel);
		
		imageLoader = new ImageLoader();
		
		iconButton = new JButton();
		iconButton.setBorderPainted(false);
		iconButton.setOpaque(false);
		iconButton.setContentAreaFilled(false);
		iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png", width * 3 / 10, height * 8 / 10));
		checkboxPanel.add(iconButton);
		
		JPanel textPanel = new JPanel();
		textPanel.setPreferredSize(new Dimension(width * 6 / 10, height * 8 / 10));
		textPanel.setBackground(Colors.dblue);
		centrePanel.add(textPanel);
		
		textLabel = new JLabel("click");
		textPanel.add(textLabel);
		
		JPanel emptyRightPanel = new JPanel();
		emptyRightPanel.setPreferredSize(new Dimension(width *5 / 100, height * 8 / 10));
		emptyRightPanel.setBackground(Colors.dorange);
		add(emptyRightPanel);
		
		JPanel emptyBottomPanel = new JPanel();
		emptyBottomPanel.setPreferredSize(new Dimension(width, height / 10));
		emptyBottomPanel.setBackground(Colors.vlorange);
		add(emptyBottomPanel);
		
	}
	
	

}
