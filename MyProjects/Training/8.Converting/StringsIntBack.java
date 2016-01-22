/**
 * The program translates
 * String data type --> Int data type --> (again) Strings d.t.
 */
public class StringsIntBack {
    public static void main(String[]args){
        // convert String into int and back

        String st[] = {"Saturday", "5", "Sunday", "2"};

        System.out.println(st[0] + "-" + st[1] + "," + st[2] + "-" + st[3]);

        int j = Integer.parseInt(st[1]); //int j = Integer.valueOf(st[1]);
        j++;
        st[1] = j +" ";  //st[1] = Integer.toString(j);
        int g = Integer.parseInt(st[3]); //int j = Integer.valueOf(st[3]);
        g = g + 5;
        st[3] = g + " ";  //st[1] = Integer.toString(g);

        System.out.println(st[0] + "-" + st[1] + "," + st[2] + "-" + st[3]);
    }
}
