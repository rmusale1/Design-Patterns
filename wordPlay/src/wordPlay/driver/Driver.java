package wordPlay.driver;

import wordPlay.handler.WordRotator;
import wordPlay.util.FileProcessor;
import wordPlay.util.Results;
import wordPlay.metrics.MetricsCalculator;

import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Reha Musale
 *
 */
public class Driver {
	public static void main(String[] args) throws IOException {
		//String inputFile;
		String str;
		String outputFile;
		int count = 1;
		int flag = 0;
		int sent_count = 0;
		int word_count =0;
		int char_count = 0;
		int char_length;
		double m,n;
		String s3;
		String word_pattern1 = "^[a-zA-Z0-9]*$";
		String x = "";
		String z = "";
		String y = "";


		/*
		 * As the build.xml specifies the arguments as input,output or metrics, in case the
		 * argument value is not given java takes the default value specified in
		 * build.xml. To avoid that, below condition is used
		 */
		if ((args.length != 3) || (args[0].equals("${input}")) || (args[1].equals("${output}")) || (args[2].equals("${metrics}"))) {
			System.err.println("Error: Incorrect number of arguments. Program accepts 3 arguments.");
			System.exit(0);
		}



		FileProcessor fileReader = new FileProcessor(args[0]);
		WordRotator wrc = new WordRotator();
		MetricsCalculator mrc = new MetricsCalculator();
		//Results rsc = new Results();
		//ArrayList<String> y= new ArrayList<String>();
		Results results1 = new Results(args[1]);
		Results results2 = new Results(args[2]);


         str = fileReader.poll();
		 if(str == null)
		 {
			 System.err.println("Empty File" );
			 System.exit(0);
		 }



		while(str != null)
		{
			if((str.isEmpty()) == true)
			{
				System.err.println("Empty Line" );
				System.exit(0);
			}

			if(str.contains("."))
			{

				str = str.replaceAll("\\.", "");
				if(!(str.matches(word_pattern1)))
				{
					System.err.println("\nInvalid Characters Found. \nPlease enter input file with valid characters." + str);
					System.exit(0);
				}
				flag = 1;
				char_length = str.length();
				char_count= char_count + char_length;
				x = wrc.wordCalculator(str,count,flag);
				flag = 0;
				count = 1;
				sent_count++;
				word_count++;

			}
			else {

				char_length = str.length();
				char_count= char_count + char_length;
				if(!(str.matches(word_pattern1)))
				{
					System.err.println("\nInvalid Characters Found. \nPlease enter input file with valid characters." + str);
					System.exit(0);
				}
				x = wrc.wordCalculator(str,count,flag);
				count++;
				word_count++;
			}

			str = fileReader.poll();    // new addition

		}

		m = mrc.avgNumPerSen(sent_count,word_count);
		n = mrc.avgWordLength(char_count,word_count);
		z= results1.writeToStdOut(x);
		results1.writeToFile(z);
		results1.close();
		s3=results2.writeToStdOut(m , n);
		results2.writeToFile(s3);
		results2.close();


	}
}
