package stopwatch;

/**
 * This class is running the task of the append to String.
 * By append chars to a String to measure the time that to do it.
 * @author Kwanwan Tantichartkul
 * @version 1.0
 */

public class TestAppendToString implements Runnable {

	private int count;
	private String result;
	
	/**
	 * This is constructor of this class. It's setting to count the sum BigDecimal.
	 * @param The count that count how many time that it counted in this task.
	 */
	
	public TestAppendToString(int count) {
		this.count = count;
	}
	
	/**
	 * Running of the append to String task method.
	 * It's count the time that append to String to measure the time.
	 */
	
	public void run() {
		
		final char CHAR = 'a';
		result = ""; 
		int k = 0;
		while(k++ < count) {
			result = result + CHAR;
		}
		
	}
	
	/**
	 * It's show information about this task. It shown time and the final String length.  
	 * @return the time and the sum of this task.
	 */

	@Override
	public String toString() {
		return String.format("Append %,d chars to String\nfinal string length = %"
				+ "s", count,result.length());
	}

	
	

}
