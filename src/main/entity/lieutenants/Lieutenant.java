package main.entity.lieutenants;

import java.io.Serializable;

import main.entity.skills.Skills;

public class Lieutenant implements Serializable {

	private static final long serialVersionUID = 1L;
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
	public static Lieutenant champion = new Lieutenant("Champion", "+2 ATT", null, "ATT", 2);
	public static Lieutenant sergeant = new Lieutenant("Drill Sarge", "Discplined", Skills.Disciplined, null, 0);
	public static Lieutenant corporal = new Lieutenant("Corporal", "Leader 1", Skills.Leader1, null, 0);
	public static Lieutenant veteran = new Lieutenant("Veteran", "Leader 2", Skills.Leader2, null, 0);
	public static Lieutenant lord = new Lieutenant("Lord", "Leader 3", Skills.Leader3, null, 0);
	public static Lieutenant marksman = new Lieutenant("Marskman", "+2 MIS", null, "MIS", 2);
	public static Lieutenant bully = new Lieutenant("Bully", "+1 MOV", null, "MOV", 1);
	
}
