package main.entity.regiments.feods;

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

public class Equitae extends Regiment {
	
	private static final long serialVersionUID = 1L;

	public Equitae(String name, Captain captain, Lieutenant lt1, Lieutenant lt2, Lieutenant lt3) {
		
		super();
		for (int i = 0; i < captain.orders; i++) {
		instructions.add(new Tactic(Condition.ALWAYS, Target.ENEMY_STRONGEST, Order.FIRE));
		}
		
		this.name = name;
		this.regiment = "Equitae";
		this.race = Race.Feods;
		this.lieutenantsSize = 3;
		this.captain = captain;
		this.type = RegimentType.HEAVY_CAVALRY;
		
		lieutenants.add(lt1);
		lieutenants.add(lt2);
		lieutenants.add(lt3);
				
		this.baseAttack = 50;
		this.baseCharge = 30;
		this.baseDefence = 50;
		this.baseMissile = 0;
		this.baseMorale = 60;
		this.baseSpeed = 14;
		this.baseSpeedVariation = 5;
		this.baseRange = 0;
		this.baseMove = 6;
		this.baseRun = 6;
		this.baseLife = 15;
		
		this.rows = 2;
		this.columns = 4;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/feods/garland_battle.png", width, height);
		largeIcon = imageLoader.loadImageIcon("/regiments/feods/garland.png", width * 8, height * 8);
		
		weapons.add(Weapons.lances);
		
		armours.add(Armour.halfPlate);
		armours.add(Armour.plate);
		
		this.weapon = Weapons.lances;
		this.armour = Armour.halfPlate;
		
		calculateTotalStats();
		calculateValue();
		
	}

}
