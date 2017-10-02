package main.graphics.gameScreen.regimentView.captainDetail.orderPanel;

import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import main.components.Colour;
import main.utility.Colors;

public class IndividualOrderPanel extends JButton {

	private static final long serialVersionUID = 1L;

	public IndividualOrderPanel(int width, int height) {
		
		super();
		setPreferredSize(new Dimension(width, height));
		setBorder(null);
		setBackground(Colors.lred);
		
		addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OrderChoicePopup orderChoicePopup = new OrderChoicePopup(width * 2, height * 10, Colour.DRED, false);
				orderChoicePopup.setLocation(MouseInfo.getPointerInfo().getLocation());
				int x = orderChoicePopup.getX();
				int y = orderChoicePopup.getY() - height * 10;
				orderChoicePopup.setLocation(x, y);
				orderChoicePopup.setVisible(true);
			}
		});
		
		
		
	}
	

}
