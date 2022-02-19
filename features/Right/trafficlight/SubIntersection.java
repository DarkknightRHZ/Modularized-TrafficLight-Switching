package trafficlight;

/**
 * TODO description
 */
public class SubIntersection extends Intersection{
	
	protected int vehicleCountRight = 0;
	protected String vehicleLightRight = "g";
	
	
	protected String statRightRoad = "";
	
	private void makeARoad() {
		original();
		statRightRoad = "RV" + vehicleLightRight + String.valueOf(vehicleCountRight);
		statIntersection += " " + statRightRoad;
	}
	
	public void enqueueVehicle(Road road) {
		original(road);
		if (road == Road.RIGHT) {
			vehicleCountRight += 1;
		}
	}
	
	public void advanceTime() {
		original();
		if (flipper == 'a') {
			vehicleLightRight = "g";
		}
		else if (flipper == 'c' || flipper == 'f') {
			vehicleLightRight = "o";
		}
		else {
			vehicleLightRight = "r";
		}
		
		if(vehicleLightRight == "g") {
			if (vehicleCountRight > 0) {
				vehicleCountRight--;
			}
		}
		return;
	}
}