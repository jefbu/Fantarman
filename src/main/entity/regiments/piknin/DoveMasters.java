package main.entity.regiments.piknin;

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

public class DoveMasters extends Regiment {

	private static final long serialVersionUID = 1L;

	public DoveMasters(String name, Captain captain, Lieutenant lt1) {
		
		super();
		for (int i = 0; i < captain.orders; i++) {
		instructions.add(new Tactic(Condition.ALWAYS, Target.ENEMY_STRONGEST, Order.FIRE));
		}
		
		this.name = name;
		this.regiment = "Dove Masters";
		this.race = Race.Piknin;
		this.lieutenantsSize = 1;
		this.captain = captain;
		this.type = RegimentType.ARCHERS;
		
		lieutenants.add(lt1);
				
		this.baseAttack = 35;
		this.baseCharge = 5;
		this.baseDefence = 40;
		this.baseMissile = 50;
		this.baseMorale = 40;
		this.baseSpeed = 13;
		this.baseSpeedVariation = 4;
		this.baseRange = 13;
		this.baseMove = 5;
		this.baseRun = 3;
		this.baseLife = 10;
		
		this.rows = 1;
		this.columns = 4;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/Piknin/dovemasters_battle.png", width, height);
		largeIcon = imageLoader.loadImageIcon("/regiments/Piknin/dovemasters.png", width * 8, height * 8);
		
		weapons.add(Weapons.pigeons);
		weapons.add(Weapons.elitePigeons);
		weapons.add(Weapons.thoroughbredPigeons);
		weapons.add(Weapons.turtledoves);
		
		armours.add(Armour.quilt);
		armours.add(Armour.halfLeather);
		armours.add(Armour.leather);
		
		this.weapon = Weapons.pigeons;
		this.armour = Armour.quilt;
		
		calculateTotalStats();
		calculateValue();
		
	}

}
