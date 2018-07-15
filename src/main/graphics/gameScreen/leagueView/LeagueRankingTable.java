package main.graphics.gameScreen.leagueView;

import java.awt.FlowLayout;

import main.components.Colour;
import main.components.ContentPanel;
import main.utility.Colors;

public class LeagueRankingTable extends ContentPanel {
	
	private static final long serialVersionUID = 1L;
	
	RowPanel army0Panel;
	RowPanel army1Panel;
	RowPanel army2Panel;
	RowPanel army3Panel;
	RowPanel army4Panel;
	RowPanel army5Panel;
	RowPanel army6Panel;
	RowPanel army7Panel;

	public LeagueRankingTable(int width, int height) {
		
		super(width, height, Colors.blue, new FlowLayout(FlowLayout.LEFT, 0, 0));
		army0Panel = new RowPanel(width, height / 8 + 3, Colors.lblue);
		army1Panel = new RowPanel(width, height / 8 + 3, Colors.blue);
		army2Panel = new RowPanel(width, height / 8 + 3, Colors.lblue);
		army3Panel = new RowPanel(width, height / 8 + 3, Colors.blue);
		army4Panel = new RowPanel(width, height / 8 + 3, Colors.lblue);
		army5Panel = new RowPanel(width, height / 8 + 3, Colors.blue);
		army6Panel = new RowPanel(width, height / 8 + 3, Colors.lblue);
		army7Panel = new RowPanel(width, height / 8 + 3, Colors.blue);
	
		insidePanel.add(army0Panel);
		insidePanel.add(army1Panel);
		insidePanel.add(army2Panel);
		insidePanel.add(army3Panel);
		insidePanel.add(army4Panel);
		insidePanel.add(army5Panel);
		insidePanel.add(army6Panel);
		insidePanel.add(army7Panel);
				
	}
	
	public void fillLeagueRankingTable() {
		
		army0Panel.fillRow(0);
		army1Panel.fillRow(1);
		army2Panel.fillRow(2);
		army3Panel.fillRow(3);
		army4Panel.fillRow(4);
		army5Panel.fillRow(5);
		army6Panel.fillRow(6);
		army7Panel.fillRow(7);
		
		
	}

}
