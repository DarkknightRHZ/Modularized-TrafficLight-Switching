package trafficlight;

/**
 * TODO description
 */
public class SubIntersection extends Intersection {
	
	protected int pedestrianCountLeft = 0;
	protected int pedestrianCountRight = 0;
	protected int pedestrianCountTop = 0;
	protected int pedestrianCountBottom = 0;
	protected String pedestrianLightLeft = "r";
	protected String pedestrianLightRight = "r";
	protected String pedestrianLightTop = "g";
	protected String pedestrianLightBottom = "g";
	protected String statLeftRoad = "";
	protected String statRightRoad = "";
	protected String statTopRoad = "";
	protected String statBottomRoad = "";
	
	private void makeARoad() {
		original();
		statLeftRoad += "P";
		statLeftRoad += pedestrianLightLeft;
		statLeftRoad += String.valueOf(pedestrianCountLeft);
		statRightRoad += "P";
		statRightRoad += pedestrianLightRight;
		statRightRoad += String.valueOf(pedestrianCountRight);
		statTopRoad += "P";
		statTopRoad += pedestrianLightTop;
		statTopRoad += String.valueOf(pedestrianCountTop);
		statBottomRoad += "P";
		statBottomRoad += pedestrianLightBottom;
		statBottomRoad += String.valueOf(pedestrianCountBottom);
		
		String statString = "";
		if (statIntersection.contains("L")) {
			statString += statLeftRoad;
		}
		if (statIntersection.contains("R")) {
			statString += " " + statRightRoad;
		}
		if (statIntersection.contains("T")) {
			statString += " " + statTopRoad;
		}
		if (statIntersection.contains("B")) {
			statString += " " + statBottomRoad;
		}
		
		statIntersection = statString;
	}
	
	public void enqueuePedestrian(Road road) {
		if (road == Road.LEFT) {
			pedestrianCountLeft++;
		}
		else if (road == Road.RIGHT) {
			pedestrianCountRight++;
		}
		else if (road == Road.TOP) {
			pedestrianCountTop++;
		}
		else if (road == Road.BOTTOM) {
			pedestrianCountBottom++;
		}
		else {
			System.err.println("Please enter a valid road name.\n");
		}
	}
	
	public void advanceTime() {
		original();
		if (flipper == 'a' || flipper == 'c' || flipper == 'f') {
			pedestrianLightLeft = "r";
			pedestrianLightRight = "r";
			pedestrianLightTop = "g";
			pedestrianLightBottom = "g";
		}
		else if (flipper == 'b' || flipper == 'd' || flipper == 'e') {
			pedestrianLightLeft = "g";
			pedestrianLightRight = "g";
			pedestrianLightTop = "r";
			pedestrianLightBottom = "r";
		}
		else {
			pedestrianLightLeft = "r";
			pedestrianLightRight = "r";
			pedestrianLightTop = "r";
			pedestrianLightBottom = "r";
		}
		
		if (pedestrianLightLeft == "g" && pedestrianCountLeft > 0) {
			pedestrianCountLeft--;
		}
		
		if (pedestrianLightRight == "g" && pedestrianCountRight > 0) {
			pedestrianCountRight--;
		}
		
		if (pedestrianLightTop == "g" && pedestrianCountTop > 0) {
			pedestrianCountTop--;
		}
		
		if (pedestrianLightBottom == "g" && pedestrianCountBottom > 0) {
			pedestrianCountBottom--;
		}
		
		return;
	}
}