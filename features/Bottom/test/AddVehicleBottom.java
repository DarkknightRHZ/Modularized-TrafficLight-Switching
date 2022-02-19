package test;

//import junit assertions
import static org.junit.jupiter.api.Assertions.assertTrue;

//import junit test annotation
import org.junit.jupiter.api.Test;
import trafficlight.SubIntersection;
import trafficlight.Road;

public class AddVehicleBottom {
	@Test
	void addVehicle (){
		SubIntersection nn = new SubIntersection();
		nn.enqueueVehicle(Road.BOTTOM);
		nn.enqueueVehicle(Road.BOTTOM);
		String out = nn.getIntersectionState();
		assertTrue(out.contains("BVr2"));
	}
}