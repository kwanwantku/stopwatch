package stopwatch;

/**
 * This class is running the task of the append to StringBuilder.
 * By append chars to a StringBuilder to measure the time that to do it.
 * @author Kwanwan Tantichartkul
 * @version 1.0
 */

public class TestAppendToStringBuilder  implements Runnable {
	
	private int count;
	private String result;
	
	/**
	 * This is constructor of this class. It's setting to count the appending chars to a StringBuilder.
	 * @param The count that count how many time that it counted in this task.
	 */
	
	public TestAppendToStringBuilder(int count) {
		this.count = count;
	}
	
	/**
	 * Running of the append to StringBuilder task method.
	 * It's count the time that append to StringBuilder to measure the time.
	 */

	public void run() {
		
		final char CHAR = 'a';

		StringBuilder builder = new StringBuilder(); 
		int k = 0;
		while(k++ < count) {
			builder = builder.append(CHAR);
		}
		// now create a String from the result, to be compatible with task 1.
		result = builder.toString();


	}

	/**
	 * It's show information about this task. It shown time and the final String length.  
	 * @return the time and the sum of this task.
	 */

	@Override
	public String toString() {
		return String.format("Append %,d chars to StringBuilder\nfinal string length = %s", count,result.length());

	}


}
