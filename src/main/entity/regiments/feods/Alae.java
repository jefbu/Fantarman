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

public class Alae extends Regiment {

	private static final long serialVersionUID = 1L;

	public Alae(String name, Captain captain, Lieutenant lt1, Lieutenant lt2) {
		
		super();
		for (int i = 0; i < captain.orders; i++) {
		instructions.add(new Tactic(Condition.ALWAYS, Target.ENEMY_STRONGEST, Order.FIRE));
		}
		
		this.name = name;
		this.regiment = "Alae";
		this.race = Race.Feods;
		this.lieutenantsSize = 2;
		this.captain = captain;
		this.type = RegimentType.LIGHT_CAVALRY;
		
		lieutenants.add(lt1);
		lieutenants.add(lt2);
				
		this.baseAttack = 35;
		this.baseCharge = 25;
		this.baseDefence = 50;
		this.baseMissile = 0;
		this.baseMorale = 55;
		this.baseSpeed = 15;
		this.baseSpeedVariation = 5;
		this.baseRange = 0;
		this.baseMove = 6;
		this.baseRun = 7;
		this.baseLife = 10;
		
		this.rows = 2;
		this.columns = 3;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/feods/light_battle.png", width, height);
		largeIcon = imageLoader.loadImageIcon("/regiments/feods/light.png", width * 8, height * 8);
		
		weapons.add(Weapons.lances);
		weapons.add(Weapons.twohanders);
		
		armours.add(Armour.halfPlate);
		armours.add(Armour.plate);
		armours.add(Armour.chainMail);
		
		this.weapon = Weapons.spears;
		this.armour = Armour.halfLeather;
		
		calculateTotalStats();
		calculateValue();
		
	}

}
