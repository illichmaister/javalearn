package lesson4;

public class MainClass {
    public static void main(String[] args) {
        // new String - объявляем новый объект
        String line = new String("test");
        System.out.println(line.toUpperCase());
        System.out.println(line.length());

        String line2 = " Test 2 ";
        System.out.println("'" + line2.trim() + "'");


        line2 = "Test";
        if (line.equalsIgnoreCase(line2)) {
            System.out.println("Eq");
        } else {
            System.out.println("Not eq");
        }


        String line3 = "test;test1;test3";
        System.out.println(line3.split(";")[2]);
        System.out.println(line3.replace(";", ","));
    }
}
