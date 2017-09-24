package main.graphics.gameScreen.regimentView;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

import main.components.Colour;
import main.entity.regiments.Regiment;
import main.graphics.gameScreen.regimentView.lieutenantDetail.LieutenantDetailPanel;

public class LieutenantsDetailPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public LieutenantsDetailPanel(int width, int height) {

		super();
		setPreferredSize(new Dimension(width, height));
		setBackground(new Color(170, 190, 255));
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 5));

		LieutenantDetailPanel lieutenantDetailPanel1 = new LieutenantDetailPanel(width / 4 - 5, height - 10, Colour.LBLUE,
				new FlowLayout(FlowLayout.LEFT, 5, 5));
		LieutenantDetailPanel lieutenantDetailPanel2 = new LieutenantDetailPanel(width / 4 - 5, height - 10, Colour.LBLUE,
				new FlowLayout(FlowLayout.LEFT, 5, 5));
		LieutenantDetailPanel lieutenantDetailPanel3 = new LieutenantDetailPanel(width / 4 - 5, height - 10, Colour.LBLUE,
				new FlowLayout(FlowLayout.LEFT, 5, 5));

		add(lieutenantDetailPanel1);
		add(lieutenantDetailPanel2);
		add(lieutenantDetailPanel3);

	}
	
	public void fillLieutenantsDetailPanel(Regiment regiment) {
		
		
	}

}
