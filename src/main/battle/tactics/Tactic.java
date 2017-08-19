package main.battle.tactics;

public class Tactic {
	
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
