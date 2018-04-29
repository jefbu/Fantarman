package main.graphics.gameScreen.armyView;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JPanel;

import main.Main;
import main.components.ButtonedPanel;
import main.entity.regiments.Regiment;
import main.graphics.Screen;
import main.utility.Colors;

public class TitlePanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	ButtonedPanel namePanel;
	ButtonedPanel onePanel;
	ButtonedPanel twoPanel;
	ButtonedPanel threePanel;
	ButtonedPanel fourPanel;
	ButtonedPanel fivePanel;
	ButtonedPanel sixPanel;
	ButtonedPanel sevenPanel;
	ButtonedPanel eightPanel;
	ButtonedPanel ninePanel;
	ButtonedPanel tenPanel;
	
	private boolean topDown;
	

	public TitlePanel(int width, int height) {
		
		super();
		setPreferredSize(new Dimension(width, height));
		setBackground(new Color(45, 90, 135));
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		
		namePanel = new ButtonedPanel(width / 6, height, Colors.vlblue);
		namePanel.label.setForeground(Colors.vlblue);
		add(namePanel);
		
		onePanel = new ButtonedPanel(width / 12, height, Colors.vlblue);
		onePanel.label.setForeground(Colors.vlblue);
		add(onePanel);
		
		twoPanel = new ButtonedPanel(width / 12, height, Colors.vlblue);
		twoPanel.label.setForeground(Colors.vlblue);
		add(twoPanel);
		
		threePanel = new ButtonedPanel(width / 12, height, Colors.vlblue);
		threePanel.label.setForeground(Colors.vlblue);
		add(threePanel);
		
		fourPanel = new ButtonedPanel(width / 12, height, Colors.vlblue);
		fourPanel.label.setForeground(Colors.vlblue);
		add(fourPanel);
		
		fivePanel = new ButtonedPanel(width / 12, height, Colors.vlblue);
		fivePanel.label.setForeground(Colors.vlblue);
		add(fivePanel);
		
		sixPanel = new ButtonedPanel(width / 12, height, Colors.vlblue);
		sixPanel.label.setForeground(Colors.vlblue);
		add(sixPanel);
		
		sevenPanel = new ButtonedPanel(width / 12, height, Colors.vlblue);
		sevenPanel.label.setForeground(Colors.vlblue);
		add(sevenPanel);
		
		eightPanel = new ButtonedPanel(width / 12, height, Colors.vlblue);
		eightPanel.label.setForeground(Colors.vlblue);
		add(eightPanel);
		
		ninePanel = new ButtonedPanel(width / 12, height, Colors.vlblue);
		ninePanel.label.setForeground(Colors.vlblue);
		add(ninePanel);
		
		tenPanel = new ButtonedPanel(width / 12, height, Colors.vlblue);
		tenPanel.label.setForeground(Colors.vlblue);
		add(tenPanel);
	}


	public void fillTitlePanel(int number, boolean editable) {
		switch (number) {
		case 0: 
			namePanel.label.setText("Name");
			onePanel.label.setText("Life");
			twoPanel.label.setText("Move");
			threePanel.label.setText("Run");
			fourPanel.label.setText("Speed");
			fivePanel.label.setText("Attack");
			sixPanel.label.setText("Charge");
			sevenPanel.label.setText("Defence");
			eightPanel.label.setText("Range");
			ninePanel.label.setText("Missile");
			tenPanel.label.setText("Morale");
			
		try {
				namePanel.button.removeActionListener(namePanel.button.getActionListeners()[0]);
			} catch(Exception e) {}
		try {
			onePanel.button.removeActionListener(onePanel.button.getActionListeners()[0]);
		} catch(Exception e) {}
		try {
			twoPanel.button.removeActionListener(twoPanel.button.getActionListeners()[0]);
		} catch(Exception e) {}
		try {
			threePanel.button.removeActionListener(threePanel.button.getActionListeners()[0]);
		} catch(Exception e) {}
		try {
			fourPanel.button.removeActionListener(fourPanel.button.getActionListeners()[0]);
		} catch(Exception e) {}
		try {
			fivePanel.button.removeActionListener(fivePanel.button.getActionListeners()[0]);
		} catch(Exception e) {}
		try {
			sixPanel.button.removeActionListener(sixPanel.button.getActionListeners()[0]);
		} catch(Exception e) {}
		try {
			sevenPanel.button.removeActionListener(sevenPanel.button.getActionListeners()[0]);
		} catch(Exception e) {}
		try {
			eightPanel.button.removeActionListener(eightPanel.button.getActionListeners()[0]);
		} catch(Exception e) {}
		try {
			ninePanel.button.removeActionListener(ninePanel.button.getActionListeners()[0]);
		} catch(Exception e) {}
		try {
			tenPanel.button.removeActionListener(tenPanel.button.getActionListeners()[0]);
		} catch(Exception e) {}


		if (editable) {
			
			if(topDown) {
			namePanel.button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Collections.sort(Main.yourArmy.roster, new Comparator<Regiment>() {
						@Override
						public int compare(Regiment o1, Regiment o2) {
							return o1.name.compareTo(o2.name);
						}
					});
					topDown = false;
					Screen.gameScreen.mainPanel.armyView.fillArmyView(Main.yourArmy);
				}
			});
			} else {
				namePanel.button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Collections.sort(Main.yourArmy.roster, new Comparator<Regiment>() {
							@Override
							public int compare(Regiment o1, Regiment o2) {
								return o2.name.compareTo(o1.name);
							}
						});
						topDown = true;
						Screen.gameScreen.mainPanel.armyView.fillArmyView(Main.yourArmy);
					}
				});
			}
			
		
			if(topDown) {
			onePanel.button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Collections.sort(Main.yourArmy.roster, new Comparator<Regiment>() {
						@Override
						public int compare(Regiment o1, Regiment o2) {
							return o1.totalLife - o2.totalLife;
						}
					});
					topDown = false;
					Screen.gameScreen.mainPanel.armyView.fillArmyView(Main.yourArmy);
				}
			});
			} else {
				onePanel.button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Collections.sort(Main.yourArmy.roster, new Comparator<Regiment>() {
							@Override
							public int compare(Regiment o1, Regiment o2) {
								return o2.totalLife - o1.totalLife;
							}
						});
						topDown = true;
						Screen.gameScreen.mainPanel.armyView.fillArmyView(Main.yourArmy);
					}
				});
			}
			
			if(topDown) {
			twoPanel.button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Collections.sort(Main.yourArmy.roster, new Comparator<Regiment>() {
						@Override
						public int compare(Regiment o1, Regiment o2) {
							return o1.totalMove - o2.totalMove;
						}
					});
					topDown = false;
					Screen.gameScreen.mainPanel.armyView.fillArmyView(Main.yourArmy);
				}
			});
			} else {
				twoPanel.button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Collections.sort(Main.yourArmy.roster, new Comparator<Regiment>() {
							@Override
							public int compare(Regiment o1, Regiment o2) {
								return o2.totalMove - o1.totalMove;
							}
						});
						topDown = true;
						Screen.gameScreen.mainPanel.armyView.fillArmyView(Main.yourArmy);
					}
				});
			}
			
			if(topDown) {
			threePanel.button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Collections.sort(Main.yourArmy.roster, new Comparator<Regiment>() {
						@Override
						public int compare(Regiment o1, Regiment o2) {
							return o1.totalRun - o2.totalRun;
						}
					});
					topDown = false;
					Screen.gameScreen.mainPanel.armyView.fillArmyView(Main.yourArmy);
				}
			});
			} else {
				threePanel.button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Collections.sort(Main.yourArmy.roster, new Comparator<Regiment>() {
							@Override
							public int compare(Regiment o1, Regiment o2) {
								return o2.totalRun - o1.totalRun;
							}
						});
						topDown = true;
						Screen.gameScreen.mainPanel.armyView.fillArmyView(Main.yourArmy);
					}
				});
			}
			
			if(topDown) {
			fourPanel.button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Collections.sort(Main.yourArmy.roster, new Comparator<Regiment>() {
						@Override
						public int compare(Regiment o1, Regiment o2) {
							return o1.totalSpeed - o2.totalSpeed;
						}
					});
					topDown = false;
					Screen.gameScreen.mainPanel.armyView.fillArmyView(Main.yourArmy);
				}
			});
			} else {
				fourPanel.button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Collections.sort(Main.yourArmy.roster, new Comparator<Regiment>() {
							@Override
							public int compare(Regiment o1, Regiment o2) {
								return o2.totalSpeed - o1.totalSpeed;
							}
						});
						topDown = true;
						Screen.gameScreen.mainPanel.armyView.fillArmyView(Main.yourArmy);
					}
				});
			}
			
			if(topDown) {
			fivePanel.button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Collections.sort(Main.yourArmy.roster, new Comparator<Regiment>() {
						@Override
						public int compare(Regiment o1, Regiment o2) {
							return o1.totalAttack - o2.totalAttack;
						}
					});
					topDown = false;
					Screen.gameScreen.mainPanel.armyView.fillArmyView(Main.yourArmy);
				}
			});
			} else {
				fivePanel.button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Collections.sort(Main.yourArmy.roster, new Comparator<Regiment>() {
							@Override
							public int compare(Regiment o1, Regiment o2) {
								return o2.totalAttack- o1.totalAttack;
							}
						});
						topDown = true;
						Screen.gameScreen.mainPanel.armyView.fillArmyView(Main.yourArmy);
					}
				});
			}
			
			if(topDown) {
			sixPanel.button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Collections.sort(Main.yourArmy.roster, new Comparator<Regiment>() {
						@Override
						public int compare(Regiment o1, Regiment o2) {
							return o1.totalCharge- o2.totalCharge;
						}
					});
					topDown = false;
					Screen.gameScreen.mainPanel.armyView.fillArmyView(Main.yourArmy);
				}
			});
			} else {
				sixPanel.button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Collections.sort(Main.yourArmy.roster, new Comparator<Regiment>() {
							@Override
							public int compare(Regiment o1, Regiment o2) {
								return o2.totalCharge - o1.totalCharge;
							}
						});
						topDown = true;
						Screen.gameScreen.mainPanel.armyView.fillArmyView(Main.yourArmy);
					}
				});
			}
			
			if(topDown) {
			sevenPanel.button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Collections.sort(Main.yourArmy.roster, new Comparator<Regiment>() {
						@Override
						public int compare(Regiment o1, Regiment o2) {
							return o1.totalDefence - o2.totalDefence;
						}
					});
					topDown = false;
					Screen.gameScreen.mainPanel.armyView.fillArmyView(Main.yourArmy);
				}
			});
			} else {
				sevenPanel.button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Collections.sort(Main.yourArmy.roster, new Comparator<Regiment>() {
							@Override
							public int compare(Regiment o1, Regiment o2) {
								return o2.totalDefence - o1.totalDefence;
							}
						});
						topDown = true;
						Screen.gameScreen.mainPanel.armyView.fillArmyView(Main.yourArmy);
					}
				});
			}
			
			if(topDown) {
			eightPanel.button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Collections.sort(Main.yourArmy.roster, new Comparator<Regiment>() {
						@Override
						public int compare(Regiment o1, Regiment o2) {
							return o1.totalRange - o2.totalRange;
						}
					});
					topDown = false;
					Screen.gameScreen.mainPanel.armyView.fillArmyView(Main.yourArmy);
				}
			});
			} else {
				eightPanel.button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Collections.sort(Main.yourArmy.roster, new Comparator<Regiment>() {
							@Override
							public int compare(Regiment o1, Regiment o2) {
								return o2.totalRange - o1.totalRange;
							}
						});
						topDown = true;
						Screen.gameScreen.mainPanel.armyView.fillArmyView(Main.yourArmy);
					}
				});
			}
			
			if(topDown) {
			ninePanel.button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Collections.sort(Main.yourArmy.roster, new Comparator<Regiment>() {
						@Override
						public int compare(Regiment o1, Regiment o2) {
							return o1.totalMissile - o2.totalMissile;
						}
					});
					topDown = false;
					Screen.gameScreen.mainPanel.armyView.fillArmyView(Main.yourArmy);
				}
			});
			} else {
				ninePanel.button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Collections.sort(Main.yourArmy.roster, new Comparator<Regiment>() {
							@Override
							public int compare(Regiment o1, Regiment o2) {
								return o2.totalMissile - o1.totalMissile;
							}
						});
						topDown = true;
						Screen.gameScreen.mainPanel.armyView.fillArmyView(Main.yourArmy);
					}
				});
			}
			
			if(topDown) {
			tenPanel.button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Collections.sort(Main.yourArmy.roster, new Comparator<Regiment>() {
						@Override
						public int compare(Regiment o1, Regiment o2) {
							return o1.totalMorale - o2.totalMorale;
						}
					});
					topDown = false;
					Screen.gameScreen.mainPanel.armyView.fillArmyView(Main.yourArmy);
				}
			});
			} else {
				tenPanel.button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Collections.sort(Main.yourArmy.roster, new Comparator<Regiment>() {
							@Override
							public int compare(Regiment o1, Regiment o2) {
								return o2.totalMorale - o1.totalMorale;
							}
						});
						topDown = true;
						Screen.gameScreen.mainPanel.armyView.fillArmyView(Main.yourArmy);
					}
				});
			}
		}
			break;
		}
	}
	
	public void fillTitlePanel() {
		namePanel.label.setText("Name");
	}

}

