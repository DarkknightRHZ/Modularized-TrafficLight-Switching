package trafficlight;

/**
 * TODO description
 */
public class SubIntersection extends Intersection {
	public void timelyChange() {
		if (orangeLight == true) {
			original();
		}
		else {
			if (timeCount % flipperInterval == 0) {
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
		original();
		timelyChange();
		return;
	}
}