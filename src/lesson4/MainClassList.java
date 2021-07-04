package lesson4;

import java.util.ArrayList;
import java.util.List;

public class MainClassList {
    public static void main(String[] args) {
        ArrayList<String> ourList = new ArrayList<String>();
        ourList.add("test");
        ourList.add("");
        ourList.add("test4");
        ourList.add("test4");
        System.out.println(ourList.get(2));
        System.out.println(ourList.size());

        for (String element: ourList) {
            System.out.println(element);
        }
        ourList.remove(2);
        System.out.println(ourList);

        for (int i = 0; i <ourList.size(); i++) {
            if (ourList.get(i).equals("test4")){
                System.out.println("index = " + i);
            }
        }
    }
}
