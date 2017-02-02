package stopwatch;

	/**
	 * A Stopwatch that measures elapsed time between a starting time
	 * and stopping time, or until the present time.
	 * @author Kwanwan Tantichartkul
	 * @version 1.0
	 */
	
	public class Stopwatch {
		
	   /** constant for converting nanoseconds to seconds. */
	   private static final double NANOSECONDS = 1.0E-9;
	   
	   /** time in the stopwatch was started, in nanoseconds. */
	   private long startTime;
	   
	   /** time in the stopwatch was stopped, in nanoseconds. */
	   private long finishTime;
	   
	   /** time that the stopwatch was to check for running, if run is true,else is false. */
	   private boolean running;
	  
	   /** 
	    *  This is the constructor of the stopwatch which make the stopwatch works.
	    *  It's setting default to not running.
	    */
	   
       public Stopwatch() {
		   
		   this.running = false;
       }
       
       /**
   	    *  Making the stopwatch to start for counting time.
   	    *  It's start time in nanosecond and make the stopwatch running.
   	    */

	   public void start( ) { 
		   
		  this.startTime = System.nanoTime();
		  this.running = true;
	   }
	   
	   /**
   	    *  Making the stopwatch to stop for counting time.
   	    *  It's stop time also in nanosecond and make the stopwatch to stop running.
   	    */

	   
	   public void stop() {
		   
		   this.finishTime = System.nanoTime();
		   this.running = false;
		   
	   }
	   
	   /**
   	    * To get the elapsed time when the stopwatch running and stop stopwatch with convert from nanoseconds to seconds.
   	    * @return If stopwatch is stop, It's get elapsed form finish time to start time.
   	    *         If stopwatch is running,It's get elapsed from the start time to current time.
   	    */
	   
	   public double getElapsed() {
		   
		   long notrun = this.finishTime-this.startTime;
		   long run = System.nanoTime()-this.startTime;

		   if(!isRunning()) {	   
			   return notrun*this.NANOSECONDS;
		   }
		   else{
			   return run*this.NANOSECONDS;
		   }
	   }
	   
	   /**
   	    * Check the stopwatch is running or not.
   	    * @return If the stopwatch running, It is return true. 
   	    *         If the stopwatch is not running, It's return false.
   	    */
	   
	   public boolean isRunning() {
		   if(this.running=true){
			   return true;
		   }
			   return false;
	   }
	
	}
