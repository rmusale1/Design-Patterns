package wordPlay.util;
import java.io.FileWriter;
import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedWriter;

/***
 * class which has methods to to write the output to console and text file
 */

public class Results implements FileDisplayInterface, StdoutDisplayInterface {
    FileWriter fw=null;
    File file=null;
	BufferedWriter writer1 = null;
	BufferedWriter writer2 = null;
	String s2;
	DecimalFormat df2 = new DecimalFormat("#.##");

	/***
	 * Constructs a text file where the output can be written.
	 * @param outputFilePath
	 */
	public Results(String outputFilePath){

	    try{
			file = new File(outputFilePath);
			fw = new FileWriter(file);
			if(!file.exists()) {
	        	file.createNewFile();
			}
			writer1 = new BufferedWriter(fw);
	    } catch(IOException e){
	        e.printStackTrace();
	    }



    }
    /*public ArrayList<String> addToList(String x){
        ArrayList<String> resultList = new ArrayList<String>();
	    resultList.add(x);
	    return resultList;
    }*/

	/***
	 * method which takes input as a rotated string and writes it to output file.
	 * @return void
	 * @param al
	 */
    public void writeToFile(String al){
			    try{
			    	writer1.write(al);
        } catch(IOException e){
	        e.printStackTrace();
        }
    }

	/***
	 * method to close the connection after writing to a file
	 * @return void
	 */
	public void close(){
		if (writer1 != null) {
			try {
				writer1.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		if (fw != null) {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/***
	 * Method which takes two integers(average words per sent & average word length) and prints it to console.
	 * @param m
	 * @param n
	 * @return String - consists the number and their description in String format
	 */
	public String writeToStdOut(double m , double n){
		s2 = "AVG_NUM_WORDS_PER_SENTENCE " +df2.format(m)+ "\n" +"AVG_WORD_LENGTH "+df2.format(n);
		System.out.println(s2);
		return s2;
	}

	/***
	 * MEthod which takes String and writes it to the console
	 * @param al
	 * @return String - the entire output which is printed on console and return the same
	 */
	public String writeToStdOut(String al){
		String sss = al.toString().replace(",","")
				.replace("["," ")
				.replace("]","")
				.replaceAll("\\.","\\.\n");

		System.out.print(sss);

		return sss;
	}

}
