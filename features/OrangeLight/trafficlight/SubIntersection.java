package trafficlight;

/**
 * TODO description
 */
public class SubIntersection extends Intersection{
	protected char flipper = 'a';
	protected boolean orangeLight = true;
	protected boolean onDemandOn = false;
	
	public void timelyChange() {
		flipperInterval = 2 * flipperGreen + 4 * flipperOrange;
		int rem = timeCount % flipperInterval;
		if (rem == 0) {
			flipper = 'a';
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
	
	public boolean getOnDemandOn() {
		return onDemandOn;
	}
}