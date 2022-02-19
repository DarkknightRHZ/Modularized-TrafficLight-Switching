package trafficlight;

/**
 * TODO description
 */
public class SubIntersection extends Intersection{
	
	protected int vehicleCountLeft = 0;
	protected String vehicleLightLeft = "g";
	
	
	protected String statLeftRoad = "";
	

	private void makeARoad() {
		statLeftRoad = "LV" + vehicleLightLeft + String.valueOf(vehicleCountLeft);
		this.statIntersection = statLeftRoad;
	}
	
	public void enqueueVehicle(Road road) {
		if (road == Road.LEFT) {
			vehicleCountLeft += 1;
		}
	}
	
	public void advanceTime() {
		original();
		if (flipper == 'a') {
			vehicleLightLeft = "g";
		}
		else if (flipper == 'c' || flipper == 'f') {
			vehicleLightLeft = "o";
		}
		else {
			vehicleLightLeft = "r";
		}
		
		if(vehicleLightLeft == "g") {
			if (vehicleCountLeft > 0) {
				vehicleCountLeft--;
			}
		}
		return;
	}
}