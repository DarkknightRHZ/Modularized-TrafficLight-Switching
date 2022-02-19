package test;

//import junit assertions
import static org.junit.jupiter.api.Assertions.assertTrue;

//import junit test annotation
import org.junit.jupiter.api.Test;
import trafficlight.SubIntersection;
import trafficlight.Road;

public class StepTimed {
	@Test
	void step (){
		SubIntersection nn = new SubIntersection();
		nn.advanceTime();
		nn.advanceTime();
		assertTrue(nn.getTimeCount() == 3 && nn.getFlipper() == 0);
	}
}