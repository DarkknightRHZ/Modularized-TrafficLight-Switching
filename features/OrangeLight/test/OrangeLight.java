package test;

//import junit assertions
import static org.junit.jupiter.api.Assertions.assertTrue;

//import junit test annotation
import org.junit.jupiter.api.Test;
import trafficlight.SubIntersection;
import trafficlight.Road;

public class OrangeLight {
	@Test
	void testOrangeLight (){
		SubIntersection nn = new SubIntersection();
		for (int i = 0; i < 11; i++) {
			nn.advanceTime();
			nn.advanceTime();
			nn.advanceTime();
			nn.advanceTime();
			nn.advanceTime();
			nn.advanceTime();
			nn.advanceTime();
			nn.advanceTime();
			nn.advanceTime();
			nn.advanceTime();
			nn.advanceTime();
		}
		String out = nn.getIntersectionState();
		if (!nn.getOnDemandOn()) {
			assertTrue(out.contains("LVo"));
		}
	}
}