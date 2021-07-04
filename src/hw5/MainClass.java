package hw5;

public class MainClass {
    public static void main(String[] args) {
        WorkWithMassive workWithMassive = new WorkWithMassive();
        int[][] myArray = workWithMassive.createArray(2, 0, 8);
        WorkWithMassive.fillingOfLeftDiagonal(myArray, 5);
        WorkWithMassive.fillingOfRightDiagonal(myArray, 4);
        WorkWithMassive.fillingBothDiagonals(myArray, 9);
        WorkWithMassive.beautyArray(myArray);
    }
}
