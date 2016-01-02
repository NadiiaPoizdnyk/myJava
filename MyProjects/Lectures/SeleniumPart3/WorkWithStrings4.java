/** Slide #16
 Строки.  Полезные команды
    toLowerCase () ;
    toUpperCase ();
    replace (int old, int new);
    trim();
    Символ в строке indexOf(int ch)
    "Молоко", indexOf('о')

 ????   Подстрока в строке indexof (String sub)
 ????   Раскраска ".indexof ("рас")
 ????   delete (int begin, int end)
 ????   replace (int begin, int end, String str)
 */
public class WorkWithStrings4 {
    public static void main(String[]args){

        String s = ("      This is the best day in my life. ");
        String a = s.toUpperCase();
        String b = s.toLowerCase();
        //String c = s.replace("best ", "worst ");  - replaces all 'oldChar'
        int d = s.length();

        System.out.println(a); //upper case
        System.out.println(b); //lower case
        System.out.println(s.replace("best ", "worst ")); //System.out.println(c);
        System.out.println(s.trim()); //trimming
        System.out.println(d); //length
        System.out.println(s.indexOf('T')); //case sensitive

    }

}
