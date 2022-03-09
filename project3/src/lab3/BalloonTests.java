package lab3;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;


import balloon4.Balloon;


public class BalloonTests {
	private Balloon bl;
	
	@Before
	public void setup() {
		bl = new Balloon(10);
	}
	
	@Test
	public void testBlow()
    {
		bl.blow(5);
		bl.blow(5);
		assertEquals(10,bl.getRadius());
    }
	
	@Test
	public void testReblow()
    {
		bl.blow(20);
		bl.blow(5);
		assertEquals(0,bl.getRadius());
    }
	
	@Test
	public void testdeflate()
    {
		bl.blow(10);
		bl.deflate();
		assertEquals(0,bl.getRadius());
		assertEquals(false, bl.isPopped());
    }
	
	@Test
	public void testPop1()
    {
		bl.blow(5);
		bl.pop();
		assertEquals(true, bl.isPopped());
    }
	
	@Test
	public void testPop2()
    {
		bl.blow(20);
		assertEquals(0,bl.getRadius());
		assertEquals(true, bl.isPopped());
    }
	
	@Test
	public void testIsPopped()
    {
		bl.blow(5);
		assertEquals(false,bl.isPopped());
    }
}
