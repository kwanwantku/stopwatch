{\rtf1\ansi\ansicpg1252\cocoartf1504\cocoasubrtf810
{\fonttbl\f0\froman\fcharset0 Times-Roman;\f1\fmodern\fcharset0 CourierNewPSMT;\f2\fmodern\fcharset0 CourierNewPS-BoldMT;
\f3\fnil\fcharset0 Monaco;\f4\fmodern\fcharset0 CourierNewPS-ItalicMT;\f5\froman\fcharset0 TimesNewRomanPSMT;
\f6\ftech\fcharset77 Symbol;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;\red255\green255\blue255;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c0;\cssrgb\c100000\c100000\c100000;}
{\*\listtable{\list\listtemplateid1\listhybrid{\listlevel\levelnfc23\levelnfcn23\leveljc0\leveljcn0\levelfollow0\levelstartat1\levelspace360\levelindent0{\*\levelmarker \{disc\}}{\leveltext\leveltemplateid1\'01\uc0\u8226 ;}{\levelnumbers;}\fi-360\li720\lin720 }{\listlevel\levelnfc23\levelnfcn23\leveljc0\leveljcn0\levelfollow0\levelstartat1\levelspace360\levelindent0{\*\levelmarker \{hyphen\}}{\leveltext\leveltemplateid2\'01\uc0\u8259 ;}{\levelnumbers;}\fi-360\li1440\lin1440 }{\listname ;}\listid1}
{\list\listtemplateid2\listhybrid{\listlevel\levelnfc23\levelnfcn23\leveljc0\leveljcn0\levelfollow0\levelstartat1\levelspace360\levelindent0{\*\levelmarker \{disc\}}{\leveltext\leveltemplateid101\'01\uc0\u8226 ;}{\levelnumbers;}\fi-360\li720\lin720 }{\listname ;}\listid2}
{\list\listtemplateid3\listhybrid{\listlevel\levelnfc23\levelnfcn23\leveljc0\leveljcn0\levelfollow0\levelstartat1\levelspace360\levelindent0{\*\levelmarker \{disc\}}{\leveltext\leveltemplateid201\'01\uc0\u8226 ;}{\levelnumbers;}\fi-360\li720\lin720 }{\listname ;}\listid3}}
{\*\listoverridetable{\listoverride\listid1\listoverridecount0\ls1}{\listoverride\listid2\listoverridecount0\ls2}{\listoverride\listid3\listoverridecount0\ls3}}
\paperw11900\paperh16840\margl1440\margr1440\vieww25220\viewh12760\viewkind0
\deftab720
\pard\pardeftab720\sl360\sa240\partightenfactor0

\f0\b\fs48 \cf2 \cb3 \expnd0\expndtw0\kerning0
# Stopwatch tasks \
# Present by Kwanwan Tantichartkul 5710546178\

\f1\b0\fs32 \cb1 \uc0\u8232 \cb3 I ran the tasks on my MacBook Pro with my coding, and I got all these result.
\f0\fs24 \cb1 \
\pard\pardeftab720\sl360\partightenfactor0

\f1\fs32 \cf2 \cb3 Let\'92s see:\
\
\pard\pardeftab720\sl360\sa240\partightenfactor0
\cf2 Task                                             | Time \
-------------------------------------------------|-------: \
Append 50,000 chars to String         		    | \cf0 \cb1 \kerning1\expnd0\expndtw0 3.286409\cf2 \cb3 \expnd0\expndtw0\kerning0
 sec \
Append 100,000 chars to String        		    | \cf0 \cb1 \kerning1\expnd0\expndtw0 8.815108\cf2 \cb3 \expnd0\expndtw0\kerning0
 sec \
Append 100,000 chars to StringBuilder            | \cf0 \cb1 \kerning1\expnd0\expndtw0 0.023002\cf2 \cb3 \expnd0\expndtw0\kerning0
 sec \
Add 1 billion double primitives using array      | \cf0 \cb1 \kerning1\expnd0\expndtw0 7.292694\cf2 \cb3 \expnd0\expndtw0\kerning0
 sec\
Add 1 billion double objects using array         | \cf0 \cb1 \kerning1\expnd0\expndtw0 8.673344\cf2 \cb3 \expnd0\expndtw0\kerning0
 sec\
Add 1 billion BigDecimal using array             | \cf0 \cb1 \kerning1\expnd0\expndtw0 33.693174\cf2 \cb3 \expnd0\expndtw0\kerning0
 sec\
\
\pard\pardeftab720\sl360\partightenfactor0

\f2\b\fs48 \cf2 ##Explanation of Results\
\pard\pardeftab720\sl360\partightenfactor0

\f1\b0\fs32 \cf2 \
\pard\tx220\tx720\pardeftab720\li720\fi-720\sl340\sa320\partightenfactor0
\ls1\ilvl0\cf2 \kerning1\expnd0\expndtw0 {\listtext	\'95	}\expnd0\expndtw0\kerning0
why is there such a big difference in the time used to append chars to a String and to a StringBuilder? Even though we eventually "copy" the StringBuilder into a String so the final result is the same. \
\pard\tx940\tx1440\pardeftab720\li1440\fi-1440\sl340\sa320\partightenfactor0
\ls1\ilvl1\cf2 \cb1 \kerning1\expnd0\expndtw0 {\listtext	
\f3 \uc0\u8259 
\f1 	}Because StringBuilder receive whole chars to covert to a String later but String receive each chars to convert to a String one by one char.\expnd0\expndtw0\kerning0
\uc0\u8232 \
\pard\tx220\tx720\pardeftab720\li720\fi-720\sl340\sa320\partightenfactor0
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 {\listtext	\'95	}\expnd0\expndtw0\kerning0
why is there a significant difference in times to sum double, Double, and BigDecimal values? \cb1 \uc0\u8232 \
\pard\tx566\pardeftab720\sl340\sa320\partightenfactor0
\cf2      -  Because Each method has the different type, It make different to sum it. For The doubles is primitives type which sum not create object but The Double is class which create object.Finally, The BigDecimal is also class but need to import it for use and created object.\
\pard\pardeftab720\sl360\partightenfactor0

\f0\b \cf2 \cb3 \
\pard\pardeftab720\sl360\partightenfactor0

\f1\b0 \cf2 \
\pard\pardeftab720\sl360\sa240\partightenfactor0
\cf2 \
\pard\pardeftab720\sl480\sa240\partightenfactor0

\f2\b\fs40 \cf2 \cb1 #Run the SpeedTest tasks and explain the results 
\f1\b0\fs32 \
\pard\pardeftab720\sl360\sa240\partightenfactor0

\fs36 \cf2 1. append 50,000 characters to a String. Display 
\f4\i length 
\f1\i0 of the result (Don't display the string, of course) \
\pard\pardeftab720\sl360\sa240\partightenfactor0

\fs32 \cf0 \kerning1\expnd0\expndtw0 Append 50,000 chars to String\
final string length = 50000\
\pard\pardeftab720\partightenfactor0
\cf0 Elapsed time 1.324194 sec
\f5 \cf2 \expnd0\expndtw0\kerning0
\
\pard\pardeftab720\partightenfactor0

\f3\fs22 \cf0 \kerning1\expnd0\expndtw0 \
\pard\pardeftab720\partightenfactor0

\f5\fs32 \cf2 \expnd0\expndtw0\kerning0
\
\pard\pardeftab720\sl360\sa240\partightenfactor0

\f1\fs36 \cf2 2. append 100,000 characters to a String. Display length of the result. Since this is twice as many chars as task 1, does it take 2X as much time? Explain why this task takes so long.\
\pard\pardeftab720\sl360\sa240\partightenfactor0

\fs32 \cf0 \kerning1\expnd0\expndtw0 Append 100,000 chars to String\
final string length = 100000\
Elapsed time 3.202259 sec
\fs24 \cf2 \expnd0\expndtw0\kerning0
\
\pard\pardeftab720\sl360\sa240\partightenfactor0

\fs32 \cf2 \uc0\u8232 
\fs36 3. append 100,000 characters to a StringBuilder, then convert result to String and display its length. \
\pard\pardeftab720\sl360\sa240\partightenfactor0

\fs32 \cf0 \kerning1\expnd0\expndtw0 Append 100,000 chars to StringBuilder\
final string length = 100000\
\pard\pardeftab720\partightenfactor0
\cf0 Elapsed time 0.004196 sec\cf2 \expnd0\expndtw0\kerning0
\
\cf0 \kerning1\expnd0\expndtw0 \
\pard\pardeftab720\partightenfactor0
\cf2 \expnd0\expndtw0\kerning0
\
\pard\pardeftab720\sl360\sa240\partightenfactor0

\fs36 \cf2 4. sum 1,000,000,000 double values from an array\
\pard\pardeftab720\sl360\sa240\partightenfactor0

\fs32 \cf0 \kerning1\expnd0\expndtw0 Sum array of double primitives with count=1,000,000,000\
sum = 2.500005E14\
\pard\pardeftab720\partightenfactor0
\cf0 Elapsed time 1.393795 sec
\fs36 \cf2 \expnd0\expndtw0\kerning0
\
\pard\pardeftab720\partightenfactor0

\fs32 \cf2 \
\pard\pardeftab720\sl360\sa240\partightenfactor0
\cf2 \uc0\u8232 
\fs36 5. sum 1,000,000,000 Double objects having the same values as in task 4.\
\pard\pardeftab720\sl360\sa240\partightenfactor0

\fs32 \cf0 \kerning1\expnd0\expndtw0 Sum array of Double objects with count=1,000,000,000 \
sum = 2.500005E14\
Elapsed time 6.117972 sec\cf2 \expnd0\expndtw0\kerning0
\
\pard\pardeftab720\partightenfactor0

\fs36 \cf2 \
\pard\pardeftab720\sl360\sa240\partightenfactor0
\cf2 \uc0\u8232 6. sum 1,000,000,000 BigDecimal objects having the same values as in task 4\
\pard\pardeftab720\sl360\sa240\partightenfactor0

\fs32 \cf0 \kerning1\expnd0\expndtw0 Sum array of BigDecimal with count=1,000,000,000\
sum = 250000500000000\
\pard\pardeftab720\partightenfactor0
\cf0 Elapsed time 9.908614 sec\
\
##Question and Answer\
\
\pard\pardeftab720\sl320\sa240\partightenfactor0
\cf2 \expnd0\expndtw0\kerning0
  \'95 Why does appending 100,000 chars to a String take more than 2X the time to append 50,000 chars? \
	= Because Chars using space to located the data in memory. When you have more chars, you use more time to located the data in memory.
\fs24 \
\pard\tx220\tx720\pardeftab720\li720\fi-720\sl360\sa320\partightenfactor0
\ls2\ilvl0
\fs32 \cf2 \cb3 \kerning1\expnd0\expndtw0 {\listtext	\'95	}\expnd0\expndtw0\kerning0
Why is appending to StringBuilder so much different than appending to String? What is happening to the String? \
\pard\tx566\pardeftab720\sl360\sa320\partightenfactor0
\cf2 \cb1 	 = Because StringBuilder receive the whole Char to convert to String later but String receive for each Character of all to covert it to String. This make the appending to String using time more than appending to StringBuilder. The StringBuilder can hold more than String.\
\pard\tx220\tx720\pardeftab720\li720\fi-720\sl360\sa320\partightenfactor0
\ls3\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 {\listtext	 \'95	}\expnd0\expndtw0\kerning0
Explain difference in time to sum double, Double, and BigDecimal. Which is faster and why?   \
\pard\tx220\tx720\pardeftab720\li720\fi-720\sl360\sa320\partightenfactor0
\ls3\ilvl0
\f6 \cf2 \cb1 \kerning1\expnd0\expndtw0          
\f1 = The double is primitives number, So it not need to create the object. The Double is class which it needs to create the object. The BigDecimal is also classes but it needs to import it for use and create objects.The fastest one is sum double because you don\'92t need to create objects and import it.
\f6 \expnd0\expndtw0\kerning0
\uc0\u8232 \
\pard\pardeftab720\partightenfactor0

\f1 \cf0 \kerning1\expnd0\expndtw0 \
\
\
\
\
\pard\pardeftab720\sl360\sa240\partightenfactor0
\cf2 \expnd0\expndtw0\kerning0
\
\pard\pardeftab720\sl360\partightenfactor0

\f0\b \cf2 \cb3 \
\pard\pardeftab720\sl360\sa240\partightenfactor0

\f1\b0 \cf2 \cb1 \
\pard\pardeftab720\partightenfactor0
\cf2 \uc0\u8232 
\fs24 \
}