package main.strings;

public abstract class Wiki {
	
	public static String combatString = "<font face = 'arial' color = 'rgb(250, 250, 175)'>" +
	"Part 1: Basic Combat <br> <br>" +
	"<font color = 'rgb(250, 230, 230)'>" +
	"Every battle, a random <font color = 'rgb(200, 200, 250)'> map <font color = 'rgb(250, 230, 230)'> " + 
	"will be generated. The battle will start with a deployment phase, " +
	"after which the battle proper plays out. The battle will take several turns, during which every regiment will " +
	"get at least one chance to act. <br>" +
	"Regiments will try to carry out the orders that you gave them, unless of course if they're in combat, in which case " +
	"they will be far too occupied in melee. <br>" +
	"The battle ends after the last turn (which will be slightly randomised but always between 6 and 8), or if one army " +
	"has been completely annihilated. <br>" +
	"The most important thing to remember is that you, the player, will have only very limited control of how the battle " +
	"plays out. Just like a real general, you can give your regiments orders at the outset" + 
	", but as soon as things get moving, they are on their own. <br>" +
	"As such; the main gameplay in Hans Off My Army comes from preparing your plans and setting up your regiments' " +
	"orders accordingly. In a later version, minor interventions during the battle will be added to the game." +
	"<br> <br> <font color = 'rgb(250, 250, 175)'>" +
	"Part 2: The Map <br>" + 
	"<font color = 'rgb(250, 230, 230)'> The Map is randomly generated for every battle. Exciting landscapes full of hills"
	+ ", deserts, rivers and forests keep every battle a unique challenge of its own. Apart from the aesthetics; "
	+ "the map does actually serves its purpose. Every tile is designated a certain type of terrain. And every"
	+ "type of terrain has an impact on how easy it is to move over it. The map itself contains 48 by 32 tiles."
	+ "<br> In a later stage, terrain will also affect defensive capacities of <font color = 'rgb(200, 200, 250)'>"
	+ " regiments <font color  = 'rgb(250, 230, 230)'>, and will have a height that will impact lines of sight. <br>";
	
	
	
	
	public static String managementString = "<font face = 'arial' color = 'rgb(200, 180, 255)'>" +
	"Oi";
	
	
	
	public static String conceptsString = "<font face = 'arial' color = 'rgb(250, 250, 175)'>" +
	"Attack: <font color = 'rgb(250, 230, 230)'> The percentage chance of a soldier's attack to be successful. " +
	"During a melee, the active regiment will test their remaining life points times against this percentage. " +
	"For each successful roll, the defender will have to check on their " +
	"<font color = 'rgb(200, 200, 250)'> defence <font color = 'rgb(250, 230, 230)'> stat to try and prevent the damage"; 
	
	
	
	
	public static String fluffString = "<font face = 'arial' color = 'rgb(200, 220, 255)'>" +
	"blnain";
	
	
	
	public static String creditsString = "<font face = 'arial' color = 'rgb(250, 250, 175)'>" +
	"A Game by MyCompany";

}
