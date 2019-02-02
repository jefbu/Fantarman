package main.graphics.gameScreen;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import main.components.ButtonedIconPanel;
import main.graphics.Screen;
import main.utility.Colors;

public class BottomHomePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public BottomHomePanel(int width, int height) {

		super();
		setPreferredSize(new Dimension(width, height));
		setBackground(Colors.dgrey);
		setLayout(new FlowLayout(FlowLayout.RIGHT, 0, 0));

		JPanel vdgreyPanel = new JPanel();
		vdgreyPanel.setPreferredSize(new Dimension(width * 75 / 100, height * 9 / 10));
		vdgreyPanel.setBackground(Colors.dgrey);
		vdgreyPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		add(vdgreyPanel);

		ButtonedIconPanel click = new ButtonedIconPanel(width * 75 / 100, height * 9 / 10, "/icons/homeButton.png",
				"/icons/homeButtonHovered.png");
		vdgreyPanel.add(click);

		/*
		 * JButton click = new JButton(); click.setPreferredSize(new
		 * Dimension(width * 75 / 100, height * 9 / 10));
		 * click.setContentAreaFilled(false); click.setOpaque(false);
		 * click.setBorder(new LineBorder(Colors.textyellow, 10, false));
		 * //click.setBorderPainted(false); ImageLoader imageLoader = new
		 * ImageLoader();
		 * click.setIcon(imageLoader.loadImageIcon("/icons/homeButton.png",
		 * width * 75 / 100, height * 9 / 10)); vdgreyPanel.add(click);
		 */

		click.button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.gameScreen.setScreensInvisible();
				Screen.gameScreen.mainPanel.homeView.fillHomeScreen(true);
				Screen.gameScreen.mainPanel.homeView.setVisible(true);
			}
		});

	}

}
