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
    public static String cutOut(String mainStr, String subStr)
    {
        String word = mainStr.substring(0, mainStr.indexOf(subStr));
        word += mainStr.substring(subStr.length() + mainStr.indexOf(subStr));
        System.out.println(word);
        return word;
    }
    public static int primePrinter(int num)
    {
        int result = 0;
        for(int i = num; i > 0; i--)
        {
            result += i;
        }
        System.out.println(result);
        return result;
    }
    public static int leastCommonMultiple(int num)
    {
        return num;
    }
    public static boolean isPalindrome(String word)
    {
        String backward = "";
        for(int i = word.length(); i > 0; i--)
        {
            backward += word.substring(i-1,i);
        }
        if(backward.equals(word))
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
