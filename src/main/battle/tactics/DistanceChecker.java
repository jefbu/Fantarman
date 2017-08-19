package main.battle.tactics;

import main.entity.regiments.Regiment;

public class DistanceChecker {
	
	public static int checkVerticalDistance(Regiment regiment, Regiment target) {
		int distanceUp = checkDistanceUp(regiment, target);
		int distanceDown = checkDistanceDown(regiment, target);
		return distanceUp + distanceDown;		
	}
	
	public static int checkHorizontalDistance(Regiment regiment, Regiment target) {
		int distanceLeft = checkDistanceLeft(regiment, target);
		int distanceRight = checkDistanceRight(regiment, target);
		return distanceLeft + distanceRight;		
	}
	
	public static int checkDistanceUp(Regiment regiment, Regiment target) {
		int distanceUp = 0;
		if (regiment.panels[0] / 48 > target.panels[0] / 48) {
			distanceUp = (target.panels[0] / 48) - (regiment.panels[0] / 48) ;
		}
		if (distanceUp != 0) distanceUp = distanceUp + target.rows;
		return distanceUp;
	}

	public static int checkDistanceDown(Regiment regiment, Regiment target) {
		int distanceDown = 0;
		if (regiment.panels[0] / 48 < target.panels[0] / 48) {
			distanceDown = (target.panels[0] / 48) - (regiment.panels[0] / 48);
		}
		if (distanceDown != 0) distanceDown = distanceDown - regiment.rows;
		return distanceDown;
	}

	public static int checkDistanceLeft(Regiment regiment, Regiment target) {
		int distanceLeft = 0;
		if (regiment.panels[0] % 48 > target.panels[0] % 48) {
			distanceLeft = (target.panels[0] % 48) - (regiment.panels[0] % 48);
		}
		return distanceLeft;
	}

	public static int checkDistanceRight(Regiment regiment, Regiment target) {
		int distanceRight = 0;
		if (regiment.panels[0] % 48 < target.panels[0] % 48) {
			distanceRight = (target.panels[0] % 48) - (regiment.panels[0] % 48);
		}
		return distanceRight;
	}
	
	

}
