package main.graphics.gameScreen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

import main.components.Colour;
import main.components.ContentPanel;
import main.graphics.gameScreen.armyView.ArmyViewViewPanel;
import main.graphics.gameScreen.armyView.RoleSelectionPanel;

public class ArmyView extends JPanel {

	private static final long serialVersionUID = 1L;
	Color backgroundColor;

	public ArmyView(int gameScreenWidth, int gameScreenHeight) {

		super();

		backgroundColor = new Color(170, 190, 255);
		int unroundedHeight = gameScreenHeight * 98 / 100;
		int unroundedWidth = gameScreenHeight * 8 * 15 / 100;
		int roundedWidth = unroundedWidth - (unroundedWidth % 48);

		Dimension gameSceneSize = new Dimension(roundedWidth, unroundedHeight);
		setPreferredSize(gameSceneSize);

		setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));

		JPanel topEmptyPanel1 = new JPanel();
		topEmptyPanel1.setPreferredSize(new Dimension(roundedWidth, unroundedHeight / 50));
		topEmptyPanel1.setBackground(backgroundColor);
		add(topEmptyPanel1);

		JPanel topEmptyLeftPanel = new JPanel();
		topEmptyLeftPanel.setPreferredSize(new Dimension(roundedWidth * 35 / 100, unroundedHeight / 20));
		topEmptyLeftPanel.setBackground(backgroundColor);
		add(topEmptyLeftPanel);

		ArmyViewViewPanel viewPanel = new ArmyViewViewPanel(roundedWidth * 15 / 100, unroundedHeight / 20);
		add(viewPanel);

		JPanel topEmptyRightPanel = new JPanel();
		topEmptyRightPanel.setPreferredSize(new Dimension(roundedWidth * 50 / 100, unroundedHeight / 20));
		topEmptyRightPanel.setBackground(backgroundColor);
		add(topEmptyRightPanel);

		JPanel topEmptyPanel2 = new JPanel();
		topEmptyPanel2.setPreferredSize(new Dimension(roundedWidth, unroundedHeight / 50));
		topEmptyPanel2.setBackground(backgroundColor);
		add(topEmptyPanel2);

		JPanel topEmptyLeftPanel2 = new JPanel();
		topEmptyLeftPanel2.setPreferredSize(new Dimension(roundedWidth * 35 / 100, unroundedHeight / 20));
		topEmptyLeftPanel2.setBackground(backgroundColor);
		add(topEmptyLeftPanel2);

		JPanel titlePanel = new JPanel();
		titlePanel.setPreferredSize(new Dimension(roundedWidth * 60 / 100 - 5, unroundedHeight / 20));
		titlePanel.setBackground(new Color(45, 90, 135));
		add(titlePanel);

		JPanel topEmptyRightPanel2 = new JPanel();
		topEmptyRightPanel2.setPreferredSize(new Dimension(roundedWidth * 5 / 100 + 5, unroundedHeight / 20));
		topEmptyRightPanel2.setBackground(backgroundColor);
		add(topEmptyRightPanel2);

		JPanel leftEmptyPanel = new JPanel();
		leftEmptyPanel.setPreferredSize(new Dimension(roundedWidth / 10, unroundedHeight * 75 / 100));
		leftEmptyPanel.setBackground(backgroundColor);
		add(leftEmptyPanel);

		RoleSelectionPanel leftPanel = new RoleSelectionPanel(roundedWidth * 2 / 10 + 10,
				unroundedHeight * 75 / 100 + 10, Colour.BLUE, new FlowLayout(FlowLayout.LEADING, 0, 0));
		add(leftPanel);

		JPanel centreEmptyPanel = new JPanel();
		centreEmptyPanel.setPreferredSize(new Dimension(roundedWidth / 20, unroundedHeight * 75 / 100));
		centreEmptyPanel.setBackground(backgroundColor);
		add(centreEmptyPanel);

		ContentPanel rightPanel = new ContentPanel(roundedWidth * 6 / 10 + 10, unroundedHeight * 75 / 100 + 10,
				Colour.BLUE, new FlowLayout(FlowLayout.LEADING, 0, 0));
		add(rightPanel);

		JPanel rightEmptyPanel = new JPanel();
		rightEmptyPanel.setPreferredSize(new Dimension(roundedWidth / 20, unroundedHeight * 75 / 100));
		rightEmptyPanel.setBackground(backgroundColor);
		add(rightEmptyPanel);

		JPanel bottomEmptyPanel = new JPanel();
		bottomEmptyPanel.setPreferredSize(new Dimension(roundedWidth, unroundedHeight * 12 / 100));
		bottomEmptyPanel.setBackground(backgroundColor);
		add(bottomEmptyPanel);

	}

}
