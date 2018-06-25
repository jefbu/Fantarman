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

public class MoneyPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	ContentPanel titlePanel;
	ContentPanel titleBarPanel;
	ContentPanel moneyPanel;

	DoubleLabeledPanel currentAmount;
	DoubleLabeledPanel income;
	DoubleLabeledPanel wages;
	DoubleLabeledPanel otherExpenses;
	DoubleLabeledPanel intrest;
	DoubleLabeledPanel projection;
	
	public MoneyPanel(int width, int height) {

		super();
		setBackground(Colors.backgroundOrange);
		setPreferredSize(new Dimension(width, height));
		setLayout(new FlowLayout(FlowLayout.CENTER, 0, 5));

		titlePanel = new ContentPanel(width / 2, height / 10, Colour.DGREEN,
				new FlowLayout(FlowLayout.CENTER, 0, height / 50));
		titlePanel.contentLabel.setForeground(Colors.textyellow);
		titlePanel.contentLabel.setFont(new Font("garamond", Font.BOLD, 28));
		titlePanel.contentLabel.setText("MONEY");
		add(titlePanel);

		titleBarPanel = new ContentPanel(width * 9 / 10, height / 10, Colour.GREEN,
				new FlowLayout(FlowLayout.LEFT, 0, height / 10 / 6));
			LabeledPanel titleBarNamePanel = new LabeledPanel(width * 6 / 10, height / 20);
			titleBarNamePanel.setBackground(Colors.green);
			titleBarNamePanel.label.setForeground(Colors.textyellow);
			titleBarNamePanel.label.setText("NAME");
			titleBarPanel.insidePanel.add(titleBarNamePanel);
			LabeledPanel titleBarAmountPanel = new LabeledPanel(width * 25 / 100, height / 20);
			titleBarAmountPanel.setBackground(Colors.green);
			titleBarAmountPanel.label.setForeground(Colors.textyellow);
			titleBarAmountPanel.label.setText("AMOUNT");
			titleBarPanel.insidePanel.add(titleBarAmountPanel);
		add(titleBarPanel);

		moneyPanel = new ContentPanel(width * 9 / 10, height * 7 / 10, Colour.LGREEN,
				new FlowLayout(FlowLayout.LEFT, 1, 0));
		add(moneyPanel);
		
		currentAmount = new DoubleLabeledPanel(width * 9 / 10, height / 10, 70, Colour.LGREEN);
		currentAmount.titleLabel.setText("Balance");
		moneyPanel.insidePanel.add(currentAmount);
		
		income = new DoubleLabeledPanel(width * 9 / 10, height / 10, 70, Colour.LGREEN);
		income.titleLabel.setText("Projected Income");
		moneyPanel.insidePanel.add(income);
		
		wages = new DoubleLabeledPanel(width * 9 / 10, height / 10, 70, Colour.LGREEN);
		wages.titleLabel.setText("Wages");
		moneyPanel.insidePanel.add(wages);
		
		otherExpenses = new DoubleLabeledPanel(width * 9 / 10, height / 10, 70, Colour.LGREEN);
		otherExpenses.titleLabel.setText("Other Expenses");
		moneyPanel.insidePanel.add(otherExpenses);
		
		intrest = new DoubleLabeledPanel(width * 9 / 10, height / 10, 70, Colour.LGREEN);
		intrest.titleLabel.setText("Intrest");
		moneyPanel.insidePanel.add(intrest);
		
		projection = new DoubleLabeledPanel(width * 9 / 10, height / 10, 70, Colour.LRED);
		projection.titleLabel.setText("Projection");
		moneyPanel.insidePanel.add(projection);
		

		
		
		
	}

	public void fillMoneyPanel(Army army) {
		
		if(army.money < 0) { currentAmount.contentLabel.setForeground(Colors.vdorange); }
		else { currentAmount.contentLabel.setForeground(Colors.vlgreen); }
		currentAmount.contentLabel.setText(Integer.toString(army.money));
		
		army.calculateIncome();
		income.contentLabel.setText(Integer.toString(army.income));
		
		army.calculateUpkeep();
		wages.contentLabel.setText(Integer.toString(army.upkeep));
		
		otherExpenses.contentLabel.setText("0");
		
		intrest.contentLabel.setText("0");
		
		int newMoney = army.money - army.upkeep + army.income;
		if(newMoney < army.money) {projection.contentLabel.setForeground(Colors.vdorange); }
		else { projection.contentLabel.setForeground(Colors.vlgreen); }
		projection.contentLabel.setText(Integer.toString(newMoney));

	}

}
