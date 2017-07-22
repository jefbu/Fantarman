package main.entity.regiments;

public class FireMages extends Regiment {
	
	public FireMages() {
		
		super();
		
		this.name="Firemages";
		
		this.attack = 5;
		
		this.rows = 2;
		this.columns = 3;
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/firemages.png", width, height);
		
	}
	

}
