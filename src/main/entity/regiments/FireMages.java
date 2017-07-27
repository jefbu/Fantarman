package main.entity.regiments;

public class FireMages extends Regiment {
	
	public FireMages() {
		
		super();
		
		this.name="Firemages";
		
		this.attack = 40;
		this.charge = 15;
		this.defence = 45;
		this.ballistic = 75;
		this.morale = 55;
		
		this.rows = 2;
		this.columns = 3;
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/firemages.png", width, height);
		
	}
	

}
