package main.entity.regiments.wanmen;

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

public class FireMages extends Regiment {

	private static final long serialVersionUID = 1L;

	public FireMages(String name, Captain captain) {
		
		super();
		for (int i = 0; i < captain.orders; i++) {
		instructions.add(new Tactic(Condition.ALWAYS, Target.ENEMY_WEAKEST, Order.CHARGE));
		}
		
		this.name = name;
		this.regiment = "Fire Mages";
		this.race = Race.Wanmen;
		this.lieutenantsSize = 1;
		this.captain = captain;
		this.type = RegimentType.ARCHERS;
		
		this.baseAttack = 30;
		this.baseCharge = 10;
		this.baseDefence = 40;
		this.baseMissile = 30;
		this.baseMorale = 45;
		this.baseSpeed = 17;
		this.baseSpeedVariation = 5;
		this.baseRange = 10;
		this.baseMove = 6;
		this.baseRun = 4;
		this.baseLife = 10;
		
		this.rows = 2;
		this.columns = 3;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/firemages.png", width, height);
		
		weapons.add(Weapons.wands);
		weapons.add(Weapons.staves);
		weapons.add(Weapons.sceptres);
		
		armours.add(Armour.quilt);
		armours.add(Armour.halfLeather);
		
		this.weapon = Weapons.wands;
		this.armour = Armour.quilt;
		
		calculateTotalStats();
		calculateValue();
		
	}
	

}
