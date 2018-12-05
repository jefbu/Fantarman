package main.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.utility.ImageLoader;

public class CheckboxPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	public JButton iconButton;
	public JLabel textLabel;
	ImageLoader imageLoader;

	public CheckboxPanel(int width, int height, Color colour) {
		
		super();
		setPreferredSize(new Dimension(width, height));
		setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));
		setBackground(colour);
		
		JPanel emptyTopPanel = new JPanel();
		emptyTopPanel.setPreferredSize(new Dimension(width, height / 10));
		emptyTopPanel.setBackground(colour);
		add(emptyTopPanel);
		
		JPanel emptyLeftPanel = new JPanel();
		emptyLeftPanel.setPreferredSize(new Dimension(width * 5 / 100, height * 8 / 10));
		emptyLeftPanel.setBackground(colour);
		add(emptyLeftPanel);
		
		JPanel centrePanel = new JPanel();
		centrePanel.setPreferredSize(new Dimension(width * 9 / 10, height * 8 / 10));
		centrePanel.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));
		centrePanel.setBackground(colour);
		add(centrePanel);	
		
		JPanel checkboxPanel = new JPanel();
		checkboxPanel.setPreferredSize(new Dimension(width * 25 / 100, height * 8 / 10));
		checkboxPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		checkboxPanel.setBackground(colour);
		centrePanel.add(checkboxPanel);
		
		imageLoader = new ImageLoader();
		
		iconButton = new JButton();
		iconButton.setBorderPainted(false);
		iconButton.setBorder(null);
		iconButton.setOpaque(false);
		iconButton.setContentAreaFilled(false);
		iconButton.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));
		iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png", width * 2 / 10, height * 6 / 10));
		checkboxPanel.add(iconButton);
		
		JPanel textPanel = new JPanel();
		textPanel.setPreferredSize(new Dimension(width * 65 / 100, height * 8 / 10));
		textPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, height / 20));
		textPanel.setBackground(colour);
		centrePanel.add(textPanel);
		
		textLabel = new JLabel("click");
		textPanel.add(textLabel);
		
		JPanel emptyRightPanel = new JPanel();
		emptyRightPanel.setPreferredSize(new Dimension(width *5 / 100, height * 8 / 10));
		emptyRightPanel.setBackground(colour);
		add(emptyRightPanel);
		
		JPanel emptyBottomPanel = new JPanel();
		emptyBottomPanel.setPreferredSize(new Dimension(width, height / 10));
		emptyBottomPanel.setBackground(colour);
		add(emptyBottomPanel);
		
	}
	
	

}
