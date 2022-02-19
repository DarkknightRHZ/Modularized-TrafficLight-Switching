package test;

//import junit assertions
import static org.junit.jupiter.api.Assertions.assertTrue;

//import junit test annotation
import org.junit.jupiter.api.Test;
import trafficlight.SubIntersection;
import trafficlight.Road;

public class BaseTest {
	@Test
	void intersectionTest (){
		SubIntersection nn = new SubIntersection();
		String out = nn.getIntersectionState();
		assertTrue(out.contains("LVg") && out.contains("RVg"));
	}
}