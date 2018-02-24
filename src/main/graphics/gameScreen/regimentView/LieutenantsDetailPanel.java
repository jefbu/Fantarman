package main.graphics.gameScreen.regimentView;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

import main.components.Colour;
import main.entity.regiments.Regiment;
import main.graphics.gameScreen.regimentView.lieutenantDetail.LieutenantDetailPanel;
import main.utility.Colors;

public class LieutenantsDetailPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	LieutenantDetailPanel lieutenantDetailPanel1;
	LieutenantDetailPanel lieutenantDetailPanel2;
	LieutenantDetailPanel lieutenantDetailPanel3;

	public LieutenantsDetailPanel(int width, int height) {

		super();
		setPreferredSize(new Dimension(width, height));
		setBackground(Colors.white);
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 5));

		lieutenantDetailPanel1 = new LieutenantDetailPanel(width / 4 - 5, height - 10, Colour.LBLUE,
				new FlowLayout(FlowLayout.LEFT, 5, 5));
		lieutenantDetailPanel2 = new LieutenantDetailPanel(width / 4 - 5, height - 10, Colour.LBLUE,
				new FlowLayout(FlowLayout.LEFT, 5, 5));
		lieutenantDetailPanel3 = new LieutenantDetailPanel(width / 4 - 5, height - 10, Colour.LBLUE,
				new FlowLayout(FlowLayout.LEFT, 5, 5));

		add(lieutenantDetailPanel1);
		add(lieutenantDetailPanel2);
		add(lieutenantDetailPanel3);

	}
	
	public void fillLieutenantsDetailPanel(Regiment regiment) {
		
		lieutenantDetailPanel1.fillLieutenantDetailPanel(1, regiment);
		lieutenantDetailPanel2.fillLieutenantDetailPanel(2, regiment);
		lieutenantDetailPanel3.fillLieutenantDetailPanel(3, regiment);		
		
	}

}
