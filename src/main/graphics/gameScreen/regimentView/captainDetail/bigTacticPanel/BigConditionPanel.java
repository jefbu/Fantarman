package main.graphics.gameScreen.regimentView.captainDetail.bigTacticPanel;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import main.components.CheckboxPanel;
import main.utility.Colors;

public class BigConditionPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	CheckboxPanel lifeUnder100Panel;
	CheckboxPanel lifeUnder75Panel;
	CheckboxPanel lifeUnder50Panel;
	CheckboxPanel lifeUnder25Panel;
	CheckboxPanel lifeOver25Panel;
	CheckboxPanel lifeOver50Panel;
	CheckboxPanel lifeOver75Panel;
	CheckboxPanel life100Panel;
	CheckboxPanel after1TurnPanel;
	CheckboxPanel after2TurnPanel;
	CheckboxPanel after3TurnPanel;
	CheckboxPanel after4TurnPanel;
	CheckboxPanel after5TurnPanel;
	CheckboxPanel anyInRangePanel;
	CheckboxPanel targetInRangePanel;
	
	CheckboxPanel alwaysPanel;
	
	public BigConditionPanel(int width, int height, int checkboxPanelHeight) {
		
		super();
		setPreferredSize(new Dimension(width, height));
		setBorder(new LineBorder(Colors.dgrey, 3));
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		setBackground(Colors.vlgrey);
		
		lifeUnder100Panel = new CheckboxPanel(width * 19 / 100, checkboxPanelHeight, Colors.vlgrey);
		lifeUnder100Panel.textLabel.setText("Life < 100%");
		lifeUnder75Panel = new CheckboxPanel(width * 19 / 100, checkboxPanelHeight, Colors.vlgrey);
		lifeUnder75Panel.textLabel.setText("Life < 75%");
		lifeUnder50Panel = new CheckboxPanel(width * 19 / 100, checkboxPanelHeight, Colors.vlgrey);
		lifeUnder50Panel.textLabel.setText("Life < 50%");
		lifeUnder25Panel = new CheckboxPanel(width * 19 / 100, checkboxPanelHeight, Colors.vlgrey);
		lifeUnder25Panel.textLabel.setText("Life < 25%");
		lifeOver25Panel = new CheckboxPanel(width * 19 / 100, checkboxPanelHeight, Colors.vlgrey);
		lifeOver25Panel.textLabel.setText("Life > 25%");
		lifeOver50Panel = new CheckboxPanel(width * 19 / 100, checkboxPanelHeight, Colors.vlgrey);
		lifeOver50Panel.textLabel.setText("Life > 50%");
		lifeOver75Panel = new CheckboxPanel(width * 19 / 100, checkboxPanelHeight, Colors.vlgrey);
		lifeOver75Panel.textLabel.setText("Life > 75%");
		life100Panel = new CheckboxPanel(width * 19 / 100, checkboxPanelHeight, Colors.vlgrey);
		life100Panel.textLabel.setText("Life = 100%");
		after1TurnPanel = new CheckboxPanel(width * 19 / 100, checkboxPanelHeight, Colors.vlgrey);
		after1TurnPanel.textLabel.setText("After 1 Turn");
		after2TurnPanel = new CheckboxPanel(width * 19 / 100, checkboxPanelHeight, Colors.vlgrey);
		after2TurnPanel.textLabel.setText("After 2 Turns");
		after3TurnPanel = new CheckboxPanel(width * 19 / 100, checkboxPanelHeight, Colors.vlgrey);
		after3TurnPanel.textLabel.setText("After 3 Turns");
		after4TurnPanel = new CheckboxPanel(width * 19 / 100, checkboxPanelHeight, Colors.vlgrey);
		after4TurnPanel.textLabel.setText("After 4 Turns");
		after5TurnPanel = new CheckboxPanel(width * 19 / 100, checkboxPanelHeight, Colors.vlgrey);
		after5TurnPanel.textLabel.setText("After 5 Turns");
		anyInRangePanel = new CheckboxPanel(width * 19 / 100, checkboxPanelHeight, Colors.vlgrey);
		anyInRangePanel.textLabel.setText("Any In Range");
		targetInRangePanel = new CheckboxPanel(width * 19 / 100, checkboxPanelHeight, Colors.vlgrey);
		targetInRangePanel.textLabel.setText("Chosen In Range");
		
		alwaysPanel = new CheckboxPanel(width * 19 / 100, checkboxPanelHeight, Colors.vlgrey);
		alwaysPanel.textLabel.setText("Always");
		
		add(lifeUnder100Panel);
		add(lifeUnder75Panel);
		add(lifeUnder50Panel);
		add(lifeUnder25Panel);
		add(lifeOver25Panel);
		add(lifeOver50Panel);
		add(lifeOver75Panel);
		add(life100Panel);
		add(after1TurnPanel);
		add(after2TurnPanel);
		add(after3TurnPanel);
		add(after4TurnPanel);
		add(after5TurnPanel);
		add(anyInRangePanel);
		add(targetInRangePanel);
		add(alwaysPanel);

		
	}

}
