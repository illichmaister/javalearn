package hw6;

public class MainClass {
    public static void main(String[] args) {
//        String str = new String("   Test_String ");
        String str = "   Test_String ";
//        String stringT = "t";
        String strBeauty = str.trim();
        System.out.println(strBeauty);
        System.out.println(strBeauty.substring(0, 4));
        if (strBeauty.substring(0, 1).equalsIgnoreCase("t")) {
            System.out.println("First symbol is 'T'");
        }
        System.out.println(strBeauty.replace("s","y"));
    }
}