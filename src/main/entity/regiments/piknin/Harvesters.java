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

public class Harvesters extends Regiment {

	private static final long serialVersionUID = 1L;

	public Harvesters(String name, Captain captain, Lieutenant lt1, Lieutenant lt2) {
		
		super();
		for (int i = 0; i < captain.orders; i++) {
		instructions.add(new Tactic(Condition.ALWAYS, Target.ENEMY_WEAKEST, Order.CHARGE));
		}
		
		this.name = name;
		this.regiment = "Harvesters";
		this.race = Race.Piknin;
		this.lieutenantsSize = 2;
		this.captain = captain;
		this.type = RegimentType.LIGHT_INFANTRY;
		
		lieutenants.add(lt1);
		lieutenants.add(lt2);
		
		this.baseAttack = 30;
		this.baseCharge = 5;
		this.baseDefence = 40;
		this.baseMissile = 0;
		this.baseMorale = 40;
		this.baseSpeed = 12;
		this.baseSpeedVariation = 3;
		this.baseRange = 0;
		this.baseMove = 5;
		this.baseRun = 3;
		this.baseLife = 30;
		
		this.rows = 4;
		this.columns = 3;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/piknin/harvesters_battle.png", width, height);
		largeIcon = imageLoader.loadImageIcon("/regiments/piknin/harvesters.png", width * 8, height * 8);
		
		weapons.add(Weapons.sickles);
		weapons.add(Weapons.scythes);
		weapons.add(Weapons.flails);
		
		armours.add(Armour.quilt);
		armours.add(Armour.halfLeather);
		
		this.weapon = Weapons.sickles;
		this.armour = Armour.quilt;
		
		calculateTotalStats();
		calculateValue();
		
	}

}
