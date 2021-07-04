package hw6;

import java.util.ArrayList;

public class MainClassList {
    public static void main(String[] args) {
        ArrayList<Integer> hwList = new ArrayList<Integer>();
        hwList.add(22);
        hwList.add(33);
        hwList.add(44);
        hwList.add(55);
        System.out.println(hwList.size());
        ArrayList<Integer> hwListReverse = new ArrayList<Integer>();

        for (int i = hwList.size() - 1; i >= 0; i--) {
            hwListReverse.add(hwList.get(i));
        }
        System.out.println(hwListReverse);
    }
}
