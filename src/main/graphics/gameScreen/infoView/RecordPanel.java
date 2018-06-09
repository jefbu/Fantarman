package main.graphics.gameScreen.infoView;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JPanel;

import main.components.Colour;
import main.components.ContentPanel;
import main.components.DoubleLabeledPanel;
import main.components.LabeledPanel;
import main.entity.armies.Army;
import main.utility.Colors;

public class RecordPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	ContentPanel titlePanel;
	ContentPanel titleBarPanel;
	ContentPanel historyPanel;

	DoubleLabeledPanel highestLeague;
	
	public RecordPanel(int width, int height) {

		super();
		setBackground(Colors.vlblue);
		setPreferredSize(new Dimension(width, height));
		setLayout(new FlowLayout(FlowLayout.CENTER, 0, 5));

		titlePanel = new ContentPanel(width / 2, height / 10, Colour.DBLUE,
				new FlowLayout(FlowLayout.CENTER, 0, height / 50));
		titlePanel.contentLabel.setForeground(Colors.textyellow);
		titlePanel.contentLabel.setFont(new Font("garamond", Font.BOLD, 28));
		titlePanel.contentLabel.setText("HISTORY");
		add(titlePanel);

		titleBarPanel = new ContentPanel(width * 9 / 10, height / 10, Colour.BLUE,
				new FlowLayout(FlowLayout.LEFT, 0, height / 10 / 6));
			LabeledPanel titleBarNamePanel = new LabeledPanel(width * 6 / 10, height / 20);
			titleBarNamePanel.setBackground(Colors.blue);
			titleBarNamePanel.label.setForeground(Colors.textyellow);
			titleBarNamePanel.label.setText("NAME");
			titleBarPanel.insidePanel.add(titleBarNamePanel);
			LabeledPanel titleBarAmountPanel = new LabeledPanel(width * 25 / 100, height / 20);
			titleBarAmountPanel.setBackground(Colors.blue);
			titleBarAmountPanel.label.setForeground(Colors.textyellow);
			titleBarAmountPanel.label.setText("RECORD");
			titleBarPanel.insidePanel.add(titleBarAmountPanel);
		add(titleBarPanel);

		historyPanel = new ContentPanel(width * 9 / 10, height * 7 / 10, Colour.LBLUE,
				new FlowLayout(FlowLayout.LEFT, 1, 0));
		
			highestLeague = new DoubleLabeledPanel(width * 85 / 100, height / 10, 75, Colour.LBLUE);
			highestLeague.titleLabel.setText("Highest League Position");
			highestLeague.contentLabel.setText("0");
			historyPanel.insidePanel.add(highestLeague);
		
		add(historyPanel);
		
	}

	public void fillHistoryPanel(Army army) {
		

	}

}
