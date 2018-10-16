package main.entity.regiments.piknin;

import main.battle.tactics.Condition;
import main.battle.tactics.Order;
import main.battle.tactics.Tactic;
import main.battle.tactics.Target;
import main.entity.captains.Captain;
import main.entity.equipment.Armour;
import main.entity.equipment.Weapons;
import main.entity.races.Race;
import main.entity.regiments.Regiment;
import main.entity.regiments.RegimentType;

public class LightBalloons extends Regiment {

	private static final long serialVersionUID = 1L;

	public LightBalloons(String name, Captain captain) {
		
		super();
		for (int i = 0; i < captain.orders; i++) {
		instructions.add(new Tactic(Condition.ALWAYS, Target.ENEMY_WEAKEST, Order.CHARGE));
		}
		
		this.name = name;
		this.regiment = "Light Balloons";
		this.race = Race.Piknin;
		this.lieutenantsSize = 0;
		this.captain = captain;
		this.type = RegimentType.FLYING;
		
		this.baseAttack = 30;
		this.baseCharge = 25;
		this.baseDefence = 65;
		this.baseMissile = 40;
		this.baseMorale = 45;
		this.baseSpeed = 13;
		this.baseSpeedVariation = 4;
		this.baseRange = 9;
		this.baseMove = 9;
		this.baseRun = 3;
		this.baseLife = 10;
		
		this.rows = 2;
		this.columns = 3;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/Piknin/light_balloons_battle.png", width, height);
		largeIcon = imageLoader.loadImageIcon("/regiments/Piknin/light_balloons.png", width * 8, height * 8);
		
		weapons.add(Weapons.bombs);
		weapons.add(Weapons.skunkbombs);
		
		armours.add(Armour.woven);
		armours.add(Armour.mythrilenvelope);
		
		this.weapon = Weapons.bombs;
		this.armour = Armour.woven;
		
		calculateTotalStats();
		calculateValue();
		
	}
	
}
