package main.AI.orders;

import main.battle.tactics.Condition;
import main.battle.tactics.Order;
import main.battle.tactics.Target;
import main.entity.regiments.Regiment;

public class DefensiveFighter {

	public static void giveOrders(Regiment regiment) {
		
		switch(regiment.captain.orders) {
		
		case 1: 
			regiment.instructions.get(0).condition = Condition.ALWAYS;
			regiment.instructions.get(0).target = Target.ENEMY_NEAREST;
			regiment.instructions.get(0).order = Order.CHARGE;
			break;
			
		case 2:
			regiment.instructions.get(0).condition = Condition.After_2_Turns;
			regiment.instructions.get(0).target = Target.ENEMY_NEAREST;
			regiment.instructions.get(0).order = Order.CHARGE;
			
			regiment.instructions.get(1).condition = Condition.ALWAYS;
			regiment.instructions.get(1).target = Target.SELF;
			regiment.instructions.get(1).order = Order.RECOVER;
			break;
			
		case 3:
			regiment.instructions.get(0).condition = Condition.Life_under_25;
			regiment.instructions.get(0).target = Target.SELF;
			regiment.instructions.get(0).order = Order.RECOVER;
			
			regiment.instructions.get(1).condition = Condition.After_2_Turns;
			regiment.instructions.get(1).target = Target.ENEMY_NEAREST;
			regiment.instructions.get(1).order = Order.CHARGE;
			
			regiment.instructions.get(2).condition = Condition.ALWAYS;
			regiment.instructions.get(2).target = Target.SELF;
			regiment.instructions.get(2).order = Order.RECOVER;
			break;
			
		case 4:
			regiment.instructions.get(0).condition = Condition.Life_under_25;
			regiment.instructions.get(0).target = Target.SELF;
			regiment.instructions.get(0).order = Order.RECOVER;
			
			regiment.instructions.get(1).condition = Condition.After_3_Turns;
			regiment.instructions.get(1).target = Target.ENEMY_NEAREST;
			regiment.instructions.get(1).order = Order.CHARGE;
			
			regiment.instructions.get(2).condition = Condition.After_2_Turns;
			regiment.instructions.get(2).target = Target.ENEMY_NEAREST;
			regiment.instructions.get(2).order = Order.Move_to;
			
			regiment.instructions.get(3).condition = Condition.ALWAYS;
			regiment.instructions.get(3).target = Target.SELF;
			regiment.instructions.get(3).order = Order.RECOVER;
			break;
			
		default:
			System.out.println("Error at Defensive Fighter AI orders, " + regiment.captain.orders + " orders found");
			System.out.println("at " + regiment.name + " and captain " + regiment.captain.name);
			break;
		
		}
		
	}
	
}
