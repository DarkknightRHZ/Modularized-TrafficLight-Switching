package test;

//import junit assertions
import static org.junit.jupiter.api.Assertions.assertTrue;

//import junit test annotation
import org.junit.jupiter.api.Test;
import trafficlight.SubIntersection;
import trafficlight.Road;

public class AddPedestrian {
	@Test
	void addPedestrian (){
		SubIntersection nn = new SubIntersection();
		nn.enqueuePedestrian(Road.LEFT);
		nn.enqueuePedestrian(Road.RIGHT);
		String out = nn.getIntersectionState();
		assertTrue(out.contains("LVg0Pr1") && out.contains("RVg0Pr1"));
	}
}