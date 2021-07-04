package hw5;

public class WorkWithMassive {
    public static void printArray(int[][] array, String name) {
        System.out.println(name);
        for (int t = 0; t < array.length; t++) {
            for (int y = 0; y < array[t].length; y++) {
                System.out.print(array[t][y]);
            }
            System.out.println();
        }
    }

    public static int[][] createArray(int inti, int intj, int intContent) {
        if (inti <= 1 && intj <= 1) {
            System.out.println("i and j cant be less 1");
            inti = 1;
            intj = 1;
        } else if (intj <= 1) {
            System.out.println("j cant be less 1");
            intj = 1;
        } else if (inti <= 1) {
            System.out.println("i cant be less 1");
            inti = 1;
        }
        int[][] hwArray = new int[inti][intj];
        System.out.println("Default:");

        for (int i = 0; i < hwArray.length; i++) {
            for (int j = 0; j < hwArray[i].length; j++) {
                hwArray[i][j] = intContent;
                System.out.print(hwArray[i][j]);
            }
            System.out.println();
        }


        return hwArray;

    }

    public static int[][] fillingOfLeftDiagonal(int[][] myArray, int changedNumber) {
        System.out.println("---");
// нужно ли создавать новую переменную?
//        int[][] leftDiagonal = myArray;
        if (myArray.length == myArray[0].length) {
            for (int k = 0; k < myArray.length; k++) {
                myArray[k][k] = changedNumber;
            }
        } else {
            System.out.println("Array is not square");
        }
        printArray(myArray, "Left:");
        return myArray;
    }

    public static int[][] fillingOfRightDiagonal(int[][] myArray, int changedNumber) {
        System.out.println("---");
//        int[][] rightDiagonal = myArray;

        if (myArray.length == myArray[0].length) {
            int size = myArray.length - 1;
            for (int k = 0; k < myArray.length; k++) {
                myArray[k][size - k] = changedNumber;
            }
        } else {
            System.out.println("Array is not square");
        }
        printArray(myArray, "Right:");
        return myArray;
    }

    public static int[][] fillingBothDiagonals(int[][] myArray, int changedNumber) {

//        int[][] bothDiagonals = myArray;
// вот здесь я чувствую что неправильно передаю параметры. не должны ли они быть относительными?
        fillingOfLeftDiagonal(myArray, changedNumber);
        fillingOfRightDiagonal(myArray, changedNumber);
// так как в методах выше вызывается метод для отобрадения матрицы, то они здесь также дублируются
        System.out.println("---");
        printArray(myArray, "Both:");
        return myArray;
    }

    public static int[][] beautyArray(int[][] myArray) {
        System.out.println("---");
        System.out.println("Beauty Array:");
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
        return myArray;
    }

}

    
