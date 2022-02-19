package trafficlight;

/**
 * TODO description
 */
public class SubIntersection extends Intersection{
	
	protected int vehicleCountBottom = 0;
	protected String vehicleLightBottom = "r";
	
	
	protected String statBottomRoad = "";

	private void makeARoad() {
		original();
		statBottomRoad = "BV" + vehicleLightBottom + String.valueOf(vehicleCountBottom);
		statIntersection += " " + statBottomRoad;
	}
	
	public void enqueueVehicle(Road road) {
		original(road);
		if (road == Road.BOTTOM) {
			vehicleCountBottom += 1;
		}
	}
	
	public void advanceTime() {
		original();
		if (flipper == 'b') {
			vehicleLightBottom = "g";
		}
		else if (flipper == 'd' || this.flipper == 'e') {
			vehicleLightBottom = "o";
		}
		else {
			vehicleLightBottom = "r";
		}
		
		if(vehicleLightBottom == "g") {
			if (vehicleCountBottom > 0) {
				vehicleCountBottom--;
			}
		}
		return;
	}
}