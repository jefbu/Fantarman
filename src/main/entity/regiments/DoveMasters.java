package main.entity.regiments;

import javax.swing.ImageIcon;

public class DoveMasters extends Regiment {
		
	public DoveMasters() {
		
		super();
		this.rows = 1;
		this.columns = 4;
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/dovemasters.png", width, height);
		
	}

}
