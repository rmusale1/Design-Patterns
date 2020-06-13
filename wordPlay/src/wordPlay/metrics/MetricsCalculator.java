package wordPlay.metrics;
import java.text.DecimalFormat;

/***
 *class which implements methods to find average word length and sentence length
 */
public class MetricsCalculator {
    DecimalFormat df2 = new DecimalFormat("#.##");

    /***
     * Method to calculate the average words in a sentence , which takes sentence
     * count and word count as input and returns its average which is in double
     * @param sent_count
     * @param word_count
     * @return  double - which is the average word count
     */
    public double avgNumPerSen(int sent_count,int word_count){
        double averageNumPerSent;
        averageNumPerSent = (double)(word_count)/(sent_count);
        return averageNumPerSent;
    }

    /***
     * Method which takes total character count and word count and returns average word length
     * @param char_count
     * @param word_count
     * @return double :- double average word length
     */
    public double avgWordLength(int char_count, int word_count){
        double averageWordLen;
        averageWordLen = (double)(char_count)/(word_count);
        return averageWordLen;
    }


}

