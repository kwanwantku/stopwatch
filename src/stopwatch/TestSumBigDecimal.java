package stopwatch;

import java.math.BigDecimal;

/**
 * This class is running the task of the sum BigDecimal.
 * By import BigDecimal to use and adding BigDecimal objects from array to measure the time that to do it.
 * @author Kwanwan Tantichartkul
 * @version 1.0
 */

public class TestSumBigDecimal implements Runnable {
	
	private int count;
	private BigDecimal sum;
	static final int ARRAY_SIZE = 500000;
	
	/**
	 * This is constructor of this class. It's setting to count the sum BigDecimal.
	 * @param The counter that count how many time that it counted in this task.
	 */
	
	public TestSumBigDecimal(int count) {
		this.count = count;
	}
	
	/**
	 * Running of the sum BigDecimal task method.
	 * It's count the time that adding BigDecimal objects into array.
	 */
	
	@Override
	public void run() {
		
		// create array of values to add, before we start the timer
		BigDecimal[] values = new BigDecimal[ARRAY_SIZE];
		for(int i=0; i<ARRAY_SIZE; i++) values[i] = new BigDecimal(i+1);

		sum = new BigDecimal(0.0);
		for(int count=0, i=0; count<this.count; count++, i++) {
			if (i >= values.length) i = 0;
			sum = sum.add( values[i] );
		}
		
	
	}

	/**
	 * It's show information about this task. It shown time and the sum of array.  
	 * @return the time and the sum of this task.
	 */

	@Override
	public String toString() {
		return String.format("Sum array of BigDecimal with count=%,d\n",count) + "sum = " + sum;
		
	}


}
