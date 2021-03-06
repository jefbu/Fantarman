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

public class Glasscannon extends Regiment {
	

	private static final long serialVersionUID = 1L;

	public Glasscannon(String name, Captain captain, Lieutenant lt1, Lieutenant lt2) {
		
		super();
		for (int i = 0; i < captain.orders; i++) {
		instructions.add(new Tactic(Condition.ALWAYS, Target.ENEMY_WEAKEST, Order.CHARGE));
		}
		
		this.name = name;
		this.regiment = "Glasscannon Cavalry";
		this.race = Race.Wanmen;
		this.lieutenantsSize = 2;
		this.captain = captain;
		this.type = RegimentType.HEAVY_CAVALRY;
		
		lieutenants.add(lt1);
		lieutenants.add(lt2);
		
		this.baseAttack = 40;
		this.baseCharge = 40;
		this.baseDefence = 55;
		this.baseMissile = 0;
		this.baseMorale = 50;
		this.baseSpeed = 17;
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
		
		icon = imageLoader.loadImageIcon("/regiments/Wanmen/glasscannon_battle.png", width, height);
		largeIcon = imageLoader.loadImageIcon("/regiments/Wanmen/glasscannon.png", width * 8, height * 8);
		
		weapons.add(Weapons.glaives);
		weapons.add(Weapons.scythes);
		
		armours.add(Armour.chitin);
		armours.add(Armour.moult);
		
		this.weapon = Weapons.glaives;
		this.armour = Armour.chitin;
		
		calculateTotalStats();
		calculateValue();
		
	}

}
