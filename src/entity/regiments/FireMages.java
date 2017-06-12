package entity.regiments;

import components.IndexedPanel;

public class FireMages extends Regiment {
	
	
	public FireMages() {
		
		super();
		this.rows = 2;
		this.columns = 3;
		
		this.x = 0;
		this.y = 0;
		
		for (int i = 0; i < rows * columns; i++) {
			
			panels.add(new IndexedPanel());
			
		}
		
	}
	

}
