package lesson3;

public class MainClass {
    public static int[] ourMassive = {2, 4, 26, 7, 28, 10, 9, 20, 33};

    public static void main(String[] args) {
        WorkWithMassive workWithMassive = new WorkWithMassive();
        workWithMassive.printMassive(ourMassive, 10);

        int[][] ourMassiveMassive = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};

        for (int i = 0; i < ourMassiveMassive.length; i++) {
            for (int j = 0; j < ourMassiveMassive[i].length; j++) {
                System.out.print(ourMassiveMassive[ourMassiveMassive[i].length-1][j]);
            }
            System.out.println();
        }
    }

}
