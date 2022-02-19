package trafficlight;

/**
 * TODO description
 */
public class SubIntersection extends Intersection{
	
	protected String statIntersection = "";
	protected int timeCount = 1;
	protected char flipper = 'a';
	protected int flipperGreen = 10;
	protected int flipperOrange = 2;
	protected int flipperInterval = 10;
	protected int onRequestTimer;
	protected boolean orangeLight = false;
	
	public void makeARoad();
	
	public static Intersection createIntersection() {
		// TODO: return an instance of your intersection implementation here!
		return new SubIntersection();
	}
	
	public void enqueueVehicle(Road road) {
		return;
	}

	public void advanceTime() {
		timeCount++;
		return;
	}
	
	public String getIntersectionState() {
		makeARoad();
		return this.statIntersection;
	}
	
	public void timelyChange() {
		return;
	}
	
	public void onRequestChange() {
		return;
	}
	
	public int getTimeCount() {
		return timeCount;
	}
	
	public char getFlipper() {
		return flipper;
	}
}