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

public class StoutOfHeart extends Regiment {

	private static final long serialVersionUID = 1L;

	public StoutOfHeart(String name, Captain captain, Lieutenant lt1, Lieutenant lt2) {
		
		super();
		for (int i = 0; i < captain.orders; i++) {
		instructions.add(new Tactic(Condition.ALWAYS, Target.ENEMY_WEAKEST, Order.CHARGE));
		}
		
		this.name = name;
		this.regiment = "Stout of Heart";
		this.race = Race.Piknin;
		this.lieutenantsSize = 2;
		this.captain = captain;
		this.type = RegimentType.COMBINED_ARMS;
		
		lieutenants.add(lt1);
		lieutenants.add(lt2);
		
		this.baseAttack = 35;
		this.baseCharge = 10;
		this.baseDefence = 50;
		this.baseMissile = 35;
		this.baseMorale = 50;
		this.baseSpeed = 13;
		this.baseSpeedVariation = 4;
		this.baseRange = 11;
		this.baseMove = 5;
		this.baseRun = 3;
		this.baseLife = 20;
		
		this.rows = 2;
		this.columns = 4;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/Piknin/stout_of_heart_battle.png", width, height);
		largeIcon = imageLoader.loadImageIcon("/regiments/Piknin/stout_of_heart.png", width * 8, height * 8);
		
		weapons.add(Weapons.spears);
		weapons.add(Weapons.polearms);
		
		armours.add(Armour.quilt);
		armours.add(Armour.fullleather);
		armours.add(Armour.chainvest);
		
		this.weapon = Weapons.spears;
		this.armour = Armour.quilt;
		
		calculateTotalStats();
		calculateValue();
		
	}
	
}
