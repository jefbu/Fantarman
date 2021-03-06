package main.entity.regiments.wanmen;

import main.battle.tactics.Condition;
import main.battle.tactics.Order;
import main.battle.tactics.Tactic;
import main.battle.tactics.Target;
import main.entity.captains.Captain;
import main.entity.equipment.Armour;
import main.entity.equipment.Weapons;
import main.entity.lieutenants.Lieutenant;
import main.entity.races.Race;
import main.entity.regiments.Regiment;
import main.entity.regiments.RegimentType;

public class Stoopvarmint extends Regiment {
	
	private static final long serialVersionUID = 1L;

	public Stoopvarmint(String name, Captain captain, Lieutenant lt1, Lieutenant lt2) {
		
		super();
		for (int i = 0; i < captain.orders; i++) {
		instructions.add(new Tactic(Condition.ALWAYS, Target.ENEMY_WEAKEST, Order.CHARGE));
		}
		
		this.name = name;
		this.regiment = "Stoopvarmint Rider";
		this.race = Race.Wanmen;
		this.lieutenantsSize = 2;
		this.captain = captain;
		this.type = RegimentType.LIGHT_CAVALRY;
		
		lieutenants.add(lt1);
		lieutenants.add(lt2);
		
		this.baseAttack = 35;
		this.baseCharge = 25;
		this.baseDefence = 50;
		this.baseMissile = 0;
		this.baseMorale = 50;
		this.baseSpeed = 17;
		this.baseSpeedVariation = 6;
		this.baseRange = 0;
		this.baseMove = 7;
		this.baseRun = 8;
		this.baseLife = 10;
		
		this.rows = 1;
		this.columns = 4;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/Wanmen/stoopvarmint_battle.png", width, height);
		largeIcon = imageLoader.loadImageIcon("/regiments/Wanmen/stoopvarmint.png", width * 8, height * 8);
		
		weapons.add(Weapons.glaives);
		weapons.add(Weapons.scythes);
		
		armours.add(Armour.chitin);
		
		this.weapon = Weapons.glaives;
		this.armour = Armour.chitin;
		
		calculateTotalStats();
		calculateValue();
			
		
	}

}
