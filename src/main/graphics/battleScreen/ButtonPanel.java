package main.graphics.battleScreen;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.battle.BattleConclusion;
import main.battle.BattleOrchestrator;
import main.components.ButtonedIconPanel;
import main.components.Colour;
import main.entity.armies.Army;
import main.entity.captains.Generic;
import main.entity.regiments.wanmen.FireMages;
import main.utility.Colors;

public class ButtonPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	public JButton exitButton;

	public ButtonPanel(int battleScreenWidth, int battleScreenHeight) {

		super();
		
		int roundedHeight = battleScreenHeight * 2 / 10 + ((battleScreenHeight * 8 / 10) % 48);
		int roundedWidth = battleScreenWidth * 10 / 100;

		setPreferredSize(new Dimension(roundedWidth, roundedHeight));
		setBackground(Colors.dgrey);
		setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		
		ButtonedIconPanel click = new ButtonedIconPanel(roundedWidth, roundedHeight, "/icons/giveUpButton.png",
				"/icons/giveUpHoveredButton.png");
		add(click);
		
		click.button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				BattleOrchestrator.timer.stop();
				Army loserArmy = new Army();
				loserArmy.value = 1;
				Army winnerArmy = new Army();
				winnerArmy.value = 100;
				winnerArmy.roster.add(new FireMages("Test", new Generic(), null));
				BattleConclusion battleConclusion = new BattleConclusion(Colour.DGREY, loserArmy, winnerArmy);
				battleConclusion.setVisible(true);

			}

		});

	}

}
