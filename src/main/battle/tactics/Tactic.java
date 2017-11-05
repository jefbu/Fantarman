package main.battle.tactics;

import java.io.Serializable;

public class Tactic implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public Condition condition;
	public Target target;
	public Order order;
	
	public Tactic(Condition condition, Target target, Order order) {
		this.condition = condition;
		this.target = target;
		this.order = order;
	}
	
	public static Tactic defaultTactic = new Tactic(Condition.ALWAYS, Target.SELF, Order.RECOVER);
	

}
