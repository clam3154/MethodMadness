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
    public static String dateStr(String day)
    {

        String date = day.substring(3,5) + "-" + day.substring(0,2) + "-" + day.substring(6);
        System.out.println(date);
        return date;
    }
    /**Switch mm/dd/yyyy to dd-mm-yyyy
    *
    */
    public static String cutOut(String mainStr, String subStr)
    {

        String word = mainStr.substring(0, mainStr.indexOf(subStr)); //Letters before the second word
        word += mainStr.substring(subStr.length() + mainStr.indexOf(subStr)); //Letters after the second word
        System.out.println(word);
        return word;
    }
    /**Cuts out the second word from the first word
    *
    */
    public static int sumUpTo(int num)
    {

        int result = 0;
        for(int i = num; i > 0; i--)
        {
            result += i;
        }
        System.out.println(result);
        return result;
    }
    /**Sums of number up to num
     *
     */
    public static boolean isFibonnaci(int num)
    {
        int fib1 = 0;
        int fib2 = 1;
        while(fib1 <= num || fib2 <= num)
        {
            fib1 = fib1 + fib2;
            fib2 = fib1 + fib2;
            if (num == fib1 || num == fib2 || num == 0) //Checks if num is a Fibonnaci number
            {
                System.out.println(true);
                return true;
            }
        }
        System.out.println(false);
        return false;
    }

    /**Fibonnaci sequence
     *
     */
    public static boolean isPalindrome(String word)
    {
        String backward = "";
        for(int i = word.length(); i > 0; i--)
        {
            backward += word.substring(i-1,i);
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
    /**Palindrome
     *
     */
}
