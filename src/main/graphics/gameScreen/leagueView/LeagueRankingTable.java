package main.graphics.gameScreen.leagueView;

import java.awt.FlowLayout;

import javax.swing.JPanel;

import main.components.Colour;
import main.components.ContentPanel;

public class LeagueRankingTable extends ContentPanel {
	
	private static final long serialVersionUID = 1L;

	public LeagueRankingTable(int width, int height) {
		
		super(width, height, Colour.DGREEN, new FlowLayout(FlowLayout.LEFT, 0, 0));
		RowPanel army1Panel = new RowPanel(width, height / 8 + 10, Colour.BLUE, new FlowLayout(FlowLayout.LEFT, 1, 1));
		ContentPanel army2Panel = new ContentPanel(width, height / 8 + 10, Colour.DBLUE, new FlowLayout(FlowLayout.LEFT, 0, 0));
		ContentPanel army3Panel = new ContentPanel(width, height / 8 + 10, Colour.BLUE, new FlowLayout(FlowLayout.LEFT, 0, 0));
		ContentPanel army4Panel = new ContentPanel(width, height / 8 + 10, Colour.DBLUE, new FlowLayout(FlowLayout.LEFT, 0, 0));
		ContentPanel army5Panel = new ContentPanel(width, height / 8 + 10, Colour.BLUE, new FlowLayout(FlowLayout.LEFT, 0, 0));
		ContentPanel army6Panel = new ContentPanel(width, height / 8 + 10, Colour.DBLUE, new FlowLayout(FlowLayout.LEFT, 0, 0));
		ContentPanel army7Panel = new ContentPanel(width, height / 8 + 10, Colour.BLUE, new FlowLayout(FlowLayout.LEFT, 0, 0));
		ContentPanel army8Panel = new ContentPanel(width, height / 8 + 10, Colour.DBLUE, new FlowLayout(FlowLayout.LEFT, 0, 0));

		insidePanel.add(army1Panel);
		insidePanel.add(army2Panel);
		insidePanel.add(army3Panel);
		insidePanel.add(army4Panel);
		insidePanel.add(army5Panel);
		insidePanel.add(army6Panel);
		insidePanel.add(army7Panel);
		insidePanel.add(army8Panel);
		
	}

}
