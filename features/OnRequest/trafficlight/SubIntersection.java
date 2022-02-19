package trafficlight;

/**
 * TODO description
 */
public class SubIntersection {
	
	protected int vehicleCountTop = 0;
	protected int vehicleCountBottom = 0;
	protected int pedestrianCountLeft = 0;
	protected int pedestrianCountRight = 0;
	protected String pedestrianLightTop = "g";
	protected String pedestrianLightBottom = "g";
	protected int onRequestTimer = 0;
	protected boolean verticalRoadBusy = false;
	private boolean flippedOnce = false;
	protected boolean onDemandOn = false;
	
	public void onRequestChange() {
			onDemandOn = true;
			if (this.orangeLight == true) {
				flipperInterval = 2 * flipperGreen + 4 * flipperOrange;
				if (verticalRoadBusy == false && !(vehicleCountTop == 0 && vehicleCountBottom == 0 && 
						pedestrianCountLeft == 0 && pedestrianCountRight == 0)) {
					verticalRoadBusy = true;
					if ((onRequestTimer % flipperInterval) >= flipperGreen) {
						onRequestTimer = flipperGreen;
					}
				}
				if (verticalRoadBusy == true && vehicleCountTop == 0 && vehicleCountBottom == 0 && 
						pedestrianCountLeft == 0 && pedestrianCountRight == 0) {
					verticalRoadBusy = false;
					flippedOnce = false;
				}
				if (verticalRoadBusy == false) {
					int rem = onRequestTimer % flipperInterval;
					if (rem == 0 && !flippedOnce) {
						flipper = 'a';
						onRequestTimer = 0;
						flippedOnce = true;
					}
					else if (rem == flipperGreen && !flippedOnce) {
						flipper = 'c';
					}
					else if (rem == flipperGreen + flipperOrange && !flippedOnce) {
						flipper = 'd';
					}
					else if (rem == flipperGreen + 2 * flipperOrange && !flippedOnce) {
						flipper = 'b';
					}
					else if (rem == 2 * flipperGreen + 2 * flipperOrange && !flippedOnce) {
						flipper = 'e';
					}
					else if (rem == 2 * flipperGreen + 3 * flipperOrange && !flippedOnce){
						flipper = 'f';
					}
				}
				if (verticalRoadBusy == true) {
					int rem = onRequestTimer % flipperInterval;
					if (rem == 0) {
						flipper = 'a';
						onRequestTimer = 0;
					}
					else if (rem == flipperGreen) {
						flipper = 'c';
					}
					else if (rem == flipperGreen + flipperOrange) {
						flipper = 'd';
					}
					else if (rem == flipperGreen + 2 * flipperOrange) {
						flipper = 'b';
					}
					else if (rem == 2 * flipperGreen + 2 * flipperOrange) {
						flipper = 'e';
					}
					else if (rem == 2 * flipperGreen + 3 * flipperOrange){
						flipper = 'f';
					}
				}
			}
			else {
				if (verticalRoadBusy == false && !(vehicleCountTop == 0 && vehicleCountBottom == 0 && 
						pedestrianCountLeft == 0 && pedestrianCountRight == 0)) {
					verticalRoadBusy = true;
					if (onRequestTimer >= flipperInterval) {
						onRequestTimer = 0;
					}
				}
				if (verticalRoadBusy == true && vehicleCountTop == 0 && vehicleCountBottom == 0 && 
						pedestrianCountLeft == 0 && pedestrianCountRight == 0) {
					verticalRoadBusy = false;
					flippedOnce = false;
				}
				if (onRequestTimer % flipperInterval == 0 && verticalRoadBusy == false) {
					if (flipper == 'b' && !flippedOnce) {
						flipper = 'a';
						flippedOnce = true;
						onRequestTimer = 0;
					}
				}
				if (onRequestTimer % flipperInterval == 0 && verticalRoadBusy == true) {
					if (flipper == 'a') {
						flipper = 'b';
					}
					else {
						flipper = 'a';
					}
				}
			}
	}
	
	public void advanceTime() {
		onRequestChange();
		original();
		onRequestTimer++;
		return;
	}
}