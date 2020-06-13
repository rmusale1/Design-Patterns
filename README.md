# CSX42: Assignment 1
## Name: 

-----------------------------------------------------------------------
-----------------------------------------------------------------------


Following are the commands and the instructions to run ANT on your project.
#### Note: build.xml is present in wordPlay/src folder.

-----------------------------------------------------------------------
## Instruction to clean:

####Command: ant -buildfile wordPlay/src/build.xml clean

Description: It cleans up all the .class files that were generated when you
compiled your code.

-----------------------------------------------------------------------
## Instruction to compile:

####Command: ant -buildfile wordPlay/src/build.xml all

Description: Compiles your code and generates .class files inside the BUILD folder.

-----------------------------------------------------------------------
## Instruction to run:

####Command: ant -buildfile wordPlay/src/build.xml run -Dinput="input.txt" -Doutput="output.txt" -Dmetrics="metrics.txt"

Note: Arguments accept the absolute path of the files.


-----------------------------------------------------------------------
## Description:
In this project the main function is created in Driver.java class
There are 4 other class WordRotator,Results,FileProcessor ,Metrics Calculator .
There are 2 interfaces FileDisplayInterface and StdOutDisplayInterface.
Wordrotator class has method which implement the logic to rotate the words
Results has methods to display the overall result on console and print it in output.txt file.
FileProcessor class returns word by word from input file.
MetricsCalculator calculates the averages.

The variables used are word_count,sent_count,Char_count,flag
Initially these variables are set to 0 , but its count increases when words are read from input file.
Variable s1 stores the total words obtained after processing.

S1 is passed to WriteToStdOut. The output string from WritetoStdout function is given to WritetoStdout function.

Variables m and n store the average count and it is passed to WriteToStdout and WriteTofile function.

There are two instances of Result Classs
Results1 :- is used for invoking function related to word processing.
Results1 :- is used for invoking function related to finding averages.

input.txt - It is the input file.It should be present under folder csx42-summer-2020-assign1-rmusale1.
output.txt,metrics.txt - Are the output files generated in wordPlay folder.

I have used basic String to store the result as it is easier to process on it.
The time complexities are as follows:-
1.Time Complexity to read file is O(n)Time
2. Time Complexity for calcuting metrics is O(n)Time
3. Time Complexity for word rotation is O(n)Time
4. Time Complexity for writing output is O(n) Time.

Below is the output generated for input text which is given below:-
input:-
Welcome to Design Patters summer 2020.
You should start  your assignment early as possible jio fgg tty rere te.

output:-

run:
     [java]  eWelcom to ignDes tersPat ummers 2020.
     [java]  uYo ldshou artst your nmentassig yearl sa possible jio gfg tyt rere et.
     [java] AVG_NUM_WORDS_PER_SENTENCE 9.5
     [java] AVG_WORD_LENGTH 4.74





-----------------------------------------------------------------------
### Academic Honesty statement:
-----------------------------------------------------------------------

"I have done this assignment completely on my own. I have not copied
it, nor have I given my solution to anyone else. I understand that if
I am involved in plagiarism or cheating an official form will be
submitted to the Academic Honesty Committee of the Watson School to
determine the action that needs to be taken. "

Date: 6/11/2020


