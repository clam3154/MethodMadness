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
    public static
}
