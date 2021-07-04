package Test;

class matrix {

    public static void main(String[] args) {
        int[][] matrix = {
                {10, 12, 11},
                {9, 8, 31},
                {2, 16, 24},
                {2, 3, 5}
        };

        if (matrix.length == matrix[0].length) {

            int size = matrix.length - 1;
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][size - i] = 0;
            }

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }


        } else {
            System.out.println("no square");
        }
    }
}