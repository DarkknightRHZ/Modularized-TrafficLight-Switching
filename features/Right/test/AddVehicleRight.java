package test;

//import junit assertions
import static org.junit.jupiter.api.Assertions.assertTrue;

//import junit test annotation
import org.junit.jupiter.api.Test;
import trafficlight.SubIntersection;
import trafficlight.Road;

public class AddVehicleRight {
	@Test
	void addVehicle (){
		SubIntersection nn = new SubIntersection();
		nn.enqueueVehicle(Road.RIGHT);
		nn.enqueueVehicle(Road.RIGHT);
		String out = nn.getIntersectionState();
		assertTrue(out.contains("RVg2"));
	}
}