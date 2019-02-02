package main.components;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import main.utility.ImageLoader;

public class ButtonedIconPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	public JButton button;
	public ImageIcon defaultIcon;
	public ImageIcon hoveredIcon;
	
	ImageLoader imageLoader;
	
	public ButtonedIconPanel(int width, int height, String defaultPath, String hoverPath) {
		
		super();
		int hgap = 0;
		int vgap = height / 4;
				
		setPreferredSize(new Dimension(width, height));
		setOpaque(false);
		setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		
		imageLoader = new ImageLoader();
		defaultIcon = imageLoader.loadImageIcon(defaultPath, width, height);
		hoveredIcon = imageLoader.loadImageIcon(hoverPath, width, height);
		
		button = new JButton();
		button.setPreferredSize(new Dimension(width, height));
		button.setLayout(new FlowLayout(FlowLayout.CENTER, hgap, vgap));
		button.setBorder(null);
		button.setContentAreaFilled(false);
		button.addMouseListener(new MouseClass());
		button.setIcon(defaultIcon);
		add(button);
	
	}
	
	private class MouseClass extends MouseAdapter {

		public void mouseEntered(MouseEvent e) {
			button.setIcon(hoveredIcon);
		}
		
		public void mouseExited(MouseEvent e) {
			button.setIcon(defaultIcon);
		}
	}

}