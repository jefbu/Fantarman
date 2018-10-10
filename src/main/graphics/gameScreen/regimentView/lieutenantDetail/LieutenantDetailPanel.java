package main.graphics.gameScreen.regimentView.lieutenantDetail;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import main.components.ContentPanel;
import main.components.LabeledPanel;
import main.entity.regiments.Regiment;
import main.utility.Colors;
import main.utility.ImageLoader;

public class LieutenantDetailPanel extends ContentPanel {

	private static final long serialVersionUID = 1L;
	private ImageLoader imageLoader;
	public JLabel portrait;
	private int width;
	private int height;
	private JPanel iconPanel;
	private JPanel textPanel;
	private LabeledPanel namePanel;
	private LabeledPanel skillPanel;

	public LieutenantDetailPanel(int width, int height, Color colour, FlowLayout flowLayout) {

		super(width, height, colour, flowLayout);
		imageLoader = new ImageLoader();

		this.width = width;
		this.height = height;

		iconPanel = new JPanel();
		iconPanel.setPreferredSize(new Dimension(width * 3 / 10, height * 65 / 100));
		iconPanel.setBackground(Colors.dgrey);
		iconPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		insidePanel.add(iconPanel);

		portrait = new JLabel();
		iconPanel.add(portrait);
		
		textPanel = new JPanel();
		textPanel.setPreferredSize(new Dimension(width * 6 / 10, height * 65 / 100));
		textPanel.setBackground(Colors.dgrey);
		textPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		insidePanel.add(textPanel);	
		
		namePanel = new LabeledPanel(width * 6 / 10, height * 30 / 100);
		namePanel.setBackground(Colors.dgrey);
		namePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		namePanel.label.setForeground(Colors.vlgrey);
		textPanel.add(namePanel);

		skillPanel = new LabeledPanel(width * 6 / 10, height * 35 / 100);
		skillPanel.setBackground(Colors.dgrey);
		skillPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		skillPanel.label.setForeground(Colors.vlgrey);
		textPanel.add(skillPanel);

	}

	public void fillLieutenantDetailPanel(int order, Regiment regiment) {

		setVisible(false);

		if (order <= regiment.lieutenantsSize) {
			portrait.setIcon(imageLoader.loadImageIcon(regiment.lieutenants.get(order - 1).imagePath, width * 3 / 10,
					height * 65 / 100));
			namePanel.label.setText(regiment.lieutenants.get(order - 1).name);
			skillPanel.label.setText(regiment.lieutenants.get(order - 1).bonus);
			setVisible(true);
		}

	}

}
