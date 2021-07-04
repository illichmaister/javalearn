package lesson2;

public class MainClass {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Calc calc = new Calc();
//        calc.sum(56, "3a5");
        System.out.println(calc.sum(57, "3a5"));
        System.out.println("-The end-");

        calc.sum(1.5, "2.5");
        try {
            calc.sum(1.6, "2..5");

        } catch (Exception e) {
            System.out.println("Error");
        }

        int[] age = {15, 20, 25, 30};
//        System.out.println(age);
        System.out.println("" + age[0] + age[1] + age[2] + age[3]);
        System.out.println(age.length);
        System.out.println(age[age.length - 1]);

        int[] ageNew = new int[10];
        System.out.println(ageNew[0]);

        System.out.println("-The end-");

        int counter = 0;
        for (int i = 0; i < ageNew.length; i++) {
            ageNew[i] = 10 * (i + 1);
            System.out.println(ageNew[i]);
            counter++;
            System.out.println("line = " + counter);
        }
    }

}
