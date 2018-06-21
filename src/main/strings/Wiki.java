package main.strings;

public abstract class Wiki {

	public static String combatString = "<font face = 'arial' color = 'rgb(250, 250, 175)'>"
			+ "Part 1: Basic Combat <br> <br>" + "<font color = 'rgb(250, 230, 230)'>"
			+ "In Homa, you have no direct control over the battle. The regiments will attempt to perform their orders <br> "
			+ "(as given during the management stage), starting with the first and moving down."
			+ "The battle lasts between 6 and 8 turns. During every turn, every regiment gets a chance to act at least once, <br>"
			+ "sometimes twice depending on their speed. Regiments in combat will be locked in melee until this is resolved, <br>"
			+ "after which they will continue carrying out their orders as before." + "<br> <br>"
			+ "<font color = 'rgb(250, 250, 175)'>" + "Part 2: The Map <br> <br> "
			+ "<font color = 'rgb(250, 230, 230)'>"
			+ "For every battle, a new map is randomly generated. Every tile in the map contains a certain terrain, "
			+ "which decides how hard it is to move over.";

	public static String managementString = "<font face = 'arial' color = 'rgb(250, 230, 230)'>"
			+ "The most important screen is the army overview, where you can see your regiments and assign them roles. <br>"
			+ "You can assign eight regiments into a combat role, these will be the ones to participate in battle. <br>"
			+ "Clicking on a specific regiment will bring you to its overview screen, where you can change some equipment options,"
			+ " and most of all, assign the regiment's orders." + "<br> <br>"
			+ "These orders follow a format of condition - target - order. During the battle, every time the regiment gets its turn,"
			+ "it will attempt to carry out an order. It starts with the topmost order (some regiments have more intelligent"
			+ " captains and as such get more orders), checks the condition and if this one is valid, "
			+ "attempts to carry out the order, aimed at the chosen target.";

	public static String conceptsString = "<font face = 'arial' color = 'rgb(250, 250, 175)'>"
			+ "Attack: <font color = 'rgb(250, 230, 230)'> The percentage chance of a soldier's attack to be successful. "
			+ "During a melee, the active regiment will test their remaining life points times against this percentage. "
			+ "For each successful roll, the defender will have to check on their "
			+ "<font color = 'rgb(200, 200, 250)'> defence <font color = 'rgb(250, 230, 230)'> stat to try and prevent the damage";

	public static String fluffString = "<font face = 'arial' color = 'rgb(250, 230, 230)'>" + "Nothing here yet.";

	public static String creditsString = "<font face = 'arial' color = 'rgb(250, 230, 230)'>" + "A Game by Ekster Games";

}
