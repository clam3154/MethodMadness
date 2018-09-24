/**Calvin Lam 9/18/18
 *
 */
package CLam;

public class CLamLib
{
    public static void println(String str)
    {
        System.out.println(str);
    }
    /**Switch mm/dd/yyyy to dd-mm-yyyy
     *
     */
    public static String dateStr(String day)
    {

        String date = day.substring(3,5) + "-" + day.substring(0,2) + "-" + day.substring(6); //Rearrange the date format.
        System.out.println(date);
        return date;
    }
    /**Cuts out the second word from the first word
     *
     */
    public static String cutOut(String mainStr, String subStr)
    {

        String word = mainStr.substring(0, mainStr.indexOf(subStr)); //Takes the letters before the second word.
        word += mainStr.substring(subStr.length() + mainStr.indexOf(subStr)); //Take the letters after the second word.
        System.out.println(word);
        return word;
    }
    /**Sums of number up to num
     *
     */
    public static int sumUpTo(int num)
    {

        int result = 0;
        for(int i = num; i > 0; i--)
        {
            result += i; //Adds all the value from 0-num.
        }
        System.out.println(result);
        return result;
    }
    /**Checks if the num is a Fibonnaci number
     *
     */
    public static boolean isFibonnaci(int num)
    {
        int fib1 = 0;
        int fib2 = 1;
        while(fib1 <= num || fib2 <= num)
        {
            fib1 = fib1 + fib2; //First Fibbonnaci number.
            fib2 = fib1 + fib2; //Second Fibbonnaci number.
            if (num == fib1 || num == fib2 || num == 0) //Checks if num is a Fibonnaci number.
            {
                System.out.println(true);
                return true;
            }
        }
        System.out.println(false);
        return false;
    }
    /**Checks if a num is a Palindrome.
     *
     */
    public static boolean isPalindrome(String word)
    {
        String backward = "";
        for(int i = word.length(); i > 0; i--)
        {
            backward += word.substring(i-1,i); //Flips the word around.
        }
        if(backward.equals(word)) //Checks if it is a Palindrome
        {
            System.out.println(true);
            return true;
        }
        else
        {
            System.out.println(false);
            return false;
        }
    }

}
