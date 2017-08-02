package main.entity.regiments;

public class DoveMasters extends Regiment {
		
	public DoveMasters() {
		
		super();
		
		this.name = "Dovemasters";
		
		this.attack = 30;
		this.charge = 10;
		this.defence = 30;
		this.ballistic = 50;
		this.morale = 40;
		
		
		this.rows = 1;
		this.columns = 4;
		
		panels = new int[rows * columns];
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/dovemasters.png", width, height);
		
	}

}
