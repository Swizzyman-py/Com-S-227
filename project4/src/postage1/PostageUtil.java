package postage1;
import java.lang.Math;

public class PostageUtil
{
	static double cost;
  /**
   * Returns the cost of postage for a letter of the given weight.
   * @param weight
   *   given weight in ounces
   * @return
   *   cost of postage for the weight
   */
  public static double computePostage(double weight)
  {
    if(weight <= 1) {
    	cost = .47;
    }
    else {
    	if(weight <= 3.5) {
    		cost = .47 + Math.ceil(weight-1) * .21;
    	}
    	else {
    		cost = .94 + Math.ceil(weight-1) * .21;
    	}
    }
    return cost;
  }
}