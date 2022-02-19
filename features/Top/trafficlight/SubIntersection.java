package trafficlight;

/**
 * TODO description
 */
public class SubIntersection extends Intersection{
	
	protected int vehicleCountTop = 0;
	protected String vehicleLightTop = "r";
	
	
	protected String statTopRoad = "";
	
	private void makeARoad() {
		original();
		statTopRoad = "TV" + vehicleLightTop + String.valueOf(vehicleCountTop);
		statIntersection += " " + statTopRoad;
	}
	
	public void enqueueVehicle(Road road) {
		original(road);
		if (road == Road.TOP) {
			vehicleCountTop += 1;
		}
	}
	
	public void advanceTime() {
		original();
		if (flipper == 'b') {
			vehicleLightTop = "g";
		}
		else if (flipper == 'd' || flipper == 'e') {
			vehicleLightTop = "o";
		}
		else {
			vehicleLightTop = "r";
		}
		
		if(vehicleLightTop == "g") {
			if (vehicleCountTop > 0) {
				vehicleCountTop--;
			}
		}
		return;
	}

}