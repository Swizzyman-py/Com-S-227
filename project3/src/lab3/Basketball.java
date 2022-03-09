package lab3;


public class Basketball {
	/**
	 * returns of the basketball is dribbleable
	 */
	boolean isDribbleable;
	/**
	 * Diameter of this basketball
	 */
	double diameter;
	/**
	 * circumference of this basketball
	 */
	double circumference;
	
	
	/**
	 * 
	 * @param diameter
	 */
	public Basketball(double diameter) {
		this.diameter = diameter;
		
	}
	/**
	 * 
	 * @return
	 */
	public boolean isDribbleable() {
		
		return isDribbleable;
	}
	/**
	 * 
	 * @return
	 */
	public double getDiameter() {
		
		return diameter;
	}
	/**
	 * 
	 * @return
	 */
	public double getcircumference() {
		circumference = diameter * Math.PI;
		return circumference;
	}
	/**
	 * 
	 */
	public void inflate() {
		
		isDribbleable = true;
	}
	
}
