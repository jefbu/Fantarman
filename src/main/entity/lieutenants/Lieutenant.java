package main.entity.lieutenants;

import java.io.Serializable;

import main.entity.skills.Skills;

public class Lieutenant implements Serializable {

	private static final long serialVersionUID = 1L;
	public String name;
	public String bonus;
	
	Skills bonusSkill;
	
	public Lieutenant(String name, String bonus, Skills bonusSkill) {
		
		this.name = name;
		this.bonus = bonus;
		this.bonusSkill = bonusSkill;
		
	}
	
	public static Lieutenant medic = new Lieutenant("First Aid Medic", "Healer 1", Skills.Healer1);
	public static Lieutenant surgeon = new Lieutenant("Surgeon", "Healer 2", Skills.Healer2);
	public static Lieutenant Tenkai = new Lieutenant("Old Man Tenkai", "Healer 3", Skills.Healer3);
	public static Lieutenant corporal = new Lieutenant("Corporal", "Leader 1", Skills.Leader1);
	public static Lieutenant sergeant = new Lieutenant("Sergeant", "Leader 2", Skills.Leader2);
	public static Lieutenant zealot = new Lieutenant("Zealous Francisco", "Leader 3", Skills.Leader3);
	public static Lieutenant musician = new Lieutenant("Musician", "Discplined 1", Skills.Disciplined1);
	public static Lieutenant flagbearer = new Lieutenant("Standard Bearer", "Disciplined 2", Skills.Disciplined2);
	public static Lieutenant emperor = new Lieutenant("Little Emperor", "Disciplined 3", Skills.Disciplined3);
	
}
