package test;

//import junit assertions
import static org.junit.jupiter.api.Assertions.assertTrue;

//import junit test annotation
import org.junit.jupiter.api.Test;
import trafficlight.SubIntersection;
import trafficlight.Road;

public class AddVehicleTop {
	@Test
	void addVehicle (){
		SubIntersection nn = new SubIntersection();
		nn.enqueueVehicle(Road.TOP);
		nn.enqueueVehicle(Road.TOP);
		String out = nn.getIntersectionState();
		assertTrue(out.contains("TVr2"));
	}
}