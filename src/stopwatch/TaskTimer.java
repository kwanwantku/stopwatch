package stopwatch;


/**
 * The TaskTimer that control to run all of 5 task that implement runnable.
 * It's control the all of 5 tasking with the result to counting the time from stopwatch.
 * @author pranger54
 * @version 1.0
 */

public class TaskTimer {
	
	/**
	 * It's the run all result from each task to show the time to measure and print all of task.
	 * @param It's running all of the result from each task.
	 */
	
	public static void measureAndPrint(Runnable runnable){
		
		
		Stopwatch watch = new Stopwatch();
		watch.start();
	    runnable.run();
		System.out.print(runnable.toString());
		watch.stop();
		System.out.printf("\nElapsed time %.6f sec\n\n", watch.getElapsed());
	}

}
