package wordPlay.handler;
import java.util.ArrayList;
import wordPlay.util.FileProcessor;
import wordPlay.util.Results;
import java.lang.String;
import java.util.Stack;

/***
 * It is a utility to for rotation of a word depending on its index in a sentence
 */
public class WordRotator {
    String res ="";

    /***
     * Takes a word , its index(count) in sentence and flag(to detect period)and gives a rotated word
      * @param str
     * @param count
     * @param flag
     * @return String gives a rotated word.Every time this routine is called,
     * new result(string) gets appended in the previous string.
     *
     */
    public String wordCalculator(String str, int count , int flag)
    {
        int len;
        len = str.length();
        for(int i=1;i<=count;i++)
        {
            str = str.substring(len-1) + str.substring(0,len-1);
        }
        if(flag == 1) {
            str = str + ".";
            res = res + " " + str;
        }
        else
        {
            res = res + " "+ str;
        }
        return res;
    }
}
