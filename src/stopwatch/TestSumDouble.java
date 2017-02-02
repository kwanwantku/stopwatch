package stopwatch;

/**
 * This class is running the task of the sum Double.
 * By adding Double objects from array to measure the time that to do it.
 * @author Kwanwan Tantichartkul
 * @version 1.0
 */

public class TestSumDouble  implements Runnable {
	
	private int counter;
	private double sum;
	static final int ARRAY_SIZE = 500000;

	/**
	 * This is constructor of this class. It's setting to count the sum Double.
	 * @param The counter that count how many time that it counted in this task.
	 */
	
	public TestSumDouble(int counter) {
		this.counter = counter;
	}
	
	/**
	 * Running of the sum Double task method.
	 * It's count the time that adding Double objects into array.
	 */

	public void run() {
		
		// create array of values to add, before we start the timer
		Double[] values = new Double[ARRAY_SIZE];
		for(int i=0; i<ARRAY_SIZE; i++) values[i] = new Double(i+1);
	
		sum = new Double(0.0);
		// count = loop counter, i = array index
		for(int count=0, i=0; count<counter; count++, i++) {
			if (i >= values.length) i = 0;
			sum = sum + values[i];
		}
		
	
		
	}
	
	/**
	 * It's show information about this task. It shown time and the sum of array.  
	 * @return the time and the sum of this task.
	 */
	
	@Override
	public String toString() {
		return String.format("Sum array of Double objects with count=%,d\n", counter) + "sum = " + sum;
	}


}
