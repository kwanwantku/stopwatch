package stopwatch;

/**
 * This class is running the task of the sum double primitives.
 * By adding double primitives to array to measure the time that to do it.
 * @author Kwanwan Tantichartkul
 * @version 1.0
 */

public class TestSumDoublePrimitive  implements Runnable {
	
	private int counter;
	private double sum;
	static final int ARRAY_SIZE = 500000;

	/**
	 * This is constructor of this class. It's setting to count the sum double primitives.
	 * @param The counter that count how many time that it counted in this task.
	 */
	
	public TestSumDoublePrimitive(int counter) {
		this.counter = counter;
	}
	
	/**
	 * Running of the sum double primitives task method.
	 * It's count the time that adding double into array.
	 */
	
	@Override
	public void run() {

		// create array of values to add before we start the timer
		double[] values = new double[ARRAY_SIZE];
		for(int k=0; k<ARRAY_SIZE; k++) values[k] = k+1;

		sum = 0.0;
		// count = loop counter, i = array index value
		for(int count=0, i=0; count<counter; count++, i++) {
			if (i >= values.length) i = 0;  // reuse the array when get to last value
			sum = sum + values[i];
		}
		
	}
	
	/**
	 * It's show information about this task. It shown time and the sum of array.  
	 * @return the time and the sum of this task.
	 */
	
	public String toString() {
		return String.format("Sum array of double primitives with count=%,d \n", counter) + "sum = " + sum;
	}



}
