package lesson1;

import sun.lwawt.macosx.CSystemTray;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello!");
        int var1 = 5; //инициализация переменной
        int var2; //объявление переменной
        int res;
        var2 = 10;
//        res = var1 + var2;
//        System.out.println(res);
        Calc.sum(var1, var2);
        int var3 = 15;
//        int res1 = var1 + var3;
//        System.out.println(res1);
        Calc.sum(var1, var3);

        int result = Calc.sum(20, 25);
        Calc.sum(result, 35);

        Calc calc = new Calc(); //Calc - имя класса, calc - имя переменной
        calc.sum("test", "auto");

//        33, "55"

        calc.sumIntString(33,"55");

        calc.doubleSum(2,3);

    }
}
