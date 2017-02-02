package stopwatch;

import java.io.IOException;

/**
 * The main that run the TaskTimer to show all of task result.
 * It's created object for each task in the TaskTimer to get the result.
 * @author Kwanwan Tantichartkul
 * @version 1.0
 */

public class Main {

	/**
	 * Computed the result of each task and print to show all of the result.
	 * @param The arguments that make the array to 
	 * @throws The exception when error occur when they null.
	 */
	public static void main(String[] args) throws IOException {
		

		TaskTimer.measureAndPrint(new TestAppendToString(50000));
		TaskTimer.measureAndPrint(new TestAppendToString(100000));
        TaskTimer.measureAndPrint(new TestAppendToStringBuilder(100000));
        
        int counter = 1000000000;
        
        TaskTimer.measureAndPrint(new TestSumDoublePrimitive(counter));
        TaskTimer.measureAndPrint(new TestSumDouble(counter));
        TaskTimer.measureAndPrint(new TestSumBigDecimal(counter));

	}
}
