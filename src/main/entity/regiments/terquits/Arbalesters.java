package main.entity.regiments.terquits;

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

public class Arbalesters extends Regiment {

	private static final long serialVersionUID = 1L;

	public Arbalesters(String name, Captain captain, Lieutenant lt1, Lieutenant lt2) {
		
		super();
		for (int i = 0; i < captain.orders; i++) {
		instructions.add(new Tactic(Condition.ALWAYS, Target.ENEMY_WEAKEST, Order.CHARGE));
		}
		
		this.name = name;
		this.regiment = "Arbalesters";
		this.race = Race.Terquit;
		this.lieutenantsSize = 2;
		this.captain = captain;
		lieutenants.add(lt1);
		lieutenants.add(lt2);
		this.type = RegimentType.COMBINED_ARMS;
		
		this.baseAttack = 50;
		this.baseCharge = 5;
		this.baseDefence = 60;
		this.baseMissile = 45;
		this.baseMorale = 80;
		this.baseSpeed = 12;
		this.baseSpeedVariation = 4;
		this.baseRange = 6;
		this.baseMove = 5;
		this.baseRun = 2;
		this.baseLife = 30;
		
		this.rows = 4;
		this.columns = 3;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/Terquit/arbalesters_battle.png", width, height);
		largeIcon = imageLoader.loadImageIcon("/regiments/Terquit/arbalesters.png", width * 8, height * 8);
		
		weapons.add(Weapons.fists);
		armours.add(Armour.clay);
		armours.add(Armour.porcelain);
		
		this.weapon = Weapons.fists;
		this.armour = Armour.clay;
		
		calculateTotalStats();
		calculateValue();
		
	}

}
