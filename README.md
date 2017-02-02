### Stopwatch tasks 
### Present by Kwanwan Tantichartkul 5710546178
I ran the tasks on my MacBook Pro with my coding, and I got all these result.
Let’s see:

Task                                             | Time 
-------------------------------------------------|---------------: 
Append 50,000 chars to String         		 | 3.286409 sec 
Append 100,000 chars to String        		 | 8.815108 sec 
Append 100,000 chars to StringBuilder            | 0.023002 sec 
Add 1 billion double primitives using array      | 7.292694 sec
Add 1 billion double objects using array         | 8.673344 sec
Add 1 billion BigDecimal using array             | 33.693174 sec

##Explanation of Results

   • why is there such a big difference in the time used to append chars to a String and to a StringBuilder? Even though we eventually "copy" the StringBuilder into a String so the final result is the same.
   
     Because StringBuilder receive whole chars to covert to a String later 
     
     but String receive each chars to convert to a String one by one char.
     
   • why is there a significant difference in times to sum double, Double, and BigDecimal values? 
   
     Because Each method has the different type, It make different to sum it. 
     
     For The doubles is primitives type which sum not create object but The Double is class which create object.
     
     Finally, The BigDecimal is also class but need to import it for use and created object.
     

#Run the SpeedTest tasks and explain the results

1.append 50,000 characters to a String. Display length of the result (Don't display the string, of course)

>Append 50,000 chars to String

>final string length = 50000

>Elapsed time 1.324194 sec

2.append 100,000 characters to a String. Display length of the result. Since this is twice as many chars as task 1, does it take 2X as much time? Explain why this task takes so long. 

>Append 100,000 chars to String

>final string length = 100000 

>Elapsed time 3.202259 sec


3.append 100,000 characters to a StringBuilder, then convert result to String and display its length. 

>Append 100,000 chars to StringBuilder 

>final string length = 100000 

>Elapsed time 0.004196 sec


4.sum 1,000,000,000 double values from an array 

>Sum array of double primitives with count=1,000,000,000

>sum = 2.500005E14

>Elapsed time 1.393795 sec


5.sum 1,000,000,000 Double objects having the same values as in task 4.

>Sum array of Double objects with count=1,000,000,000 

>sum = 2.500005E14 

>Elapsed time 6.117972 sec


6.sum 1,000,000,000 BigDecimal objects having the same values as in task 4 

>Sum array of BigDecimal with count=1,000,000,000 

>sum = 250000500000000

>Elapsed time 9.908614 sec


##Question and Answer


  • Why does appending 100,000 chars to a String take more than 2X the time to append 50,000 chars? 
  
	Because Chars using space to located the data in memory. 
	
	When you have more chars, you use more time to located the data in memory.

  • Why is appending to StringBuilder so much different than appending to String? What is happening to the String? 
  
	 Because StringBuilder receive the whole Char to convert to String later 
	 
	 but String receive for each Character of all to covert it to String. 
	 
	 This make the appending to String using time more than appending to StringBuilder. 
	 
	 The StringBuilder can hold more than String.

  • Explain difference in time to sum double, Double, and BigDecimal. Which is faster and why? 
  
         The double is primitives number, So it not need to create the object. 
	 
	 The Double is class which it needs to create the object. 
	 
	 The BigDecimal is also classes but it needs to import it for use and create objects.
	 
	 The fastest one is sum double because you don’t need to create objects and import it. 
