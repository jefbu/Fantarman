package main.entity.lieutenants;

import main.entity.skills.Skills;

public class Lieutenant {

	public String name;
	public String bonus;
	
	Skills bonusSkill;
	String stat;
	int bonusStat;
	
	public Lieutenant(String name, String bonus, Skills bonusSkill, String stat, int bonusStat) {
		
		this.name = name;
		this.bonus = bonus;
		this.bonusSkill = bonusSkill;
		this.stat = stat;
		this.bonusStat = bonusStat;
		
	}
	
	public static Lieutenant Tenkai = new Lieutenant("Old Man Tenkai", "Healer 3", Skills.Healer3, null, 0);
	public static Lieutenant mendicant = new Lieutenant("Mendicant", "Healer 2", Skills.Healer2, null, 0);
	public static Lieutenant medic = new Lieutenant("First Aid Medic", "Healer 1", Skills.Healer1, null, 0);
	public static Lieutenant champion = new Lieutenant("Champion", "+2 ATT", null, "ATT", 3);
	
}
