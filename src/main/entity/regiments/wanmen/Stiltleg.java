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

public class Stiltleg extends Regiment {

	private static final long serialVersionUID = 1L;

	public Stiltleg (String name, Captain captain, Lieutenant lt1, Lieutenant lt2, Lieutenant lt3) {
		
		super();
		for (int i = 0; i < captain.orders; i++) {
		instructions.add(new Tactic(Condition.ALWAYS, Target.ENEMY_WEAKEST, Order.CHARGE));
		}
		
		this.name = name;
		this.regiment = "Stiltleg Troop";
		this.race = Race.Wanmen;
		this.lieutenantsSize = 3;
		this.captain = captain;
		this.type = RegimentType.LIGHT_INFANTRY;
		
		lieutenants.add(lt1);
		lieutenants.add(lt2);
		lieutenants.add(lt3);
		
		this.baseAttack = 35;
		this.baseCharge = 20;
		this.baseDefence = 45;
		this.baseMissile = 0;
		this.baseMorale = 45;
		this.baseSpeed = 18;
		this.baseSpeedVariation = 6;
		this.baseRange = 0;
		this.baseMove = 6;
		this.baseRun = 5;
		this.baseLife = 20;
		
		this.rows = 2;
		this.columns = 4;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/Wanmen/stiltleg_battle.png", width, height);
		largeIcon = imageLoader.loadImageIcon("/regiments/Wanmen/stiltleg.png", width * 8, height * 8);
		
		weapons.add(Weapons.sickles);
		weapons.add(Weapons.scythes);
		weapons.add(Weapons.kukris);
		
		armours.add(Armour.chitin);

		this.weapon = Weapons.sickles;
		this.armour = Armour.chitin;
		
		calculateTotalStats();
		calculateValue();
		
	}
	
 
}
