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

public class Metralyadora extends Regiment {

	private static final long serialVersionUID = 1L;

	public Metralyadora(String name, Captain captain, Lieutenant lt1, Lieutenant lt2) {
		
		super();
		
		for (int i = 0; i < captain.orders; i++) {
		instructions.add(new Tactic(Condition.ALWAYS, Target.ENEMY_WEAKEST, Order.CHARGE));
		}
		
		this.name = name;
		this.regiment = "Metralyadora";
		this.race = Race.Wanmen;
		this.lieutenantsSize = 2;
		this.captain = captain;
		this.type = RegimentType.ARCHERS;
		
		lieutenants.add(lt1);
		lieutenants.add(lt2);
		
		this.baseAttack = 30;
		this.baseCharge = 5;
		this.baseDefence = 35;
		this.baseMissile = 40;
		this.baseMorale = 45;
		this.baseSpeed = 17;
		this.baseSpeedVariation = 5;
		this.baseRange = 8;
		this.baseMove = 6;
		this.baseRun = 3;
		this.baseLife = 20;
		
		this.rows = 3;
		this.columns = 3;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/firemages.png", width, height);
		
		weapons.add(Weapons.slings);
		weapons.add(Weapons.kestros);
		
		armours.add(Armour.chitin);
		
		this.weapon = Weapons.slings;
		this.armour = Armour.chitin;
		
		calculateTotalStats();
		calculateValue();
		
	}
	

}
