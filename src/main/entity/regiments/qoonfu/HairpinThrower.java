package main.entity.regiments.qoonfu;

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

public class HairpinThrower extends Regiment {

	private static final long serialVersionUID = 1L;

	public HairpinThrower(String name, Captain captain, Lieutenant lt1, Lieutenant lt2) {
		
		super();
		for (int i = 0; i < captain.orders; i++) {
		instructions.add(new Tactic(Condition.ALWAYS, Target.ENEMY_WEAKEST, Order.CHARGE));
		}
		
		this.name = name;
		this.regiment = "Hairpin Thrower";
		this.race = Race.Qoonfu;
		this.lieutenantsSize = 2;
		this.captain = captain;
		this.type = RegimentType.COMBINED_ARMS;
		
		lieutenants.add(lt1);
		lieutenants.add(lt2);
		
		this.baseAttack = 45;
		this.baseCharge = 10;
		this.baseDefence = 45;
		this.baseMissile = 40;
		this.baseMorale = 50;
		this.baseSpeed = 15;
		this.baseSpeedVariation = 4;
		this.baseRange = 6;
		this.baseMove = 6;
		this.baseRun = 3;
		this.baseLife = 15;
		
		this.rows = 3;
		this.columns = 3;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/Qoonfu/hairpin_battle.png", width, height);
		largeIcon = imageLoader.loadImageIcon("/regiments/Qoonfu/hairpin.png", width * 8, height * 8);
		
		weapons.add(Weapons.hairpins);
		weapons.add(Weapons.tiffanys);
		
		armours.add(Armour.quilt);

		
		this.weapon = Weapons.hairpins;
		this.armour = Armour.quilt;
		
		calculateTotalStats();
		calculateValue();
		
	}

}
