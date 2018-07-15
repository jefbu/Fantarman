package main.graphics.gameScreen.homeScreen;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.Main;
import main.components.ButtonedPanel;
import main.components.ContentPanel;
import main.components.LabeledPanel;
import main.graphics.gameScreen.leagueView.MatchupRowPanel;
import main.utility.Colors;
import main.utility.ImageLoader;

public class ShortFixtures extends JPanel {

	private static final long serialVersionUID = 1L;

	private ContentPanel titleBarPanel;
	private ContentPanel fixturesPanel;
	private ContentPanel matchupsPanel;
	private ArrayList<MatchupRowPanel> matchupRowPanels;
	
	public int globalCalendarCounter;

	public ShortFixtures(int width, int height) {

		super();
		setPreferredSize(new Dimension(width, height));
		setBackground(Colors.dgrey);
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		
		matchupRowPanels = new ArrayList<MatchupRowPanel>();
		globalCalendarCounter = 0;

		titleBarPanel = new ContentPanel(width * 95 / 100, height * 165 / 1000, Colors.grey,
				new FlowLayout(FlowLayout.LEADING, 5, 0));
			LabeledPanel namePanel = new LabeledPanel(width * 67 / 100, height * 20 / 100);
			namePanel.setBackground(Colors.grey);
			namePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, height * 4 / 100));
			namePanel.label.setFont(new Font("garamond", Font.BOLD, 16));
			namePanel.label.setForeground(Colors.vlgrey);
			namePanel.label.setText("Calendar");
			titleBarPanel.insidePanel.add(namePanel);
			
			ImageLoader imageLoader = new ImageLoader();
			
			ButtonedPanel previous = new ButtonedPanel(width  / 20, height / 5, Colors.vdgrey);
			//previous.setBorder(null);
			//previous.setOpaque(false);
			//previous.setContentAreaFilled(false);
			previous.label.setIcon(imageLoader.loadImageIcon("/icons/previousIcon.png", width / 30, height / 25));
			titleBarPanel.insidePanel.add(previous);
			
			ButtonedPanel next = new ButtonedPanel(width / 20, height / 5, Colors.vdgrey);
			next.label.setIcon(imageLoader.loadImageIcon("/icons/nextIcon.png", width / 30, height / 25));
			
				next.button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						globalCalendarCounter++;
						fillShortFixtures(Main.league.calendarDay + globalCalendarCounter);
					}
				});
			
			titleBarPanel.insidePanel.add(next);

		add(titleBarPanel);

		matchupRowPanels = new ArrayList<MatchupRowPanel>(); 


		matchupsPanel = new ContentPanel(width * 95 / 100, height * 835 / 1000, Colors.lgrey,
				new FlowLayout(FlowLayout.LEFT, 0, 0));
		
		for (int i = 0; i < 4; i++) {
			MatchupRowPanel matchupRowPanel = new MatchupRowPanel(width * 9 / 10, height / 7, i);
			matchupRowPanel.setBackground(Colors.lgrey);
			matchupRowPanels.add(matchupRowPanel);
		}
		
		for (MatchupRowPanel panel: matchupRowPanels) {
			matchupsPanel.insidePanel.add(panel);
		}
		
		add(matchupsPanel);

	}

	public void fillShortFixtures(int calendarDay) {
		
		for (MatchupRowPanel panel: matchupRowPanels) {
			panel.fillMatchupRowPanel(calendarDay);
			
		}
	}

}
