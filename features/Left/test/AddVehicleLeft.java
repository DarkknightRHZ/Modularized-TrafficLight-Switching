package test;

//import junit assertions
import static org.junit.jupiter.api.Assertions.assertTrue;

//import junit test annotation
import org.junit.jupiter.api.Test;
import trafficlight.SubIntersection;
import trafficlight.Road;

public class AddVehicleLeft {
	@Test
	void addVehicle (){
		SubIntersection nn = new SubIntersection();
		nn.enqueueVehicle(Road.LEFT);
		nn.enqueueVehicle(Road.LEFT);
		String out = nn.getIntersectionState();
		assertTrue(out.contains("LVg2"));
	}
}