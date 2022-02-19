package test;

//import junit assertions
import static org.junit.jupiter.api.Assertions.assertTrue;

//import junit test annotation
import org.junit.jupiter.api.Test;
import trafficlight.SubIntersection;
import trafficlight.Road;

public class StepOnRequest {
	@Test
	void step (){
		SubIntersection nn = new SubIntersection();
		nn.advanceTime();
		nn.advanceTime();
		assertTrue(nn.getTimeCount() == 'd' && nn.getFlipper() == 'a');
	}
}