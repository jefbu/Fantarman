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

public class FatherlyTurtle extends Regiment {

	private static final long serialVersionUID = 1L;

		public FatherlyTurtle(String name, Captain captain) {
			
			super();
			for (int i = 0; i < captain.orders; i++) {
			instructions.add(new Tactic(Condition.ALWAYS, Target.ENEMY_WEAKEST, Order.CHARGE));
			}
			
			this.name = name;
			this.regiment = "Fatherly Turtle";
			this.race = Race.Piknin;
			this.lieutenantsSize = 0;
			this.captain = captain;
			this.type = RegimentType.MONSTER;
			
			this.baseAttack = 45;
			this.baseCharge = 20;
			this.baseDefence = 75;
			this.baseMissile = 0;
			this.baseMorale = 80;
			this.baseSpeed = 11;
			this.baseSpeedVariation = 3;
			this.baseRange = 0;
			this.baseMove = 5;
			this.baseRun = 1;
			this.baseLife = 10;
			
			this.rows = 2;
			this.columns = 2;
			
			panels = new int[rows * columns];
			
			this.x = 0;
			this.y = 0;
			
			icon = imageLoader.loadImageIcon("/regiments/piknin/fatherly_turtle_battle.png", width, height);
			largeIcon = imageLoader.loadImageIcon("/regiments/piknin/fatherly_turtle.png", width * 8, height * 8);
			
			weapons.add(Weapons.claws);
			weapons.add(Weapons.spikes);
			weapons.add(Weapons.razorclaws);
			
			armours.add(Armour.shell);
			armours.add(Armour.metalshell);
			
			this.weapon = Weapons.claws;
			this.armour = Armour.shell;
			
			calculateTotalStats();
			calculateValue();
			
		}
		

	}



